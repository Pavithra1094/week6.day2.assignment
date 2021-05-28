package week6.day2.assignment.pom.test;

import org.testng.annotations.Test;

import week6.day2.assignment.pom.hooks.HooksTest;
import week6.day2.assignment.pom.pages.LoginPage;



public class CreateLead extends HooksTest {

	@Test
	public void createLeadTest() {

		new LoginPage().typeUName().typePwd().clickLoginButton().clickCrmSfaLink().clickLeadsOption()
				.clickCreateLeadsMenu().assignCompanyName("CTS").assignFName("LK").assignLName("SHRI")
				.clickCreateLeadBtn().verifyCompanyName();

	}

}
