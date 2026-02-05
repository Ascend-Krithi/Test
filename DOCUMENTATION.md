# DSG iOS Automation Framework

## Build & Run Instructions

### Build
xcodebuild -scheme DSGApp -sdk iphonesimulator build-for-testing

### Run Tests (Local)
xcodebuild test-without-building -destination 'platform=iOS Simulator,name=iPhone 15' -only-testing:DSGTestTarget

### Run Tests (CI/CD)
- Jenkins: Use xcodebuild steps above in Jenkinsfile
- Azure DevOps: Use YAML pipeline with xcodebuild commands
- GitHub Actions: Use macos-latest runner, xcodebuild commands

### Troubleshooting
- Ensure iOS Simulator is running
- Verify Accessibility Identifiers in app source
- Check Cucumberish is linked in Test Target
- Review EnvironmentConfig.json for credentials

### Usage Guidelines
- 1:1 mapping between feature files and step definitions
- Page Objects should not contain assertions
- Centralize waits with WaitUtils
- Use EnvironmentConfig.json for sensitive data

### Maintenance
- Update page objects for UI changes
- Refactor step definitions for reuse
- Upgrade Xcode, Swift, XCUITest as needed
- Maintain documentation and coding standards
