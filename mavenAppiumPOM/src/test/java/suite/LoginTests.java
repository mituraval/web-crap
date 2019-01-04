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

public class LoginTests extends BaseTest{
	
	
	
	
	@Test
	public void checkLogin() {
		BaseTest bt = new BaseTest();
		bt.setup();
		LoginPage loginpage = new LoginPage(bt.driver);
		loginpage.loginToApp("artyios@yopmail.com", "Password2");
		bt.teardown();
	}

}
