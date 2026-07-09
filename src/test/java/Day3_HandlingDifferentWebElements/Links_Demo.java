package Day3_HandlingDifferentWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links_Demo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		System.out.println(driver.getTitle());
		
		WebElement block = driver.findElement(By.cssSelector("nav.other-projects"));
		List<WebElement> allLinks = block.findElements(By.tagName("a"));
		System.out.println(allLinks.size());//12
		for(WebElement ele:allLinks) {
			System.out.println(ele.getText() + "---" + ele.getAttribute("href"));
		}

	}

}
