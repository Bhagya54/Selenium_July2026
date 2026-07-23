package Day6_TestNGTestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility.ExcelReader;

public class Parameterization_DataProvider {

	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");	
	}
	
	@Test(dataProvider = "dp")
	public void doLogin(String username,String password) {
		driver.findElement(By.id("_R_1h6kqsqppb6amH1_")).sendKeys(username);
		driver.findElement(By.name("pass")).sendKeys(password);
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@DataProvider(name="dp")
	public Object[][] getData() {
		Object[][] data=new Object[3][2];
		ExcelReader excel = new ExcelReader("./src/test/resources/data/TestData.xlsx");
		String sheetName="Login";
		int noOfRows=excel.getRowCount(sheetName);
		int noOfCols=excel.getColumnCount(sheetName);
		System.out.println("Row Count:" + noOfRows);//4
		System.out.println("Col Count:" + noOfCols);//2
		
		for(int row=2;row<=noOfRows;row++) {//4<=4
			for(int col=0;col<noOfCols;col++) {//0<2
				data[row-2][col]=excel.getCellData(sheetName,col,row);
			}
		}
		//data[0][0]=excel.getCellData(sheetName,0,2);
		//data[0][1]=excel.getCellData(sheetName,1,2);
		
		//data[1][0]=excel.getCellData(sheetName,0,3);
		//data[1][1]=excel.getCellData(sheetName,1,3);
				
		//data[2][0]=excel.getCellData(sheetName,0,4);
		//data[2][1]=excel.getCellData(sheetName,1,4);
		
		return data;
	}
	
	
	
	
	
}
