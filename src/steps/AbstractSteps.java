package steps;

import org.openqa.selenium.WebDriver;

import utilities.Enums.BrowserType;
import utilities.Enums.ORType;
import utilities.SelectProperty;
import utilities.WebDriverUtility;

public class AbstractSteps {

protected final WebDriver driver;

public AbstractSteps()
{
   driver=WebDriverUtility.getDriver(BrowserType.FIREFOX);
   driver.manage().window().maximize();
   driver.get(SelectProperty.getInstance(ORType.APP).getProperty("url"));
}
	
public void exitWebDriver()
{
 driver.quit();	
}


}
