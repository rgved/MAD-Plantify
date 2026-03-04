# Plantify (Android Studio Project)

This repository contains an Android Studio project (Java + XML).

## Project structure
- `settings.gradle`
- `build.gradle` (project)
- `gradle.properties`
- `gradlew`, `gradlew.bat`, `gradle/wrapper/*`
- `app/build.gradle`
- `app/src/main/AndroidManifest.xml`
- `app/src/main/java/com/mad/plantify/*.java`
- `app/src/main/res/**`

## Build-readiness checks and likely issues
1. **JDK version mismatch**
   - Android Gradle Plugin `8.4.2` in this repo expects a supported JDK (recommended JDK 17 in Android Studio for this setup).
   - Using unsupported JDK versions can fail during Gradle script evaluation.

2. **Gradle wrapper download/network**
   - First run of `./gradlew` downloads Gradle from `services.gradle.org`.
   - If your network/proxy blocks it, build sync will fail until network is available or mirror/proxy is configured.

3. **Android SDK not installed/accepted licenses**
   - Build requires installed Android SDK Platform 34 + build tools and accepted SDK licenses.

## Open in Android Studio
1. Open Android Studio.
2. Select **Open** and choose this repository folder.
3. Set **Gradle JDK = 17** (if prompted).
4. Let Gradle sync complete.
5. Run the `app` module on emulator/device.

## PR platform note (binary files)
- Some PR/review platforms reject binary files in generated diffs (for example `gradle/wrapper/gradle-wrapper.jar`).
- If your PR tool shows **"Binary files are not supported"**, keep only `gradle-wrapper.properties` in git and regenerate the jar locally when needed by running:
  - `gradle wrapper` (with a compatible local Gradle/JDK), or
  - Android Studio sync / wrapper regeneration workflow.
