# Build & Run Instructions

## Build
- ./gradlew assembleDebug assembleAndroidTest

## Run Tests
- ./gradlew connectedDebugAndroidTest

## Override Credentials
- ./gradlew connectedDebugAndroidTest -Pandroid.testInstrumentationRunnerArguments.username=youruser -Pandroid.testInstrumentationRunnerArguments.password=yourpass

## Troubleshooting
- Update R.id.* in page objects to match actual resource IDs
- Ensure device/emulator allows shell commands for permissions
- Pass correct username/password via runner arguments
- Place .feature files in androidTest/assets/features/
- Review explicit waits and idling resource registration
- Check logcat and test runner output for stack traces

## Usage Guidelines
- Add new BDD scenarios as .feature files
- Implement corresponding step definitions in Steps.java
- Update page objects with actual resource IDs
- Use utility classes for waits, permissions, device actions

## Maintenance
- Update resource IDs as UI changes
- Add new page objects and steps for new features
- Maintain Gradle dependencies as libraries update