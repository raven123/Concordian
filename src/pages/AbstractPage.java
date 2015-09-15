package pages;

import org.openqa.selenium.WebDriver;

import utilities.SelectProperty;
import utilities.Enums.ORType;

public class AbstractPage {

protected final WebDriver driver;	
protected final SelectProperty selectProperty;


public AbstractPage(WebDriver driver)
{
   	this.driver=driver;
   	selectProperty = SelectProperty.getInstance(ORType.ELEMENTS);
   	
}

 protected String getProperty(String propertyKey)
 {
	 return selectProperty.getProperty(propertyKey);
 }

}
