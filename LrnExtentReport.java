package exception;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LrnExtentReport {
	public static void main(String args[]) throws IOException {
//common for all test cases
//Step1. setup physical report path
ExtentHtmlReporter reporter = new ExtentHtmlReporter("./report/result.html");
//to keep report history
reporter.setAppendExisting(true);

//step2 create obj for ExtentReports
ExtentReports extent = new ExtentReports();
//step3 attach data with physical file
extent.attachReporter(reporter);


//step4 create testcase and assign test details
                                  //testName       //testDescription
ExtentTest test = extent.createTest("LoginAndLogout","Login test for leaftabs application");
test.assignCategory("smoke");
test.assignAuthor("Bezil");


//step5 step level status
test.pass("Enter username");
test.pass("Enter password");
//attach sccrenshot
test.pass("click login button",MediaEntityBuilder.createScreenCaptureFromPath(".././snapShot/img.png").build());
//../ --->to come out of report folder


//step6 mandatory step
extent.flush();



	}	
}
