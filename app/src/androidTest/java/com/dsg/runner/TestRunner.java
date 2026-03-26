package com.dsg.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/androidTest/resources/features",
        glue = {"com.dsg.stepdefinitions", "com.dsg.hooks"},
        plugin = {"pretty", "html:target/cucumber-reports"}
)
public class TestRunner {
}
