package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Testbase;

public class RegistrationTest extends Testbase {
	
	@Test
	public void verifyRegistration() {
		
		Assert.assertTrue(hp.verifySigninlink(), "SignIn link not availaBLE");
		hp.clicksignin();
		
		String expectedtitle="CREATE AN ACCOUNT";
		String actualtitle=hp.getcreateaccounttext();
		
		Assert.assertEquals(actualtitle, expectedtitle, " crete an account section not present");
		hp.setemail("abc@gmail.com");
		hp.clicksubmitcreate();
		
		String expectedpagetitle="YOUR PERSONAL INFORMATION";
		String actualpagetitle=rp.getpagetitle();
		Assert.assertEquals(actualpagetitle, expectedpagetitle,"Registration page not exists...");
	}

}
