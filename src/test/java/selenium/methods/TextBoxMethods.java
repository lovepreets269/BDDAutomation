package selenium.methods;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import page.objects.TestBoxOR;


public class TextBoxMethods {
	public static Logger Logger = LogManager.getLogger(TextBoxMethods.class);

	public static WebDriver driver;

	public static void launchBrowser(String systemURL)
	{
		try {
			WebDriverManager.chromedriver().setup();
			//WebDriverManager.firefoxdriver().setup();
			//WebDriverManager.edgedriver().setup();

			//driver.get("https://demoqa.com/text-box");
			
			ChromeOptions cr = new ChromeOptions();
			
			cr.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(cr);
			driver.get(systemURL); 
		} catch (TimeoutException e) {
			// TODO: handle exception
		}
		
		
	}
	 
	public static void enterFullName(String fullname)
	{
		try {
			driver.findElement(TestBoxOR.FULL_NAME).sendKeys(fullname);
			
		} catch (NoSuchElementException e) {
			// TODO: handle exception
		}
		Logger.info("enterFullName is successfully executed");
	}
	
	public static void enterEmail(String userEmail)
	{
		try {
			driver.findElement(TestBoxOR.EMAIL).sendKeys(userEmail);

		} catch (Exception e) {
			// TODO: handle exception
		}
		Logger.info("enterEmail is successfully executed");

	}
	
	public static void enterCurrentAddress(String cAdddress)
	{
		try {
			driver.findElement(TestBoxOR.CURRENT_ADDRESS).sendKeys(cAdddress);

		} catch (Exception e) {
			// TODO: handle exception
		}
		Logger.info("enterCurrentAddress is successfully executed");

	} 
	
	public static void enterPermanentAddress(String pAddress)
	{
		try {
			driver.findElement(TestBoxOR.PERMANENT_ADDRESS).sendKeys(pAddress);

		} catch (Exception e) {
			// TODO: handle exception
		}
		Logger.info("enterPermanentAddress is successfully executed");

	}
	
	public static void clickSubmit()
	{
		try {
			driver.findElement(TestBoxOR.SUBMIT).click();

		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
		}
		Logger.info("clickSubmit is successfully executed");

	}
	
	public static void verifyOutput()
	{
		boolean output = driver.findElement(TestBoxOR.FORM_OUTPUT).isDisplayed();
		if(output == true)
		{
			System.out.println("Test Passed");
		}
		Logger.info("verifyOutput is successfully executed");

	}
}
