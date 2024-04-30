package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPageObject{
	WebDriver driver=null;
	public RegistrationPageObject() {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(how=How.XPATH, using="//h3[@texr()='Your personal information']")
	WebElement pagetitle;

  public String getpagetitle() {
	  String title=pagetitle.getText();
	  return title;
  }	
}
