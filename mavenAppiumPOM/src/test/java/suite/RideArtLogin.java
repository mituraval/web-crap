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

public class RideArtLogin {
	
	private static AndroidDriver driver;
	//private static AndroidDriver wait;
	private static WebDriverWait wait;


	  @Before
	  public void setUp() throws MalformedURLException {
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

	    URL remoteUrl = new URL("http://localhost:4723/wd/hub");

	    driver = new AndroidDriver(remoteUrl, desiredCapabilities);
		 wait = new WebDriverWait(driver, 20);
	  }

	  @Test()
	  public void loginTest() throws InterruptedException, TimeoutException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//android.widget.TextView[@content-desc=\"Login Tab. Use 2 finger swipe left/right to change the pages\"]")));

			MobileElement email = (MobileElement) driver.findElementById("com.routematch.caart.qa:id/LoginEmail");
			email.isDisplayed();
			email.sendKeys("artyios@yopmail.com");
			driver.hideKeyboard();
			MobileElement password = (MobileElement) driver
					.findElementById("com.routematch.caart.qa:id/LoginPassword");
			password.isDisplayed();
			password.sendKeys("Password2");
			driver.hideKeyboard();
			wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.id("com.routematch.caart.qa:id/LoginSubmit")));
			WebElement LoginBtn = driver.findElement(By.id("com.routematch.caart.qa:id/LoginSubmit"));
			LoginBtn.isDisplayed();
			LoginBtn.click();
			System.out.println("login session is a success");

	}
	  @Test
	public void buyPasses() throws InterruptedException, TimeoutException {
		Thread.sleep(2000);
		MobileElement heading = (MobileElement) driver.findElementByAccessibilityId("My Wallet heading.");
		heading.isDisplayed();
		WebElement buyPass = driver.findElement(MobileBy
				.xpath("//android.widget.RelativeLayout[@content-desc='Buy Pass button.']/android.widget.TextView"));
		buyPass.click();
		// MobileElement menu = (MobileElement)
		// driver.findElementByAccessibilityId("menu");
		// toolbar buypass com.routematch.caart.qa:id/text_toolbar_button
		// menu.click();
		Thread.sleep(3000);
		WebElement onedayPass = driver.findElement(By.id("com.routematch.caart.qa:id/text_pass_title"));
		onedayPass.isDisplayed();
		onedayPass.click();
		WebElement passTitle = driver.findElement(By.id("com.routematch.caart.qa:id/pass_title"));
		passTitle.isDisplayed();
		passTitle.getText();
		System.out.println("title of pass: "+ passTitle.getText());
		MobileElement adultIncrement = (MobileElement) driver
				.findElementByAccessibilityId("Increase Adult pass quantity");
		adultIncrement.isDisplayed();
		adultIncrement.click();
		WebElement addcartButton = driver.findElement(By.id("com.routematch.caart.qa:id/add_to_cart_button"));
		addcartButton.isDisplayed();
		addcartButton.click();
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.id("com.routematch.caart.qa:id/buy_passes_button")));
		WebElement buypassButton = driver.findElement(By.id("com.routematch.caart.qa:id/buy_passes_button"));
		buypassButton.isDisplayed();
		buypassButton.click();
		MobileElement order = (MobileElement) driver.findElementByAccessibilityId("Order Summary heading.");
		adultIncrement.isDisplayed();
		WebElement purchaseButton = driver.findElement(By.id("com.routematch.caart.qa:id/purchase_passes_button"));
		purchaseButton.isDisplayed();
		purchaseButton.click();
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.id("com.routematch.caart.qa:id/image_credit_card_icon")));
		WebElement cardIcon = driver.findElement(By.id("com.routematch.caart.qa:id/image_credit_card_icon"));
		cardIcon.isDisplayed();
		WebElement finalpayButton = driver.findElement(By.id("com.routematch.caart.qa:id/button_payment_pay"));
		finalpayButton.isDisplayed();
		finalpayButton.click();
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.id("com.routematch.caart.qa:id/text_header")));
		WebElement paymentConfirmation = driver.findElement(By.id("com.routematch.caart.qa:id/text_header"));
		paymentConfirmation.isDisplayed();
		paymentConfirmation.getText();
		System.out.println("Payment done? :"+ paymentConfirmation.getText());
		WebElement doneButton = driver.findElement(By.id("com.routematch.caart.qa:id/button_footer"));
		doneButton.isDisplayed();
		doneButton.click();
		System.out.println("Buying a pass is a success");
	}
	  
		  @AfterClass
	  public static void tearDown() {
		  driver.resetApp();
		  driver.closeApp();
	      driver.quit();
	  }

}
