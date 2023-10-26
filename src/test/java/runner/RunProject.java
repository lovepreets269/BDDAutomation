package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/Features/Alt.feature",glue = "steps",plugin= {
		"json:target/Cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, tags ="@Smoke")

public class RunProject extends AbstractTestNGCucumberTests {

}
