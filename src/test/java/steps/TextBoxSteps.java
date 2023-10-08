package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import selenium.methods.*;

public class TextBoxSteps {

	@Given("User is on Text Box page {string}")
	public void user_is_on_text_box_page(String systemURL) {
	    TextBoxMethods.launchBrowser(systemURL);
	} 

	
	
	@When("User enters his Fullname as {string}")
	public void user_enters_his_fullname_as(String fname) {
	    TextBoxMethods.enterFullName(fname);
	}

	@And("Email as {string}")
	public void email_as(String email) {
	    TextBoxMethods.enterEmail(email);
	}
	
	@When("Current Address as {string} and Permanent Address as {string}")
	public void current_address_as_and_permanent_address_as(String currentAddress, String permanentAddress) {
		TextBoxMethods.enterCurrentAddress(currentAddress);
		TextBoxMethods.enterPermanentAddress(permanentAddress);
	}

	@And("Clicks on the submit button")
	public void clicks_on_the_submit_button() {
		TextBoxMethods.clickSubmit(); 
	}

	@Then("Entered data should display below the form")
	public void entered_data_should_display_below_the_form() {
		TextBoxMethods.verifyOutput();	    
	}


}

