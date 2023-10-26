package selenium.methods;

import java.time.Duration;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import page.objects.PrOR;



public class PrMethods {
	
	public static String filepath = "TestData/newpik.jpg";
	
	final static Logger logger = LogManager.getLogger(PrMethods.class);
	
	public static void launchBrowser(WebDriver driver, String url)
	{
		try {
			driver.get(url);
		} catch (Exception e) {
			logger.info("URL is taking time to load", e);
		}
		logger.info("Browser is launched successfully");
	}
	
	public static void enter_fname_lname_email(WebDriver driver, String fname, String lname, String email)
	{
		try {
			driver.findElement(PrOR.FIRSTNAME).sendKeys(fname);
			driver.findElement(PrOR.LASTNAME).sendKeys(lname);
			driver.findElement(PrOR.EMAIL).sendKeys(email);
		} catch (NoSuchElementException e) {
			logger.info( "Not able to locate firstname, lastname and email Text Box", e);
		}catch (TimeoutException e) {
			logger.info("Timeout Exception in first name,last name and email", e);
		}
		logger.info("First name,Last name and email is entered successfully");

	}
	
	public static void enterAddress(WebDriver driver,String caddress)
	{
		try {
			driver.findElement(PrOR.CURRENTADDRESS).sendKeys(caddress);
		} catch (NoSuchElementException e) {
			logger.info( "Not able to locate Current Address", e);
		}catch (TimeoutException e) {
			logger.info("Timeout Exception in Current Address", e);
		}
		logger.info("Current Address is entered successfully");

	}
	
	public static void enterPhoneNumber(WebDriver driver,String phonenumber)
	{
		try {
			driver.findElement(PrOR.MOBILE).sendKeys(phonenumber);;
		} catch (NoSuchElementException e) {
			logger.info( "Not able to locate PhoneNumber", e);
		}catch (TimeoutException e) {
			logger.info("Timeout Exception in PhoneNumber", e);
		}
		logger.info("PhoneNumber is entered successfully");

	}
	
	public static void selectGender(WebDriver driver)
	{
		try {
			WebElement gender = driver.findElement(PrOR.GENDER_MALE);
			Actions actions = new Actions(driver);
			actions.moveToElement(gender).click().build().perform();
		} catch (NoSuchElementException e) {
			System.out.println("Unable to locate element" + e);
		}catch (TimeoutException e) {
			e.printStackTrace();
		}
	}
	
	public static void confirmRegister(WebDriver driver) throws InterruptedException
	{
		try {
			WebElement element = driver.findElement(PrOR.CONFIRMATION_POPUP);
			Actions actions = new Actions(driver);
			Thread.sleep(1000);
			actions.moveToElement(element).click().build().perform();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}
	
	public static void enterSubject(WebDriver driver, String sub) throws InterruptedException
	{
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			
			WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(PrOR.AUTOSUGGESTION));
			
			ele.sendKeys(sub);
			Thread.sleep(1000);
			driver.findElement(PrOR.AUTOSUGGESTION_OPTIONS).click();
		} catch (NoSuchElementException e) {
			System.out.println("Unable to locate element" + e);
		} catch (TimeoutException e) {
			e.printStackTrace();

		}
	}
	
	public static void selectHobbies(WebDriver driver, String hob)
	{
		try {
			System.out.println(hob);
//			JavascriptExecutor jse = (JavascriptExecutor) driver;
//			jse.executeScript("window.scrollBy(0,250)");

			// If you dont use the scroldown code , it is opening the google ad
			WebElement element = driver.findElement(PrOR.SPORTS);
			Actions actions = new Actions(driver);
			actions.moveToElement(element).click().build().perform();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		} catch (NoSuchElementException e) {
			System.out.println("Unable to locate element" + e);
		} catch (TimeoutException e) {
			e.printStackTrace();
		}
	}
	
	public static void selectDate(WebDriver driver) {
		try {
			WebElement element = driver.findElement(PrOR.DATEPICKER);
			Actions actions = new Actions(driver);
			actions.moveToElement(element).click().build().perform();

			Select month = new Select(driver.findElement(PrOR.DATE_MONTH));
			month.selectByIndex(0);

			Select year = new Select(driver.findElement(PrOR.DATE_YEAR));
			year.selectByValue("2023");

			List<WebElement> day = driver.findElements(PrOR.DATE);

			for (WebElement myday : day) {
				System.out.println(myday);
				myday.click();
				break;
			}

		} catch (NoSuchElementException e) {
			System.out.println("Unable to locate element" + e);
		} catch (TimeoutException e) {
			e.printStackTrace();

		}
	}

	public static void uploadImage(WebDriver driver) throws InterruptedException {
		try {
			WebElement UploadImg = driver.findElement(PrOR.UPLOAD_IMAGE);

			Thread.sleep(3000);

			UploadImg.sendKeys(new java.io.File(filepath).getAbsolutePath());

			Thread.sleep(3000);
		} catch (NoSuchElementException e) {
			System.out.println("Unable to locate element" + e);
		} catch (NoSuchWindowException e) {
			e.printStackTrace();

		}
	}

	public static void selectState(WebDriver driver, String state) {
		try {

			WebElement element = driver.findElement(PrOR.STATE);
			Actions actions = new Actions(driver);
			actions.moveToElement(element).click().build().perform();

			WebElement se = driver.findElement(PrOR.STATE_VALUE);
			se.click();
			System.out.println("Entered state as " + state);
		} catch (NoSuchElementException e) {
			System.out.println("Unable to locate element" + e);
		} catch (TimeoutException e) {
			e.printStackTrace();

		}
	}

	public static void selectcity(WebDriver driver, String city) {
		try {
			driver.findElement(PrOR.CITY).click();
			WebElement se = driver.findElement(PrOR.CITY_VALUE);
			se.click();
			System.out.println("Entered city as" + city);
		} catch (NoSuchElementException e) {
			System.out.println("Unable to locate element" + e);
		} catch (TimeoutException e) {
			e.printStackTrace();

		}
	}
	
	public static void Submit(WebDriver driver) throws InterruptedException
	{
		try {
			WebElement element = driver.findElement(PrOR.SUBMIT);
			Actions actions = new Actions(driver);
			Thread.sleep(1000);
			actions.moveToElement(element).click().build().perform();
		} catch (NoSuchElementException e) {
			System.out.println("Unable to locate Submit Button on Practise form" + e);
		}catch(TimeoutException e){
			e.printStackTrace();;
		}
		
	}

	
	
	

}
