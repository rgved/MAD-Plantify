# Plantify (Android Studio Project)

This repository contains an Android Studio-ready project template for a **Java + XML Android app**.  
It was converted from a Google AI Studio / Vite TypeScript starter.

## Project Structure
- `settings.gradle`
- `build.gradle` (project)
- `gradle.properties`
- `gradlew`, `gradlew.bat`, `gradle/wrapper/*`
- `app/build.gradle`
- `app/src/main/AndroidManifest.xml`
- `app/src/main/java/com/mad/plantify/*.java`
- `app/src/main/res/layout/*.xml`
- `app/src/main/res/menu/bottom_nav_menu.xml`
- `app/src/main/res/values/*`
- `app/src/main/res/color/bottom_nav_selector.xml`
- `app/src/main/res/drawable/card_bg.xml`

## Open in Android Studio
1. Open Android Studio.
2. Click **Open** and select this repository folder.
3. Set **Gradle JDK = 17** if prompted.
4. Allow Gradle sync to complete.
5. Run the `app` module on an emulator or device.

## Features
- `MainActivity` with bottom navigation
- Four fragments:
  - Home
  - Identify
  - Care
  - Shop
- XML-based layouts in `app/src/main/res/layout`

## Build Notes
- Android Gradle Plugin `8.4.2` works best with **JDK 17**.
- First Gradle sync will download dependencies from `services.gradle.org`.
- Ensure Android SDK Platform 34 and build tools are installed.

## Migration Notes
The original repository did not contain the full React/TypeScript source code (`src/` folder and components), so a direct feature-by-feature migration was not possible.

Instead, this project provides an Android Studio starter structure that can be extended with:
- Networking (Retrofit / OkHttp)
- ViewModels + repository pattern
- Camera + image upload for plant identification
- Local persistence (Room / DataStore)
- Shop and product browsing features