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


public class TakescreenshotDemo {
	static WebDriver driver;

	public static void takePageScreenshot() throws IOException {
		Date d = new Date();
		String fileName=d.toString().replace(" ","_").replace(":","_")+".png";
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./src/test/resources/screenshots/"+fileName));

	}

	public static void main(String[] args) throws IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
		// driver.switchTo().frame("iframeResult");
		WebElement frameElement = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frameElement);
		WebElement element = driver.findElement(By.xpath("//button[text()='Try it']"));
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);

		takePageScreenshot();

		driver.get("https://google.com");
		takePageScreenshot();
	}

}
