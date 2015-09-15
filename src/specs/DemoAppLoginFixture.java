package specs;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import pages.DemoFormPage;
import pages.DemoHomePage;
import pages.DemoWelcomeUserPage;
import steps.DemoFormSteps;
import utilities.Enums.BrowserType;
import utilities.Enums.ORType;
import utilities.SelectProperty;
import utilities.WebDriverUtility;

@RunWith(ConcordionRunner.class)
public class DemoAppLoginFixture {
	protected static WebDriver driver;
	
@BeforeClass
public static void setUp()
{
		driver = WebDriverUtility.getDriver(BrowserType.FIREFOX);
		driver.manage().window().maximize();
		driver.get(SelectProperty.getInstance(ORType.APP).getProperty("url"));
	
}
		
	
public void navigateToLoginForm()
{
 new DemoHomePage(driver).clickFormButton();	
}

public void login(String userName, String password)
{
  new DemoFormPage(driver).setUserName(userName).setPassword(password).clickLoginButton();	
}
	
public String assertWelcomeUserMsg(String userName) throws InterruptedException
 {
	return new DemoWelcomeUserPage(driver).getWelcomeMsgText();
 }

@AfterClass
public static void quitDriver()
{
 new DemoFormSteps().exitWebDriver();	
}

}
