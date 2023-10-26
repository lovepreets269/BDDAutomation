package steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import selenium.methods.AlertsMethods;

public class AltSteps {


		private WebDriver driver;

		public AltSteps() {
			driver = Hooks.driver;

		}
		@Given("User is on Alert Page {string}")
		public void user_is_on_registration_page(String str) throws InterruptedException {
			AlertsMethods.startBrowser(driver, str);

		}
		
		@When("User clicks on Simple Alert")
		public void user_clicks_on_simple_alert() {
		   AlertsMethods.simpleAlert(driver);
		    
		}

		@And("User clicks on Time Based Alert")
		public void user_clicks_on_Time_Based_Alert() throws InterruptedException {
			AlertsMethods.timerAlert(driver);
		    
		}

		@And("User clicks on Confirmation Alert")
		public void user_clicks_on_the_confirmation_alert() throws InterruptedException {
		    AlertsMethods.confirmAlertsButton(driver);
		    
		}

		@And("User clicks on the Prompt Alert and Enters Value as {string}")
		public void user_clicks_on_the_Prompt_Alert_and_Enter_Text_as(String str) throws InterruptedException {
		   AlertsMethods.promptAlertButton(driver , str);
		    
		}
		
		
		
	}


