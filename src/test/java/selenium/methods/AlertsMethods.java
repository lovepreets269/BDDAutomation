package selenium.methods;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

import page.objects.AlertsOR;

public class AlertsMethods {
	
	final static Logger logger = LogManager.getLogger(AlertsMethods.class);

	public static void startBrowser(WebDriver driver, String url)
	{
		try {
			driver.get(url);
		} catch (Exception e) {
			logger.info("URL is taking time to load", e);
		}
		logger.info("Browser is launched successfully");
	}
	
	public static void simpleAlert(WebDriver driver) 
	{
		try {
			driver.findElement(AlertsOR.SIMPLE_ALERT).click();
			driver.switchTo().alert().accept();
		} catch (NoAlertPresentException e) {
			logger.info("No Such Simple Alert is Present", e);
		}
		logger.info("User Successfully clicked on the Simple Alerts Button");
	}
	
	
	public static void timerAlert(WebDriver driver) throws InterruptedException
	{
		try {
			driver.findElement(AlertsOR.TIMER_ALERT).click();
			Thread.sleep(6000);
			driver.switchTo().alert().accept();
		} catch (NoAlertPresentException e) {
			logger.info("No Such Alert is Present", e);
		}
		logger.info("User Successfully clicked on the Timer Alerts Button");
	}
	
	public static void confirmAlertsButton(WebDriver driver) 
	{
		try {
			driver.findElement(AlertsOR.CONFIRM_ALERT).click();
			driver.switchTo().alert().dismiss();
		} catch (NoAlertPresentException e) {
			logger.info("No Such Alert is Present",e);
		}
		logger.info("User Successfully clicked on the Confirm Alerts Button");
	}
	
	public static void promptAlertButton(WebDriver driver,String str)
	{
		try {
			driver.findElement(AlertsOR.PROMPT_ALERT).click();
			driver.switchTo().alert().sendKeys(str);
			driver.switchTo().alert().accept();
		} catch (NoAlertPresentException e) {
			logger.info("No such Prompt Alert is present",e);
		}
		logger.info("User Successfully clicked on the Prompts Alerts Button");
		
		String matchText = driver.findElement(By.id("promptResult")).getText();
		if (matchText.contains(str)) {
			System.out.println("Test pass");

		} else {
			System.out.println("Test fail");
		}
		driver.quit();
	}
	

}
