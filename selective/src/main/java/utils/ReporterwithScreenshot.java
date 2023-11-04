package utils;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ReporterwithScreenshot {

	public static void main(String[] args) throws IOException {

		// Section 1: Step1 to Step3 -> Common for all the execution. These 3 steps has
		// to be executed at the very begining

		// Step1:Create the physical html file
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/result.html");

		// Step2: Create object for ExtentReports
		ExtentReports extent = new ExtentReports();

		// Step3: Integrate physical file and data
		extent.attachReporter(reporter);

		// Section2: Setting up Testcase level details
		// Step4: Create a testcase
		ExtentTest test1 = extent.createTest("Login test", "Login with positive credential");
		test1.assignAuthor("Hari");
		test1.assignCategory("Smoke");

		// Section3: capturing status for each test step
		// example: test1 -> 3 steps
		test1.pass("Enter username", MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/username.png").build()); // pass()
																															// to																												// pass
		test1.pass("Enter password");
		test1.pass("Click login button"); // fail() to give the status as fail

		// Section4: Save the report
		extent.flush(); // Mandatory step.
	}

}
