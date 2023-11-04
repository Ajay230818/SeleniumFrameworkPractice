package testngbase;

import org.testng.annotations.BeforeMethod;

import utils.Reporter;

public class BaseClass extends Reporter{
	@BeforeMethod
	public void preCondition() {
		System.out.println("common preCondition");

	}
}
