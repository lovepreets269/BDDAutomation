package steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import selenium.methods.PrMethods;


public class PrSteps {
	
	
	private WebDriver driver;
	
	public  PrSteps()
	{
		driver = Hooks.driver;
	}
	
//	@Given("User is on registration page {string}")
//	public void user_is_on_registration_page(String str) {
//		PrMethods.launchBrowser(driver, str);
//
//	}
//
//	@And("User enters firstName as {string}, Last name as {string} and email as {string}")
//	public void user_enters_first_name_as_last_name_as_and_email_as(String fname, String lname, String email) {
//		PrMethods.enter_fname_lname_email(driver, fname, lname, email);
//
//	}
//
//	@When("User click on gender as {string}")
//	public void user_click_on_gender_as(String string) {
//		PrMethods.selectGender(driver);
//
//	}
//
//	@And("Enter Mobile number as {string}")
//	public void enter_mobile_number_as(String string) {
//		PrMethods.selectGender(driver);
//
//	}
//
//	@And("User Enters Subject as {string}, Hobbies as {string}, Select Date and address as {string}")
//	public void user_enters_subject_as_hobbies_as_select_date_and_address_as(String hob, String sub, String caddress) throws InterruptedException {
//		PrMethods.enterSubject(driver, sub);
//		PrMethods.selectHobbies(driver,hob);
//		PrMethods.selectDate(driver);
//		PrMethods.enterAddress(driver, caddress);
//	}
//
//	@And("Upload the picture")
//	public void upload_the_picture() throws InterruptedException {
//		PrMethods.uploadImage(driver);
//
//	}
//
//	@And("Select state as {string} and city as {string}")
//	public void select_state_as_and_city_as(String state, String city) {
//		PrMethods.selectState(driver, state);
//		PrMethods.selectcity(driver, city);
//	}
//
//	@And("Click on the submit button")
//	public void click_on_the_submit_button() throws InterruptedException {
//		PrMethods.Submit(driver);
//
//	}
//
//	@Then("User should register successfully into the portal")
//	public void user_should_register_successfully_into_the_portal() throws InterruptedException {
//		PrMethods.confirmRegister(driver);
//
//
//	}
//
//
//
}
