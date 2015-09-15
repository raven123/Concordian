package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.Enums.ORType;
import utilities.Enums.TimeOutInSeconds;
import utilities.SelectProperty;
import utilities.WebDriverUtility;

public class DemoWelcomeUserPage extends AbstractPage{

	public DemoWelcomeUserPage(WebDriver driver) {
		super(driver);
		
	}

	private static class DemoWelcomePageElements{

		public static final By PAGE_HEADER=By.id(SelectProperty.getInstance(ORType.ELEMENTS).getProperty("homePage_header"));
		public static final By WELCOME_MESSAGE=By.className(SelectProperty.getInstance(ORType.ELEMENTS).getProperty("welcomePage_msg"));

		}	

		public void validatePage()
		{
		  	Assert.assertTrue(WebDriverUtility.verifyElementsPresent(new By[]{DemoWelcomePageElements.PAGE_HEADER,DemoWelcomePageElements.WELCOME_MESSAGE}));
		}
	
	    public String getWelcomeMsgText()
	    {
	    	System.out.println("Welcome Message: "+WebDriverUtility.getElementText(DemoWelcomePageElements.WELCOME_MESSAGE, TimeOutInSeconds.TEN));
	    	return WebDriverUtility.getElementText(DemoWelcomePageElements.WELCOME_MESSAGE, TimeOutInSeconds.TEN);
	    }
	
}
