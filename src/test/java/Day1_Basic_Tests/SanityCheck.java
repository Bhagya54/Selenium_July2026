package Day1_Basic_Tests;

import org.openqa.selenium.chrome.ChromeDriver;

public class SanityCheck {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		String title=driver.getTitle();
		System.out.println("Title: " + title);
		if(title.equals("Google")) {
			System.out.println("Title is matched");
		}
		else {
			System.out.println("Fail");
		}
		
		String url=driver.getCurrentUrl();
		System.out.println("URL: " + url);
		if(url.contains("google")) {
			System.out.println("Url is correct");
		}
		
		driver.quit();
	}

}
