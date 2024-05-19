package newTorus.locators;
	

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.jar.Attributes.Name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import setup.setup;

public class RegisterPageLocators extends setup{
		WebDriver driver;
		
	    @FindBy (linkText = "REGISTER")
	    WebElement registerButton;
	    
	    @FindBy (name="email")
	    WebElement username;
	    
	    @FindBy (name="password")
	    WebElement password;
	    
	    @FindBy (name="confirmPassword")
	    WebElement confirmPassword;
	
	    @FindBy (name="country")
	    WebElement countryDropdown;
	    
	    @FindBy (xpath = "//input[@name='submit']")
	    WebElement submitButton;
	    
	    public RegisterPageLocators(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);	
		}
	    
	    public void clickonRegbutton() {
	        registerButton.click();
	    }
	    
	    public void enteruserDetails() throws IOException, InterruptedException {
	    	username.sendKeys(readproperties().getProperty("UserName"));
	    	password.sendKeys(readproperties().getProperty("Password"));
	    	confirmPassword.sendKeys(readproperties().getProperty("Password"));
	    	Thread.sleep(2000);
	    	submitButton.click();
	    }
	    
	    public void countryselectusingDrodown() {
	    	WebElement hasselecttag=countryDropdown;
	    	Select drpdown= new Select(hasselecttag);
	    	drpdown.selectByVisibleText("INDIA");
	    }
	    
}
