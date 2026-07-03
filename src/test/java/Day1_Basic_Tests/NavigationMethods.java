package Day1_Basic_Tests;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
//		Options opt = driver.manage();
//		Window win=opt.window();
//		win.maximize();
		driver.manage().window().maximize();
		driver.navigate().to("https://google.com");
		System.out.println(driver.getTitle());//Google
		driver.navigate().to("https://facebook.com");
		System.out.println(driver.getTitle());//Facebook
		driver.navigate().back();
		System.out.println("After Navigating Back: " + driver.getCurrentUrl());
		driver.navigate().forward();
		System.out.println("After Navigating Forward: " + driver.getCurrentUrl());
		driver.navigate().refresh();
		driver.quit();
	}

}
