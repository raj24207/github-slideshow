# Simple Video Feed UI Prototype (Android)

This project is a basic Android application prototype that displays a simple scrollable video feed UI. It's built using Kotlin and uses a RecyclerView to display a list of placeholder video items.

## Prerequisites

*   Android Studio (latest stable version recommended) or Android SDK command-line tools.
*   An Android device or emulator (API level 21 or higher).

## How to Build and Run

### Using Android Studio

1.  **Open the Project:**
    *   Open Android Studio.
    *   Select "Open an Existing Project".
    *   Navigate to the root directory of this project and select it.
    *   Android Studio will automatically sync the Gradle project. This might take a few minutes.

2.  **Run the App:**
    *   Once Gradle sync is complete, select an Android device or emulator from the target device dropdown.
    *   Click the "Run" button (green play icon) or select "Run" > "Run 'app'" from the menu.
    *   Android Studio will build the app, install it on the selected device/emulator, and launch the `MainActivity`. You should see a list of video items with placeholder thumbnails and text.

### Using Command Line (Gradle Wrapper)

1.  **Navigate to Project Root:**
    Open your terminal or command prompt and navigate to the root directory of this project.

2.  **Make Gradle Wrapper Executable (if needed):**
    On Linux or macOS:
    ```bash
    chmod +x ./gradlew
    ```

3.  **Build the App:**
    ```bash
    ./gradlew assembleDebug
    ```
    This command compiles the application and creates a debug APK. The APK will be located in `app/build/outputs/apk/debug/`.

4.  **Install the App:**
    If you have an emulator running or a device connected, you can install the APK using ADB (Android Debug Bridge):
    ```bash
    adb install app/build/outputs/apk/debug/app-debug.apk
    ```
    (Ensure `adb` is in your system's PATH.)

5.  **Launch the App:**
    You can launch the app manually from the device/emulator's app drawer (it will be named "VideoApp"), or use an adb command if you know the main activity:
    ```bash
    adb shell am start -n com.example.videoapp/.MainActivity
    ```

## Project Structure

*   `app/src/main/java/com/example/videoapp/`: Contains the Kotlin source code.
    *   `MainActivity.kt`: The main screen of the app, displays the video feed.
    *   `VideoItem.kt`: Data class for video objects.
    *   `VideoFeedAdapter.kt`: RecyclerView adapter to display video items.
*   `app/src/main/res/`: Contains application resources.
    *   `layout/activity_main.xml`: Layout for the main screen (contains RecyclerView).
    *   `layout/video_item.xml`: Layout for a single video item in the feed.
    *   `values/`: XML files for strings, colors, themes.
*   `app/src/main/AndroidManifest.xml`: Application manifest file.
*   `build.gradle` (project level and app level): Gradle build scripts.

## Notes

*   This is a UI prototype. Video playback is not implemented. Thumbnail images are placeholders.
*   The video data is currently hardcoded in `MainActivity.kt`.
