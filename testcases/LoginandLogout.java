package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.Login;

public class LoginandLogout extends ProjectSpecificMethods{

@Test
public void login() {
		Login lp = new Login();//obj created for only login page
		lp.enterUserName().enterPassword().clickLoginbutton().verifyHome().
		clickLeads().clickCreateLead().enter().clickSubmit().display();
		
//but we can access methods in home page because of return statement in login method
	}

}
