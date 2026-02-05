# DSG iOS Automation Framework

## Build & Run Instructions

### Build
- Open the Xcode workspace/project.
- Ensure the test target is selected.
- Run `xcodebuild -scheme DSGApp -sdk iphonesimulator build-for-testing`

### Run Tests Locally
- Use Xcode Test Navigator or
- Run `xcodebuild test-without-building -destination 'platform=iOS Simulator,name=iPhone 15' -only-testing:DSGAppUITests`

### Run Tests via CI/CD
- Integrate with GitHub Actions, Jenkins, or Azure DevOps.
- Use `xcodebuild` commands as above in your pipeline YAML.
- Set environment variables for credentials and endpoints.

### Configuration
- Update `config/EnvironmentConfig.json` for environment, credentials, and device settings.
- Ensure all Accessibility Identifiers are set in the app source.

### Usage Guidelines
- 1:1 mapping between feature files and step definitions.
- Page Objects encapsulate UI logic, no assertions.
- Centralize waits in WaitUtils.
- Use PermissionUtils for location/notification handling.
- Secure credentials via config/environment variables.

### Maintenance
- Update Page Objects for UI changes.
- Refactor steps for reuse.
- Upgrade Xcode, Swift, XCUITest as needed.
- Maintain documentation.

### Troubleshooting
- Ensure iOS Simulator is running.
- Verify Accessibility Identifiers.
- Check Cucumberish/Cucumber Swift integration.
- Review logs and screenshots for failures.
