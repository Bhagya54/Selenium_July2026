package Day6_TestNGTestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod {
	@Test(priority=1) 
	public void register() {
		System.out.println("Registration");
		Assert.assertTrue(false);
	}
	
	@Test(priority=1) 
	public void A() {
		System.out.println("A");
		Assert.assertTrue(true);
	}
	
	@Test(priority=2,dependsOnMethods = {"register","A"})
	public void login() {
		System.out.println("Login");
	}
}
