package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testngbase.BaseClass;

public class TC001_Login extends BaseClass {
	@BeforeTest
	public void setValues() {
		testName ="Login";
		testDescription = "Login with positive data";
		testAuthor = "Hari";
		testCategory = "Smoke";
		
	}
	
			
	@Test
	public void runLogin() {
		
		reportStep("Enter username", "pass");
		reportStep("Enter password", "pass");
		reportStep("Click Login button", "pass");

	}
}
