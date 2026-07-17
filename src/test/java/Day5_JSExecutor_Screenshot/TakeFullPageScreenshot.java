package Day5_JSExecutor_Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TakeFullPageScreenshot {
	static WebDriver driver;

	public static void takePageScreenshot() throws IOException {
		Date d = new Date();
		String fileName=d.toString().replace(" ","_").replace(":","_")+".png";
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./src/test/resources/screenshots/"+fileName));

	}
	
	public static void takeFullPageScreenshot() throws IOException {
		Date d = new Date();
		String fileName=d.toString().replace(" ","_").replace(":","_")+".png";
		File src = ((FirefoxDriver) driver).getFullPageScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./src/test/resources/screenshots/"+fileName));

	}

	public static void main(String[] args) throws IOException {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.com/");
		takeFullPageScreenshot();
	}

}
