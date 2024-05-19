package setup;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setup {
	WebDriver driver;
	
	public WebDriver openchrome() {
		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	
	public Properties readproperties() throws IOException {
		FileReader readthefile=new FileReader("C:\\Users\\vishjk\\eclipse-workspace\\newTorus\\src\\test\\java\\resources\\userinfo.properties");
		Properties prop = new Properties();
		prop.load(readthefile);
		return prop;
	}
	
	public void tearDown(WebDriver driver) {
		driver.quit();
		
	}
	

}
