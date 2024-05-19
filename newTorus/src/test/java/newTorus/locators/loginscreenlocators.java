package newTorus.locators;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

import setup.setup;

public class loginscreenlocators extends setup{
	WebDriver driver;
	
	@FindBy(xpath="//a[@href='login.php']")
	WebElement tosigninScreen;
	
	@FindBy(name = "userName")
	WebElement enterUsername;
	
	@FindBy(name = "password")
	WebElement enterPassword;
	
	@FindBy(name = "submit")
	WebElement clickonSignin;
	
	
	
	public loginscreenlocators(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	public void backtosigninscreenandLogin() throws IOException, InterruptedException {
		//tosigninScreen.click();
		driver.navigate().to("https://demo.guru99.com/test/newtours/login.php");;
		Thread.sleep(2000);
		enterUsername.sendKeys(readproperties().getProperty("UserName"));
		enterPassword.sendKeys(readproperties().getProperty("Password"));
		clickonSignin.click();
		Thread.sleep(2000);
	}
	
	

}
