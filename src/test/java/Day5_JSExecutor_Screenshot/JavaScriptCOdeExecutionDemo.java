package Day5_JSExecutor_Screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class JavaScriptCOdeExecutionDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
		//driver.switchTo().frame("iframeResult");
		WebElement frameElement = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frameElement);
		
		((JavascriptExecutor)driver).executeScript("myFunction()");

	}

}
