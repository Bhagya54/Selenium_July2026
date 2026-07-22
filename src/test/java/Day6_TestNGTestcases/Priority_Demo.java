package Day6_TestNGTestcases;

import org.testng.annotations.Test;

public class Priority_Demo {

	@Test(groups = {"performace"}) //default priority-0
	public void register() {
		System.out.println("Registration");
	}
	
	
	@Test(priority = 0)
	public void login() {
		System.out.println("Login");
	}
	
	
}
