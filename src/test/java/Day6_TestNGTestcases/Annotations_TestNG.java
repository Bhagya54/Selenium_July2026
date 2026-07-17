package Day6_TestNGTestcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_TestNG {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforeSuite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("afterSuite");
	}
	
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}
	@BeforeClass
	public void openDBConnection() {
		System.out.println("Make DB Connection");
	}

	@AfterClass
	public void closeDBConnection() {
		System.out.println("Close DB Connection");
	}
	@BeforeMethod
	public void setUp() {
		System.out.println("Open chrome browser");
	}
	
	@AfterMethod
	public void close() {
		System.out.println("Close chrome browser");
	}
	
	@Test
	public void doLogin() {
		System.out.println("Login Successful");
	}
	
	
	@Test
	public void doUserReg() {
		System.out.println("Registration Successful");
	}
}
