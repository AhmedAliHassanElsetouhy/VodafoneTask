package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/features/Registration.feature",
		"src/test/java/features/CartCheckout.feature"},
tags = "@Sanity", 
glue = "src/test/java/steps", 
plugin = { "pretty",
		"html:target/reports/report.html", 
		"json:target/reports/report.json" }
)
// , dryRun = true
public class TestRunner {
}