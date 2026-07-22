package Day6_TestNGTestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class Assertion_TestNG {
/*
 * Hard Assert - 
 *  If some thing fails it will not execute further lines of code
 *  Assert.
 * Soft Assert
 */
	
	WebDriver driver;
	@Test(groups = {"regression"})
	public void verifyTitle() {
		Assert.assertEquals(12,12);
		System.out.println("Verified 2 integer values");
		driver=new ChromeDriver();
		driver.get("https://google.com");
		String title=driver.getTitle();//Google
		String expectedTitle="Google123";
		
		//Assert.assertEquals(title,expectedTitle);
		
		Assert.assertTrue(title.equals(expectedTitle),"Title are not matching");//pass
		
		System.out.println("Comparision between 2 titles");
	}
	
	
	@Test(groups = {"smoke"})
	public void doFailure() {
		Assert.fail("Intentianal Failure");
	}
	
	@Test(groups = {"sanity"})
	public void doSkip() {
		throw new SkipException("Intentional Skipping of testcase");
	}
	
}
