package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.Enums.ORType;
import utilities.Enums.TimeOutInSeconds;
import utilities.SelectProperty;
import utilities.WebDriverUtility;

public class DemoHomePage extends AbstractPage {

	public DemoHomePage(WebDriver driver) {
		super(driver);
	}

private static class DemoHomePageElements{

public static final By PAGE_HEADER=By.id(SelectProperty.getInstance(ORType.ELEMENTS).getProperty("homePage_header"));
public static final By CATEGORY_LISTS=By.cssSelector(SelectProperty.getInstance(ORType.ELEMENTS).getProperty("content_lists"));
public static final By CATEGORY_FORM=By.xpath(SelectProperty.getInstance(ORType.ELEMENTS).getProperty("content_form"));
public static final By CATEGORY_ASYNCHRONOUSLIST=By.cssSelector(SelectProperty.getInstance(ORType.ELEMENTS).getProperty("content_asynchronousList"));

}	

public void validatePage()
{
  	WebDriverUtility.verifyElementsPresent(new By[]{DemoHomePageElements.PAGE_HEADER,DemoHomePageElements.CATEGORY_FORM,DemoHomePageElements.CATEGORY_LISTS,DemoHomePageElements.CATEGORY_ASYNCHRONOUSLIST});
}

public DemoFormPage clickFormButton()
{
	WebDriverUtility.clickElement(DemoHomePageElements.CATEGORY_FORM, TimeOutInSeconds.FIVE);
	return new DemoFormPage(driver);
}

}
