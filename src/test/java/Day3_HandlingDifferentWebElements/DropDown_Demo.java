package Day3_HandlingDifferentWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown_Demo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		System.out.println(driver.getTitle());
		
		WebElement languagesDD=driver.findElement(By.id("searchLanguage"));
		List<WebElement> allOption = languagesDD.findElements(By.tagName("option"));
		System.out.println(allOption.size());

	}

}
