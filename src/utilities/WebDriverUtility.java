package utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.Enums.BrowserType;
import utilities.Enums.TimeOutInSeconds;

public class WebDriverUtility {

	private static WebDriver driver;

	public static WebDriver getDriver(BrowserType browserType) {
		if (driver == null) {
			switch (browserType) {
			case FIREFOX:
				driver = new FirefoxDriver();
				return driver;
			case CHROME:
				driver = new ChromeDriver();
				return driver;
			case IE:
				driver = new InternetExplorerDriver();
				return driver;
			default:
				driver = new FirefoxDriver();
				return driver;
			}
		}
		
		else 
		{
			return driver;
		}
	}
	
	public static WebElement findElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static List<WebElement> findElements(By locator)
	{
		return driver.findElements(locator);
	}

	public static void clickElement(By locator,TimeOutInSeconds time)
	{
		WebDriverWait wait = new WebDriverWait(driver,time.toInt());
		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
	}
	
	public static String getElementText(By locator,TimeOutInSeconds time)
	{
		WebDriverWait wait = new WebDriverWait(driver,time.toInt());
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).getText();
	}
	
	public static String getElementProperty(By locator,String attribute,TimeOutInSeconds time)
	{
		WebDriverWait wait = new WebDriverWait(driver,time.toInt());
		return wait.until(ExpectedConditions.elementToBeClickable(locator)).getAttribute(attribute);
	}
	
	public static void sendText(By locator,String textTosend,TimeOutInSeconds time)
	{
		WebDriverWait wait = new WebDriverWait(driver,time.toInt());
		wait.until(ExpectedConditions.elementToBeClickable(locator)).sendKeys(textTosend);
	}
	
	public static boolean verifyElementsPresent(By[] elements)
	{
		boolean flag=true;
		for(By element:elements)
		{
			if(driver.findElement(element).isDisplayed()==false)
				flag=false;
				break;
		}
		return flag;
	}
	
}
