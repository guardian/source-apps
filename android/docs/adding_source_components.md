# Adding Source Components

Developers may wish to add components to our design system for use throughout the app. We have a separate repository for this called `source-apps`, which contains the Android and iOS components from a core library defined in Figma. The process to add components is outlined there, but is also here for reference.

## Outline

### 1. Verify Design Source of Truth

As a developer, you should refer to the apps library Figma file which contains all of our components here: [Apps library](https://www.figma.com/design/kSmjgtoTWiG8N7HXxFoGEE/%E2%97%90-Apps-library?node-id=103-89&p=f&t=b9BxsPXbamFK9Zkw-0)
We also have a Core library that defines core components: [Figma Core Library](https://www.figma.com/design/b2qv2OMLoNCYnP01ipfrP7/%E2%97%88-Core-library?node-id=4229-96590&t=Yx6Rt423B9TxRRqz-0)

### 2. Familiarize yourself with the source-apps repository structure

The `source-apps` repository contains the Android and iOS components. The Android source project is in the `android` module.
In the `source` module, note the folders components, foundation and daynight.
    - foundation contains icons (for icons), palette (for colours) and typography (for fonts and text styles).
    - components contains the UI components that we can use in our apps (from the Figma apps library).
    - daynight contains our `AppColourMode` wrapper for dark mode, which composable heirarchies should be wrapped in to enable dark mode support.

### 2. Code implementation

**Overview**

To implement a new component from the Figma Apps Library or core library, there are three steps
    1) Create the component (composable, preview and snapshot test)
    2) Add it to the sample (nav graph)
    3) Create or update the README and link from root README

Note: all PRs that make changes to system design components should be reviewed by a member of the design system team (in the PR review process or directly).

Once the component is implemented in the source library, you can do a preview release and use it in the android-news-app or feast apps. See [Here](https://github.com/guardian/source-apps/blob/main/android/RELEASING.md#preview-releases)
When the component is ready for release, you can do a production release as described [Here](https://github.com/guardian/source-apps/blob/main/android/RELEASING.md#production-release)

**Example Implementation steps**

- Checkout a new branch in the `source-apps` repository.
- Create a new Composable component in the source module, in the `components` folder:

  ```kotlin
  @Composable
  fun MyNewComponent(text: String) {
      // ...implementation
  }
  ```

- Create a preview for it in the sample module, in the `previews` directory:

  ```kotlin
  @Composable
  fun MyNewComponentPreview(onBack: () -> Unit) {
      MyNewComponent(text = "Hello, World!")
  }
  ```

- Add a snapshot test for the component (in a mirroring directory in the test directory):

  ```kotlin
  @Test
  fun newComponent() {
      paparazzi.snapshot {
          NewComponentPreview()
      }
  }
  ```

- Add a serializable destination for it in `Destination.kt`:

  ```kotlin
  @Serializable
  object NewComponentPreview : Destination
  ```

- Add an entry in `MainActivity` (this is how we are able to navigate to the component preview from the home screen):

  ```kotlin
  entry(Destination.NewComponentPreview) {
      NewComponentPreview(navigator::popBackStack)
  }
  ```

- Add a `SourceButton` to `Home` to add a button to navigate to the component when clicked:

  ```kotlin
  SourceButton(
      text = "Text buttons",
      priority = SourceButton.Priority.TertiaryOnWhite,
      onClick = { navigate(Destination.NewComponentPreview) },
  )
  ```