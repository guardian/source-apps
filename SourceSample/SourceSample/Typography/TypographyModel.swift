//
//  TypographyModel.swift
//  SourceSample
//
//  Created by Benjamin Briggs on 30/06/2025.
//

import Foundation
import Source
import GuardianFonts

struct TypographySection {
    let name: String
    let fonts: [TypographyData]
}

struct TypographyData {
    let name: String
    let fontDescriptor: String
    let font: GuardianFont
}

struct TypographyModel {
    let sections = [
        TypographySection(
            name: "Guardian Titlepiece",
            fonts: [
                TypographyData(
                    name: "Titlepiece 70",
                    fontDescriptor: "Typography.titlepiece70",
                    font: Typography.titlepiece70
                ),
                TypographyData(
                    name: "Titlepiece 50",
                    fontDescriptor: "Typography.titlepiece50",
                    font: Typography.titlepiece50
                ),
                TypographyData(
                    name: "Titlepiece 42",
                    fontDescriptor: "Typography.titlepiece42",
                    font: Typography.titlepiece42
                )
            ]
        ),
        TypographySection(
            name: "Guardian Headline",
            fonts: [
                TypographyData(
                    name: "Headline Bold 50",
                    fontDescriptor: "Typography.headlineBld50",
                    font: Typography.headlineBld50
                ),
                TypographyData(
                    name: "Headline Bold 42",
                    fontDescriptor: "Typography.headlineBld42",
                    font: Typography.headlineBld42
                ),
                TypographyData(
                    name: "Headline Bold 34",
                    fontDescriptor: "Typography.headlineBld34",
                    font: Typography.headlineBld34
                ),
                TypographyData(
                    name: "Headline Bold 28",
                    fontDescriptor: "Typography.headlineBld28",
                    font: Typography.headlineBld28
                ),
                TypographyData(
                    name: "Headline Bold 24",
                    fontDescriptor: "Typography.headlineBld24",
                    font: Typography.headlineBld24
                ),
                TypographyData(
                    name: "Headline Bold 22",
                    fontDescriptor: "Typography.headlineBld22",
                    font: Typography.headlineBld22
                ),
                TypographyData(
                    name: "Headline Bold 20",
                    fontDescriptor: "Typography.headlineBld20",
                    font: Typography.headlineBld20
                ),
                TypographyData(
                    name: "Headline Bold 18",
                    fontDescriptor: "Typography.headlineBld18",
                    font: Typography.headlineBld18
                ),
                TypographyData(
                    name: "Headline Bold 17",
                    fontDescriptor: "Typography.headlineBld17",
                    font: Typography.headlineBld17
                ),
                TypographyData(
                    name: "Headline Bold 16",
                    fontDescriptor: "Typography.headlineBld16",
                    font: Typography.headlineBld16
                ),
                TypographyData(
                    name: "Headline Bold 15",
                    fontDescriptor: "Typography.headlineBld15",
                    font: Typography.headlineBld15
                ),
                TypographyData(
                    name: "Headline Bold 14",
                    fontDescriptor: "Typography.headlineBld14",
                    font: Typography.headlineBld14
                )
            ]
        ),
        TypographySection(
            name: "Guardian Text Egyptian",
            fonts: [
                TypographyData(
                    name: "Text Egyptian 17",
                    fontDescriptor: "Typography.textEgyp17",
                    font: Typography.textEgyp17
                ),
                TypographyData(
                    name: "Text Egyptian 15",
                    fontDescriptor: "Typography.textEgyp15",
                    font: Typography.textEgyp15
                ),
                TypographyData(
                    name: "Text Egyptian 14",
                    fontDescriptor: "Typography.textEgyp14",
                    font: Typography.textEgyp14
                ),
                TypographyData(
                    name: "Text Egyptian Bold 17",
                    fontDescriptor: "Typography.textEgypBld17",
                    font: Typography.textEgypBld17
                ),
                TypographyData(
                    name: "Text Egyptian Bold 15",
                    fontDescriptor: "Typography.textEgypBld15",
                    font: Typography.textEgypBld15
                ),
                TypographyData(
                    name: "Text Egyptian Bold 14",
                    fontDescriptor: "Typography.textEgypBld14",
                    font: Typography.textEgypBld14
                ),
                TypographyData(
                    name: "Text Egyptian Italic 17",
                    fontDescriptor: "Typography.textEgypIta17",
                    font: Typography.textEgypIta17
                ),
                TypographyData(
                    name: "Text Egyptian Italic 15",
                    fontDescriptor: "Typography.textEgypIta15",
                    font: Typography.textEgypIta15
                ),
                TypographyData(
                    name: "Text Egyptian Italic 14",
                    fontDescriptor: "Typography.textEgypIta14",
                    font: Typography.textEgypIta14
                )
            ]
        ),
        TypographySection(
            name: "Guardian Text Sans",
            fonts: [
                TypographyData(
                    name: "Text Sans 34",
                    fontDescriptor: "Typography.textSans34",
                    font: Typography.textSans34
                ),
                TypographyData(
                    name: "Text Sans 28",
                    fontDescriptor: "Typography.textSans28",
                    font: Typography.textSans28
                ),
                TypographyData(
                    name: "Text Sans 24",
                    fontDescriptor: "Typography.textSans24",
                    font: Typography.textSans24
                ),
                TypographyData(
                    name: "Text Sans 20",
                    fontDescriptor: "Typography.textSans20",
                    font: Typography.textSans20
                ),
                TypographyData(
                    name: "Text Sans 17",
                    fontDescriptor: "Typography.textSans17",
                    font: Typography.textSans17
                ),
                TypographyData(
                    name: "Text Sans 15",
                    fontDescriptor: "Typography.textSans15",
                    font: Typography.textSans15
                ),
                TypographyData(
                    name: "Text Sans 14",
                    fontDescriptor: "Typography.textSans14",
                    font: Typography.textSans14
                ),
                TypographyData(
                    name: "Text Sans 12",
                    fontDescriptor: "Typography.textSans12",
                    font: Typography.textSans12
                ),
                TypographyData(
                    name: "Text Sans 11",
                    fontDescriptor: "Typography.textSans11",
                    font: Typography.textSans11
                )
            ]
        )
    ]
}
