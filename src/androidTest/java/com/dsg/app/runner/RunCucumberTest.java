package com.dsg.app.runner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "features",
    glue = {"com.dsg.app.steps", "com.dsg.app.hooks"},
    plugin = {"pretty", "html:target/cucumber-html-report"}
)
public class RunCucumberTest {
    // No code needed
}
