package steps;

import pages.DemoFormPage;

public class DemoFormSteps extends AbstractSteps{

public void performLogin(String userName, String password)
{
  new DemoFormPage(driver).setUserName(userName).setPassword(password).clickLoginButton();
}
	


}
