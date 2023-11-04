package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testngbase.BaseClass;

public class TC002_CreateLead extends BaseClass{
	@BeforeTest
	public void setValues() {
		testName ="CreateLead";
		testDescription = "Login with mandatory data";
		testAuthor = "Parthiv";
		testCategory = "Functional";
		
	}
		
	
	@Test
	public void runCreateLead() {
		System.out.println("CreateLead");

	}
}
