package Day3_HandlingDifferentWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Demo {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/indices/nse/nifty-50");
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		int noOfRows = rows.size();// 50
		List<WebElement> cols = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td"));
		int noOfCols = cols.size();// 6
//		System.out.println(driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[1]")).getText());
//		System.out.println(driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[2]")).getText());
//		System.out.println(driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[3]")).getText());
//
//		System.out.println(driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[2]/td[1]")).getText());
		int a=10;
		int b=20;
		System.out.println("Value of a is: "+a + " value of b is: " +b);
		for(int i = 0; i < noOfRows; i++) 
		{
			for(int j = 0; j < noOfCols; j++) //i=0<50,j=2<6
			{
				WebElement ele=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+(i+1)+"]/td["+(j+1)+"]"));
				System.out.print(ele.getText() + " ");
			}
			
			System.out.println();
		}

		// for(int i=0;i<rows.size();i++) {
//			System.out.println(rows.get(i).getText());
//		}
	}
}