# Build & Run Instructions

## Build
- ./gradlew assembleAndroidTest

## Run Tests
- ./gradlew connectedAndroidTest

## Runner Arguments
- Pass credentials via testInstrumentationRunnerArguments (username, password)

## Troubleshooting
- Ensure emulator/device is running
- Disable animations on device
- Verify Espresso Idling Resources are registered
- Check resource IDs in Page Objects

## Usage Guidelines
- Follow 1:1 mapping between feature files and step definitions
- Keep Page Objects free of assertions
- Centralize waits using WaitUtils
- Use PermissionUtils for location and notification permissions

## Maintenance
- Update resource IDs as app evolves
- Extend Page Objects and Steps for new scenarios
- Review Gradle dependencies for updates
