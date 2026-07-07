package Day2_LocatingElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		System.out.println(driver.getTitle());
		
		WebElement dropDownEle=driver.findElement(By.id("searchLanguage"));
		
		Select dropSelect=new Select(dropDownEle);
		dropSelect.selectByValue("ar");
		Thread.sleep(2000);
		dropSelect.selectByIndex(5);
		Thread.sleep(2000);
		//dropSelect.selectByVisibleText("Galego");
		
		List<WebElement> allOptions = dropSelect.getOptions();
		System.out.println("No of options: " + allOptions.size());
		
		for(WebElement ele:allOptions) {
			//System.out.println(ele.getText());
			System.out.println(ele.getAttribute("lang"));
		}
		

	}

}
