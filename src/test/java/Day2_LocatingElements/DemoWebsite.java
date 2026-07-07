package Day2_LocatingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebsite {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
		driver.findElement(By.cssSelector("input#password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		
		WebElement ele=driver.findElement(By.cssSelector("h1.post-title"));
		
		if(ele.isDisplayed()) {
			System.out.println(ele.getText());
			System.out.println("Pass");
		}
		else {
			System.out.println("Element is not displayed");
		}
		
		driver.close();
	}

}
