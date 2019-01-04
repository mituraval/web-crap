package suite;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.io.File;
import java.net.URL;

public class BaseScenario {
	 //protected AppiumDriver driver;
	public static AndroidDriver driver;
	 public static WebDriverWait wait;
	// WebDriverWait wait = new WebDriverWait(driver, 120);
	 @BeforeTest
	 public void setup() throws Exception{
		 DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		    desiredCapabilities.setCapability("platformName", "Android");
		    desiredCapabilities.setCapability("platformVersion", "6.0.1");
		    desiredCapabilities.setCapability("deviceName", "f2289bed");
		    desiredCapabilities.setCapability("appPackage", "org.valleymetro.vmpasspilot.qa");
		    desiredCapabilities.setCapability("appActivity", "com.routematch.mobility.ui.splash.SplashActivity");
		    desiredCapabilities.setCapability("app", "/Users/mraval/Downloads/Pass2Go Pilot_2.1.21.apk");
		    desiredCapabilities.setCapability("noReset", "true");
		    desiredCapabilities.setCapability("autoGrantPermissions", "true");
		    desiredCapabilities.setCapability("autoAcceptAlerts", "true");
		    
		    URL remoteUrl = new URL("http://localhost:4723/wd/hub");
		    driver = new AndroidDriver(remoteUrl, desiredCapabilities);
		    wait = new WebDriverWait(driver, 10);
	 }
	 @AfterTest
	    public void tearDown() {
		 driver.resetApp();
		  driver.closeApp();
	      driver.quit();
	    }
	
}
