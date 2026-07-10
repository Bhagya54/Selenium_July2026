package Day3_HandlingDifferentWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBuutons_Demo {
public static void main(String[] args) {
	////h2[text()='HTML Radio Fields:']/following-sibling::div[1]/input
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://tizag.com/htmlT/htmlradio.php");
	WebElement block = driver.findElement(By.xpath("//h2[text()='HTML Radio Fields:']/following-sibling::div[1]"));
	
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", block);
	
	//List<WebElement> allSporrts = block.findElements(By.xpath(".//input"));
	
	driver.findElement(By.xpath("//h2[text()='HTML Radio Fields:']/following-sibling::div[1]/input[2]")).click();
	System.out.println("Greek has been selected");


}
}
