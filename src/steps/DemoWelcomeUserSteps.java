package steps;

import pages.DemoWelcomeUserPage;



public class DemoWelcomeUserSteps extends AbstractSteps {

	
public String getWelcomeUserMsg(String userName)
{
  	return new DemoWelcomeUserPage(driver).getWelcomeMsgText();
}
	
}
