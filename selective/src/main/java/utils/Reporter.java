package utils;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Reporter {
		
		public static ExtentReports extent;
		public static ExtentTest test;
		public String testName, testDescription, testAuthor, testCategory; // null

		@BeforeSuite
		public void startReport() {
			ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/result.html");
			extent = new ExtentReports();
			extent.attachReporter(reporter);

		}

		@BeforeClass
		public void testcaseDetails() {
			test = extent.createTest(testName, testDescription);
			test.assignAuthor(testAuthor);
			test.assignCategory(testCategory);

		}

		public void reportStep(String stepDesc, String status) {
			if (status.equalsIgnoreCase("pass")) {
				test.pass(stepDesc);

			} else if (status.equalsIgnoreCase("fail")) {
				test.fail(stepDesc);
			}

		}

		@AfterSuite
		public void endReport() {
			extent.flush();
	}

}
