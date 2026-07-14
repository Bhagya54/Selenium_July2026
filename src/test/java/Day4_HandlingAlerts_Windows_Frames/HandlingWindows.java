package Day4_HandlingAlerts_Windows_Frames;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Format - CTRL+SHIFT+F
//PAckages import - CTRL+SHIFT+o
//comment/uncomment - CTRL+/
public class HandlingWindows {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);

		driver.findElement(By.xpath("//a[@title='w3schools.com Home']")).click();

		Set<String> allWindows = driver.getWindowHandles();
		for (String w : allWindows) {
			if (!w.equals(parentWindow)) {
				driver.switchTo().window(w);
				driver.findElement(By.xpath("(//a[normalize-space()='Academy'])[1]")).click();
				if (driver.getCurrentUrl().contains("academy")) {
					System.out.println(driver.getCurrentUrl());
					System.out.println("Pass");
				}
			}

		}
		
		driver.switchTo().window(parentWindow);
		driver.findElement(By.cssSelector("#tryhome")).click();

//		Iterator<String> it = allWindows.iterator();
//		while(it.hasNext()) {
//			if(!it.next().equals(parentWindow)) {
//				driver.switchTo().window(it.next());
//				driver.findElement(By.xpath("(//a[normalize-space()='Academy'])[1]")).click();
//				if(driver.getCurrentUrl().contains("academy")){
//					System.out.println(driver.getCurrentUrl());
//					System.out.println("Pass");
//				}
//			
//			}
//			
//		}
	}

}
