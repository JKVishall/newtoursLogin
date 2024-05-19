package execution;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import newTorus.locators.RegisterPageLocators;
import newTorus.locators.loginscreenlocators;
import newTorus.locators.RegisterPageLocators;
import newTorus.locators.loginscreenlocators;
import setup.setup;

public class logintotheApp extends setup{

WebDriver driver = openchrome();
RegisterPageLocators clickReg=new RegisterPageLocators(driver);
loginscreenlocators logintoapp = new loginscreenlocators(driver);

@BeforeMethod
public void openURL() {
	driver.get("https://demo.guru99.com/test/newtours/register.php");
}

@Test
public void execute() throws IOException, InterruptedException {
	clickReg.clickonRegbutton();
	clickReg.countryselectusingDrodown();
	clickReg.enteruserDetails();
	logintoapp.backtosigninscreenandLogin();
	//test1
}

@AfterMethod
public void teardown() {
	tearDown(driver);	
}

}
