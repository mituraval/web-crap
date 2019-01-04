package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.rmi.runtime.Log;
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
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import suite.BaseTest;

public class LoginPage extends BasePage {
	// *********Constructor*********
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	// *********Web Elements*********
	By usernameBy = By.id("com.routematch.caart.qa:id/LoginEmail");
	By passwordBy = By.id("com.routematch.caart.qa:id/LoginPassword");
	By loginButtonBy = By.id("com.routematch.caart.qa:id/LoginSubmit");
	By errorMessageUsernameBy = By.xpath("//*[@id=\"loginForm\"]/div[1]/div/div");
	By errorMessagePasswordBy = By.xpath("//*[@id=\"loginForm\"]/div[2]/div/div ");

	// *********Page Methods*********

	public LoginPage loginToApp(String username, String password) {
		// Enter Username(Email)
		writeText(usernameBy, username);
		BaseTest.driver.hideKeyboard();
		// Enter Password
		writeText(passwordBy, password);
		BaseTest.driver.hideKeyboard();
		// Click Login Button
		click(loginButtonBy);
		return this;
	}

	// Verify Username Condition
	public LoginPage verifyLoginUserName(String expectedText) {
		assertEquals(errorMessageUsernameBy, expectedText);
		return this;
	}

	// Verify Password Condition
	public LoginPage verifyLoginPassword(String expectedText) {
		assertEquals(errorMessagePasswordBy, expectedText);
		return this;
	}
}
