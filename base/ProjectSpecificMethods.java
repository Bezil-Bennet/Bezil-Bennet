package base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificMethods {
 public static ChromeDriver driver;
 public static ExtentReports extent;
 public String testName,Des,cat,aut;
 
	/*
	 * @BeforeSuite public void startReport(){ ExtentHtmlReporter reporter = new
	 * ExtentHtmlReporter("./report/result.html"); reporter.setAppendExisting(true);
	 * extent = new ExtentReports(); extent.attachReporter(reporter);
	 * 
	 * }
	 * 
	 * @BeforeClass public void setUpTestCase() { ExtentTest test =
	 * extent.createTest(testName,Des); test.assignCategory(cat);
	 * test.assignAuthor(aut);
	 * 
	 * }
	 */
 
 @BeforeMethod
 public void preConditions() {
	 WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("http://leaftaps.com/opentaps/control/main");
 }
 @AfterMethod
 public void postCondition() {
	 driver.close();
	 
 }
}
