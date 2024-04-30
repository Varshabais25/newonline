package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Testbase;

public class HomePageTest extends Testbase {  
	
	@Test
	public void verifylogin() {
	Assert.assertTrue(hp.verifySigninlink(),"Sign in link not present..");
	hp.clicksignin();
	
	String expectedsubheading="Already registered?";
	String actualsubheading =hp.getAlreadyRegisterdText();
	
	Assert.assertEquals(actualsubheading, expectedsubheading,"Already Registerd section not present ..");
	hp.setemail(readconfig.getTestEmail());
	hp.setpassword(readconfig.getpassword());
	hp.clicksubmitlogin();
	
}



}
