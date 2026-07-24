package Day7_ReadProperties_Log4J;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Log4J {

	static WebDriver driver;
	static FileInputStream fis;
	static Properties config = new Properties();
	static Properties or = new Properties();
	static Logger log=Logger.getLogger(Log4J.class);

	@BeforeMethod
	public void setUp() throws IOException {
		
		fis = new FileInputStream("./src/test/resources/properties/log4j.properties");
		PropertyConfigurator.configure(fis);
		log.info("Test started");
		
		fis = new FileInputStream("./src/test/resources/properties/config.properties");
		config.load(fis);
		log.info("Config Properties file has been loaded");

		if (config.getProperty("browser").equals("chrome")) {
			driver = new ChromeDriver();
			log.info("Chrome browser has been launched");
		} else if (config.getProperty("browser").equals("firefox")) {
			driver = new FirefoxDriver();
			log.info("firefox browser has been launched");
		}

		else if (config.getProperty("browser").equals("edge")) {
			driver = new EdgeDriver();
			log.info("Edge browser has been launched");
		}

		driver.manage().window().maximize();
		driver.get(config.getProperty("testsiteurl"));
		log.info("Navigated to url: " + config.getProperty("testsiteurl"));

		fis = new FileInputStream("./src/test/resources/properties/or.properties");
		or.load(fis);
		log.info("OR Properties file has been loaded");
	}

	@Test()
	public void doLogin() {
		type("email_ID", "testuser1");
		type("password_NAME", "password1");
		click("loginBtn_XPATH");
	}

	public static void type(String keyword, String value) {

		WebElement ele = null;
		
		try {
		if (keyword.endsWith("_ID")) {
			ele = driver.findElement(By.id(or.getProperty(keyword)));
		}

		else if (keyword.endsWith("_NAME")) {
			ele = driver.findElement(By.name(or.getProperty(keyword)));
		}

		else if (keyword.endsWith("_XPATH")) {
			ele = driver.findElement(By.xpath(or.getProperty(keyword)));
		}

		else if (keyword.endsWith("_CSS")) {
			ele = driver.findElement(By.cssSelector(or.getProperty(keyword)));
		} else if (keyword.endsWith("_CLASS")) {
			ele = driver.findElement(By.className(or.getProperty(keyword)));
		}
		ele.sendKeys(value);
		log.info("Entered value: " + value + " into the element with keyword as :" + keyword);
		}
		catch(Exception e) {
			System.out.println("Unable to enter text into the field");
			log.error("Unable to enter " + value + " into the element with keyword as :" + keyword);
			Assert.fail(e.getMessage());
		}
	}

	public static void click(String keyword) {

		WebElement ele = null;
		try {
		if (keyword.endsWith("_ID")) {
			ele = driver.findElement(By.id(or.getProperty(keyword)));
		}

		else if (keyword.endsWith("_NAME")) {
			ele = driver.findElement(By.name(or.getProperty(keyword)));
		}

		else if (keyword.endsWith("_XPATH")) {
			ele = driver.findElement(By.xpath(or.getProperty(keyword)));
		}

		else if (keyword.endsWith("_CSS")) {
			ele = driver.findElement(By.cssSelector(or.getProperty(keyword)));
		} else if (keyword.endsWith("_CLASS")) {
			ele = driver.findElement(By.className(or.getProperty(keyword)));
		}
		ele.click();
		log.info("Clicked on element with keyword: " + keyword);
		}
		
		catch(Exception e) {
			System.out.println("Unable to click on the field");
			log.error("Unable to click on the field: " + keyword);
			Assert.fail(e.getMessage());
		}
	}
	
	
	public static void selectValueFromDropDown() {
		
	}
}
