package com.api.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json"},
        features = "src/test/resources/features", glue = "com.bikeapi.steps")
public class RunCucumberAPITest {
}
