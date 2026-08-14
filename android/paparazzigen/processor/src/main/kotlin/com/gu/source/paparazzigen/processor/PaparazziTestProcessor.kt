package com.gu.source.paparazzigen.processor

import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.processing.SymbolProcessor
import com.google.devtools.ksp.processing.SymbolProcessorEnvironment
import com.google.devtools.ksp.processing.SymbolProcessorProvider
import com.google.devtools.ksp.symbol.ClassKind
import com.google.devtools.ksp.symbol.KSAnnotated
import com.google.devtools.ksp.symbol.KSAnnotation
import com.google.devtools.ksp.symbol.KSClassDeclaration
import com.google.devtools.ksp.symbol.KSDeclaration
import com.google.devtools.ksp.symbol.KSFile
import com.google.devtools.ksp.symbol.KSFunctionDeclaration
import com.google.devtools.ksp.symbol.KSType
import com.google.devtools.ksp.symbol.Modifier
import com.gu.source.paparazzigen.PaparazziTest
import com.gu.source.paparazzigen.RenderMode
import com.gu.source.paparazzigen.TestDevice
import com.gu.source.paparazzigen.TestFontScale
import com.gu.source.paparazzigen.TestNightMode
import com.gu.source.paparazzigen.TestOrientation
import java.io.File

internal const val OUTPUT_DIR_OPTION = "paparazzigen.outputDir"

private const val COMPOSABLE = "androidx.compose.runtime.Composable"

/** Registers [PaparazziTestProcessor] with KSP. */
class PaparazziTestProcessorProvider : SymbolProcessorProvider {
    override fun create(environment: SymbolProcessorEnvironment): SymbolProcessor =
        PaparazziTestProcessor(environment)
}

/**
 * Generates Paparazzi screenshot tests for functions annotated with
 * [com.gu.source.paparazzigen.PaparazziTest].
 *
 * Generated files are written directly to the directory given by the `paparazzigen.outputDir`
 * option, rather than through KSP's `CodeGenerator`, because `CodeGenerator` output is attached to
 * the main compilation whereas these tests belong to the unit test source set. The
 * `com.gu.source.paparazzigen` Gradle plugin sets that option and wires the directory into the
 * test source set.
 */
internal class PaparazziTestProcessor(private val environment: SymbolProcessorEnvironment) :
    SymbolProcessor {
    private val logger = environment.logger
    private var hasClearedOutput = false

    private val outputDir: File? by lazy {
        environment.options[OUTPUT_DIR_OPTION]?.let(::File)
    }

    override fun process(resolver: Resolver): List<KSAnnotated> {
        val annotationName = requireNotNull(PaparazziTest::class.qualifiedName)
        val symbols = resolver.getSymbolsWithAnnotation(annotationName).toList()
        val directory = outputDir

        if (directory == null) {
            if (symbols.isNotEmpty()) {
                logger.error(
                    "The $OUTPUT_DIR_OPTION option is not set. Apply the " +
                        "com.gu.source.paparazzigen Gradle plugin to this module.",
                )
            }
        } else {
            // Cleared on the first round rather than only when symbols are present, so that tests
            // for functions that are no longer annotated are removed.
            if (!hasClearedOutput) {
                directory.deleteRecursively()
                hasClearedOutput = true
            }
            generate(symbols, directory)
        }

        return emptyList()
    }

    private fun generate(symbols: List<KSAnnotated>, directory: File) {
        symbols.filterIsInstance<KSFunctionDeclaration>()
            .filter { it.isValidPreview() }
            .groupBy { it.containingFile }
            .forEach { (file, functions) ->
                if (file != null) {
                    writeTestFile(directory, file, functions)
                }
            }

        symbols.filterNot { it is KSFunctionDeclaration }.forEach {
            logger.error("@PaparazziTest can only be applied to functions.", it)
        }
    }

    private fun writeTestFile(
        directory: File,
        file: KSFile,
        functions: List<KSFunctionDeclaration>,
    ) {
        val sourceFileName = file.fileName

        // We name individual classes for previews with different configurations, so we group
        // by generated configuration here.
        val previewsByConfig = functions.groupBy { it.paparazziTestConfig() }

        val classes = previewsByConfig.entries
            .sortedBy { it.key.classNameSuffix }
            .map { (config, configFunctions) ->
                // Used to ensure unique names for generated test functions within this test class.
                val takenNames = mutableSetOf<String>()

                TestClass(
                    className = testClassName(
                        sourceFileName = sourceFileName,
                        config = config,
                        isOnlyConfigInFile = previewsByConfig.size == 1,
                    ),
                    config = config,
                    previews = configFunctions
                        .sortedBy { it.simpleName.asString() }
                        .map { function ->
                            val name = function.simpleName.asString()
                            val testName = testFunctionName(name, takenNames)
                            takenNames += testName
                            PreviewFunction(functionName = name, testName = testName)
                        },
                )
            }

        val testFile = TestFile(
            packageName = file.packageName.asString(),
            fileName = testFileName(sourceFileName),
            classes = classes,
        )

        val target = directory.resolve(
            testFile.packageName.replace('.', '/') + "/${testFile.fileName}.kt",
        )
        target.parentFile?.mkdirs()
        target.writeText(
            // This does all the work of generating the test file.
            testFile.toFileSpec().toString(),
        )
    }

    private fun KSFunctionDeclaration.isValidPreview(): Boolean {
        var valid = true

        fun reject(message: String) {
            logger.error("@PaparazziTest $message", this)
            valid = false
        }

        if (annotations.none { it.isOfType(COMPOSABLE) }) {
            reject("can only be applied to @Composable functions.")
        }
        if (Modifier.PRIVATE in modifiers) {
            reject("cannot be applied to private functions.")
        }
        if (parentDeclaration != null) {
            reject("can only be applied to top level functions.")
        }
        if (parameters.any { !it.hasDefault }) {
            reject("can only be applied to functions callable with no arguments.")
        }

        return valid
    }
}

private fun KSAnnotation.isOfType(qualifiedName: String) =
    annotationType.resolve().declaration.qualifiedName?.asString() == qualifiedName

private fun KSFunctionDeclaration.paparazziTestConfig(): TestConfig {
    val annotation = annotations.first {
        it.isOfType(requireNotNull(PaparazziTest::class.qualifiedName))
    }
    return TestConfig(
        nightMode = annotation.enumArgument("nightMode", TestNightMode.All),
        device = annotation.enumArgument("device", TestDevice.Phone),
        fontScale = annotation.enumArgument("fontScale", TestFontScale.Normal),
        orientation = annotation.enumArgument("orientation", TestOrientation.Portrait),
        renderMode = annotation.enumArgument("renderMode", RenderMode.Component),
    )
}

private inline fun <reified T : Enum<T>> KSAnnotation.enumArgument(name: String, default: T): T {
    val value = arguments.firstOrNull { it.name?.asString() == name }?.value ?: return default
    val entryName = value.enumEntryName() ?: return default
    return enumValues<T>().firstOrNull { it.name == entryName } ?: default
}

/**
 * KSP models enum annotation arguments differently across versions - as the type of the enum entry,
 * as the entry's declaration, or as a plain string - so handle all three.
 */
private fun Any.enumEntryName(): String? {
    val declaration = when (this) {
        is KSType -> declaration
        is KSDeclaration -> this
        else -> null
    }
    val name = if (declaration is KSClassDeclaration &&
        declaration.classKind == ClassKind.ENUM_ENTRY
    ) {
        declaration.simpleName.asString()
    } else {
        toString().substringAfterLast('.')
    }
    return name.takeIf { it.isNotBlank() }
}