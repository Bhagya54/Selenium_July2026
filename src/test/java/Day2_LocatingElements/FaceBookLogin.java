package Day2_LocatingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLogin {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//WebElement username = driver.findElement(By.name("email"));
		//WebElement pswd=driver.findElement(By.id("_R_1hmkqsqppb6amH1_"));
		//WebElement loginBtn=driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[1]/div/div[3]/div/div/div/div[1]/div/span/span"));
		
		//username.sendKeys("testingtrainer54");
		driver.findElement(By.name("email")).sendKeys("testingtrainer54");
		driver.findElement(By.id("_R_1hmkqsqppb6amH1_")).sendKeys("password123");
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		
		
		
		
	}

}
