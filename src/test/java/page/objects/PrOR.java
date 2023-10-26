package page.objects;

import org.openqa.selenium.By;

public class PrOR {
	
	public static final By FIRSTNAME = By.id("firstName");
	public static final By LASTNAME = By.id("lastName");
	public static final By EMAIL = By.id("userEmail");
	
	
	public static final By GENDER_MALE = By.id("gender-radio-1");
	public static final By GENDER_FEMALE = By.id("gender-radio-2");
	public static final By GENDER_OTHERS = By.id("gender-radio-3");
	
	
	public static final By MOBILE = By.id("userNumber");
	
	public static final By DATEPICKER = By.className("react-datepicker-wrapper");
	public static final By DATE_MONTH = By.className("react-datepicker__month-select");
	public static final By DATE_YEAR = By.className("react-datepicker__year-select");
	public static final By DATE  = By.className("react-datepicker__day");
	
	
	public static final By SUBJECTS = By.cssSelector(".subjects-auto-complete__value-container input");
	
	
	public static final By SPORTS = By.id("hobbies-checkbox-1");
	public static final By READING = By.id("hobbies-checkbox-2");
	public static final By MUSIC = By.id("hobbies-checkbox-3");
	
	
	public static final By AUTOSUGGESTION_OPTIONS = By.xpath("//div[@id='react-select-2-option-0']");
	
	public static final By AUTOSUGGESTION = By.cssSelector(".subjects-auto-complete__value-container input");

	
	public static final By CURRENTADDRESS = By.id("currentAddress");
	
	
	public static final By UPLOAD_IMAGE = By.id("uploadPicture");
	public static final By STATE = By.id("state");
	public static final By STATE_VALUE = By.id("react-select-3-option-0");

	public static final By CITY = By.id("city");
	public static final By CITY_VALUE = By.id("react-select-4-option-1");

	public static final By SUBMIT = By.id("submit");

	public static final By CONFIRMATION_POPUP = By.id("closeLargeModal");


}
