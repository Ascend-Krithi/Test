# Build & Run Instructions

## Build
- ./gradlew assembleDebug assembleAndroidTest

## Run All Scenarios
- ./gradlew connectedAndroidTest

## Run with Arguments (e.g., credentials)
- adb shell am instrument -w \n  -e cucumberOptions "--tags @smoke" \n  -e username "testuser" \n  -e password "testpass" \n  com.dsg.app.test/androidx.test.runner.AndroidJUnitRunner

## Troubleshooting
- Ensure emulator/device is running
- Disable animations on device
- Verify Espresso Idling Resources are registered

## Usage Guidelines
- Follow 1:1 mapping between feature files and step definitions
- Keep Page Objects free of assertions
- Centralize waits using WaitUtils
- Use InstrumentationRegistry.getArguments() for credentials and test data

## Maintenance
- Update resource IDs as UI changes
- Add new Page Objects for new screens
- Extend step definitions for new scenarios
