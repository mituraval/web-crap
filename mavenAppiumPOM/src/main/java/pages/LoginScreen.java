package pages;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import suite.BaseScenario;

import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginScreen extends BaseScenario{

	
	public LoginScreen(){
		super();
	}

	//WebDriverWait wait = new WebDriverWait(driver, 20);
	
	@FindBy(id= "org.valleymetro.vmpasspilot.qa:id/LoginEmail")
	public WebElement LoginEmail;
	
	@FindBy(id= "org.valleymetro.vmpasspilot.qa:id/LoginPassword")
	public WebElement LoginPassword;
	
	@FindBy(id= "org.valleymetro.vmpasspilot.qa:id/LoginSubmit")
	private WebElement LoginSubmit;
	

	/*public void waitForElementToAppear(WebElement LoginEmail) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
      wait.until(ExpectedConditions.visibilityOf(LoginEmail));
    }
	
	//public void login(String email) {
     //   this.waitForElementToAppear(LoginEmail);
       // LoginEmail.sendKeys(email);
   // }

	public void login(String email ) {
		 this.waitForElementToAppear(LoginEmail);
	        LoginEmail.sendKeys(email);
	}*/
}
