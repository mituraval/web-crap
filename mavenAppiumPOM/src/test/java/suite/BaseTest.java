package suite;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeoutException;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import pages.LoginPage;

import org.testng.annotations.BeforeClass;

public class BaseTest {
	public static AndroidDriver driver;
	public WebDriverWait wait;
    By usernameBy = By.id("com.routematch.caart.qa:id/LoginEmail");
    By passwordBy = By.id("com.routematch.caart.qa:id/LoginPassword");
    By loginButtonBy = By.id("com.routematch.caart.qa:id/LoginSubmit");

    public void setup () {
        //Create a Chrome driver. All test classes use this.
       // driver = new AndroidDriver();
    	DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("platformVersion", "6.0.1");
	    desiredCapabilities.setCapability("deviceName", "f2289bed");
	    desiredCapabilities.setCapability("appPackage", "com.routematch.caart.qa");
	    desiredCapabilities.setCapability("appActivity", "com.routematch.mobility.ui.splash.SplashActivity");
	    desiredCapabilities.setCapability("app", "/Users/mraval/Downloads/rideartqa_2.3.2.apk");
	    desiredCapabilities.setCapability("noReset", "true");
	    desiredCapabilities.setCapability("autoGrantPermissions", "true");
	    desiredCapabilities.setCapability("autoAcceptAlerts", "true");
	    //desiredCapabilities.setCapability("clearSystemFiles", "true");

	    URL remoteUrl = null;
		try {
			remoteUrl = new URL("http://localhost:4723/wd/hub");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    driver = new AndroidDriver(remoteUrl, desiredCapabilities);
		// wait = new WebDriverWait(driver, 20);
    }
    public  void loginToRideArt (String username, String password){
        //Enter Username(Email)
        writeText(usernameBy,username);
    driver.hideKeyboard();
        //Enter Password
        writeText(passwordBy, password);
        driver.hideKeyboard();
        //Click Login Button
        click(loginButtonBy);

    }
 
    private void click(By loginButtonBy2) {
		// TODO Auto-generated method stub
		
	}
	private void writeText(By usernameBy2, String username) {
		// TODO Auto-generated method stub
		
	}

    public  static void teardown () {
    	driver.resetApp();
		  driver.closeApp();
	      driver.quit();
    }

}
