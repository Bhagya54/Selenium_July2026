package Day6_TestNGTestcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1 {
	ChromeDriver driver = new ChromeDriver();
	@Test
	public void verifyTitle() {
		
		driver.get("https://google.com");
		String title=driver.getTitle();//Google
		System.out.println("Title: " + title);
		Assert.assertEquals(title,"google");

	}
	
	
	@Test
	public void doLogin() {
		
		System.out.println("Login is successful");

	}

}
