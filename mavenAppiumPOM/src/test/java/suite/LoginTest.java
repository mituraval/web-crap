package suite;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import pages.LoginScreen;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import suite.BaseScenario;


public class LoginTest extends BaseScenario{

	//private LoginScreen loginScreen;
BaseScenario object = new BaseScenario();

	
@Test
public void checkLogin() {
	try {
		object.setup();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
//LoginScreen loginScreen = new LoginScreen();
	
	//loginScreen = new LoginScreen();


	// loginScreen.LoginEmail.sendKeys("passpilot@yopmail.com");
	//loginScreen.login("passpilot@yopmail.com");

   // loginScreen.waitForElementToAppear(loginScreen.LoginEmail);
 //  loginScreen.LoginEmail.sendKeys("passpilot@yopmail.com");
   // loginScreen.waitForElementToAppear(loginScreen.LoginPassword);
   // loginScreen.LoginPassword.sendKeys("Password1");
	
}
}
