# DSG iOS Automation Framework

## Build Instructions
- Open Xcode project
- Ensure Swift 5.x, XCUITest, Cucumberish dependencies are installed
- xcodebuild -scheme DSGApp -sdk iphonesimulator build-for-testing

## Run Tests
- xcodebuild test-without-building -destination 'platform=iOS Simulator,name=iPhone 15' -only-testing:DSGTestTarget

## CI/CD Integration
- Sample YAML for GitHub Actions, Jenkins, Azure DevOps included in config/
- Use EnvironmentConfig.json for credentials and environment settings

## Usage Guidelines
- 1:1 mapping between feature files and step definitions
- Page Objects use Accessibility Identifiers (update TODOs as needed)
- Utilities for waits, permissions, device actions, logging
- Hooks for setup/teardown and screenshot capture

## Troubleshooting
- Ensure Accessibility Identifiers are set in app source
- Validate EnvironmentConfig.json for credentials
- Check Cucumberish integration in test target

## Maintenance
- Update page objects for UI changes
- Refactor step definitions for reuse
- Upgrade dependencies as needed
