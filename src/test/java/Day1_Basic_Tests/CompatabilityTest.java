package Day1_Basic_Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CompatabilityTest {

	public static void main(String[] args) {
		String browser="chrome";
		WebDriver driver = null;
		
		if(browser.equalsIgnoreCase("Chrome")) {
			  driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox")) {
			  driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Edge")) {
			  driver=new EdgeDriver();
		}
		
		driver.get("https://facebook.com");
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}
