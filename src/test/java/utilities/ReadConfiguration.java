package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfiguration {
	
	Properties prop;
	public ReadConfiguration() throws FileNotFoundException{
		File f=new File("./Configuration/config.properties");
		FileInputStream fis=new FileInputStream(f);
		prop=new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public String getChromePath() {
		String chromePath=prop.getProperty("chromepath");
		return chromePath;
	}
	public String getFirefoxPath() {
		String fireFoxPath=prop.getProperty("firefoxpath");
		return fireFoxPath;
	}
	
	public String getBrowserOption() {
		String browseropt=prop.getProperty("browserOption");
		return browseropt;
	}
	
	public String getTestEmail() {
		String useremail=prop.getProperty("testUserEmail");
		return useremail;
	}
	
	public String getpassword() {
		String password=prop.getProperty("password");
		return password;
	}
	
	public String getQaUrl() {
		String qaUrl=prop.getProperty("qaUrl");
		return qaUrl;
	}

}
