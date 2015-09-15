package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.Enums.ORType;
import utilities.SelectProperty;
import utilities.WebDriverUtility;
import utilities.Enums.TimeOutInSeconds;

public class DemoFormPage extends AbstractPage {

	public DemoFormPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private static class DemoFormPageElements {
             
		public static final By PAGE_HEADER = By.id(SelectProperty.getInstance(ORType.ELEMENTS)
				.getProperty("homePage_header"));
		public static final By LOGIN_USERNAME = By.name(SelectProperty
				.getInstance(ORType.ELEMENTS).getProperty("loginForm_userName"));
		public static final By LOGIN_PASSWORD = By.name(SelectProperty
				.getInstance(ORType.ELEMENTS).getProperty("loginForm_password"));
		public static final By LOGIN_BUTTON = By.id(SelectProperty
				.getInstance(ORType.ELEMENTS).getProperty("loginForm_loginBtn"));

	}

	public void validatePage() {
		WebDriverUtility.verifyElementsPresent(new By[] {
				DemoFormPageElements.PAGE_HEADER,
				DemoFormPageElements.LOGIN_PASSWORD,
				DemoFormPageElements.LOGIN_PASSWORD });
	}

	public DemoFormPage setUserName(String userName) {
		WebDriverUtility.sendText(DemoFormPageElements.LOGIN_USERNAME,
				userName, TimeOutInSeconds.FIVE);
		return new DemoFormPage(driver);
	}

	public DemoFormPage setPassword(String password) {
		WebDriverUtility.sendText(DemoFormPageElements.LOGIN_PASSWORD,
				password, TimeOutInSeconds.FIVE);
		return new DemoFormPage(driver);
	}

	public DemoWelcomeUserPage clickLoginButton() {
		WebDriverUtility.clickElement(DemoFormPageElements.LOGIN_BUTTON,
				TimeOutInSeconds.FIVE);
		
		return new DemoWelcomeUserPage(driver);
	}

}
