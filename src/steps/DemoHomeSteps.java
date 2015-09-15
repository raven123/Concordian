package steps;

import pages.DemoHomePage;

public class DemoHomeSteps extends AbstractSteps{

public void navigateToLoginForm()
{
  new DemoHomePage(driver).clickFormButton();	
}
	
}
