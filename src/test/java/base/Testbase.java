package base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

import page.HomePageObject;
import page.RegistrationPageObject;
import utilities.ReadConfiguration;

public class Testbase {


	 public static  WebDriver driver;
	 protected static HomePageObject hp;
	 protected static RegistrationPageObject rp;
	 public  static ReadConfiguration readconfig;
	 

		public static void selectbrowser(String browser) {
			
			if(browser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
			     driver=new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", readconfig.getFirefoxPath());
			     driver=new FirefoxDriver();
			    
			     
			}
		}
		@BeforeClass
		public void setupbrowser() throws IOException {
			
			readconfig=new ReadConfiguration();
			
			System.out.println("==setup broswer");
			selectbrowser("chrome");
			//navigate to site
			driver.get("http://automationpractice.com/index.php");
			//implicitlywaitfor webElement
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//implicitwait for web pages
			driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
			 hp =new HomePageObject();
		     rp =new RegistrationPageObject ();
		}
		//@AfterClass
		//public void closebrowser() {
			//System.out.println("close broswer");
			//driver.close();
		//}
}
