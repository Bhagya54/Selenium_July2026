package Day7_ReadProperties_Log4J;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ReadProperties {

	WebDriver driver;
	FileInputStream fis;
	Properties config = new Properties();
	Properties or = new Properties();
	@BeforeMethod
	public void setUp() throws IOException {
		fis=new FileInputStream("./src/test/resources/properties/config.properties");
		config.load(fis);
		
		if(config.getProperty("browser").equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if(config.getProperty("browser").equals("firefox")) {
			driver = new FirefoxDriver();
		}
		
		else if(config.getProperty("browser").equals("edge")) {
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(config.getProperty("testsiteurl"));	
		
		fis=new FileInputStream("./src/test/resources/properties/or.properties");
		or.load(fis);
	}
	
	@Test()
	public void doLogin() {
		driver.findElement(By.id(or.getProperty("email_ID"))).sendKeys("testuser1");
		driver.findElement(By.name(or.getProperty("password_NAME"))).sendKeys("password1");
		driver.findElement(By.xpath(or.getProperty("loginBtn_XPATH"))).click();
	}
}
