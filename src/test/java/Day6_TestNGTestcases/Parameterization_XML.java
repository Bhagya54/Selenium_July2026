package Day6_TestNGTestcases;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization_XML {

	WebDriver driver;
	
	@Parameters({"browserName","siteURL"})
	@Test
	public void openWebsite(String browserName,String url) {
		
		System.out.println(new Date());
		if(browserName.equals("chrome")) {
			driver=new ChromeDriver();
		}
		
		else if(browserName.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		
		else if(browserName.equals("edge")) {
			driver=new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(url);
	
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}
