package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/Features/TextBox.feature",glue = "steps",plugin= {
		"json:target/cucumber-reports/Cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, tags ="@Smoke")

public class RunProject extends AbstractTestNGCucumberTests {

}
