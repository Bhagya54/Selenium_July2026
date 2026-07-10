package Day3_HandlingDifferentWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes_Demo2 {
	public static void main(String[] args) {
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
	WebElement block = driver.findElement(By.xpath("//h2[text()='HTML Pre-Selected Checkboxes:']/following-sibling::div[2]"));
	
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", block);
	
	List<WebElement> allSporrts = block.findElements(By.xpath(".//input[@name='sports']"));
	System.out.println(allSporrts.size());
	for(WebElement ele:allSporrts) {
		if(!ele.isSelected()) {
			//football
			ele.click();	
		}
		
		
	}
}
}
