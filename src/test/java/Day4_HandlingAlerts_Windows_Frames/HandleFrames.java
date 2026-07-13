package Day4_HandlingAlerts_Windows_Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		//driver.switchTo().frame("iframeResult");
		WebElement frameElement = driver.findElement(By.id("iframeResult"));
		//driver.switchTo().frame(0);
		driver.switchTo().frame(frameElement);
		driver.findElement(By.id("fname")).clear();
		driver.findElement(By.id("fname")).sendKeys("kumon");
		driver.findElement(By.name("lname")).clear();
		driver.findElement(By.name("lname")).sendKeys("institute");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[@title='w3schools.com Home']")).click();
	}

}
