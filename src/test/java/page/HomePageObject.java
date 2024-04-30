package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePageObject {
	
	WebDriver driver=null;
	public HomePageObject() {
		PageFactory.initElements(driver, HomePageObject.class);
	}
	@FindBy(how=How.XPATH, using="//a[contains(text(),'Sign in')]")
	WebElement SignIn;

	@FindBy(how=How.XPATH, using="//h3[text()='Already registered?')]")
	WebElement alreadyregistered;

	@FindBy(how=How.ID, using="email")
	WebElement emailAdressforlogin;

	@FindBy(how=How.NAME, using="passwd")
	WebElement password;

	@FindBy(how=How.NAME, using="SubmitLogin")
	WebElement submitSignIn;

	@FindBy(how=How.XPATH, using="//a[text()='Forgot your password?')]")
	WebElement forgotyourpassword;
	
	@FindBy(how=How.XPATH, using="//h3[text()='Create an account')]")
	WebElement createAnAccountSection;
	
	@FindBy(how=How.ID, using="eamil_create")
	WebElement emailcreate;
	
	@FindBy(how=How.ID, using="SubmitCreate")
	WebElement submitcreate;

public boolean verifySigninlink() {
	boolean status=SignIn.isDisplayed();
	return status;
}
	
public void clicksignin() {
	SignIn.click();
}
	

public String getAlreadyRegisterdText() {
	String title= alreadyregistered.getText();
	return title;
	
}

public void setemail(String email) {
	emailAdressforlogin.clear();
	emailAdressforlogin.sendKeys(email);
}

public void setpassword(String pwd) {
	password.clear();
	password.sendKeys(pwd);
}

public void clicksubmitlogin() {
	submitSignIn.click();
}

public boolean verifyforgottenPasswordLink() {
	boolean status=forgotyourpassword.isDisplayed();
	return status;
}

public void setEmailCreate(String ec) {
	
	emailcreate.clear();
	emailcreate.click();
	
}

public  String getcreateaccounttext() {
	String title=createAnAccountSection.getText();
	return title;
}

public void clicksubmitcreate() {
	submitcreate.click();
}

}
