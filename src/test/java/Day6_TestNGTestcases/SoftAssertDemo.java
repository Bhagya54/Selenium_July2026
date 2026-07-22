package Day6_TestNGTestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {

	WebDriver driver;
	@Test
	public void verifyTitle() {
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(14,12);
		System.out.println("Verified 2 integer values");
		driver=new ChromeDriver();
		driver.get("https://google.com");
		String title=driver.getTitle();//Google
		String expectedTitle="Google123";
		
		//Assert.assertEquals(title,expectedTitle);
		
		soft.assertTrue(title.equals(expectedTitle),"Title are not matching");//pass
		
		System.out.println("Comparision between 2 titles");
		
		soft.assertAll();
	}
}
