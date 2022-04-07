package lenTNg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTestClass {

public RemoteWebDriver driver; //Declare as global variable
public String filename;
@DataProvider(indices=3)
public String[][] senddata() throws IOException {
	String[][]ReadExcel re = new String[][]ReadExcel;
	//return ReadExcel.readData(filename);	
}
@Parameters({"url","password","username","browser"})//name shld match;order can differ
@BeforeMethod
public void beforeMethod (String url, String pword, String uname,String browser){//order shld be same; arg name can differ
 //String browser = null;
 if(browser.equalsIgnoreCase("chrome")) {
	 WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
 }
 else if(browser.equalsIgnoreCase("edge")) {
	 WebDriverManager.edgedriver().setup();
	 driver= new EdgeDriver();
	 
 }
 else if(browser.equalsIgnoreCase("firefox")) {
	 WebDriverManager.firefoxdriver().setup();
	 driver= new FirefoxDriver();
	 
 }
	
driver.manage().window().maximize();
driver.get(url);
driver.findElement(By.id("username")).sendKeys(uname);
driver.findElement(By.id("password")).sendKeys(pword);
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.xpath("//img[@src='/opentaps_images/integratingweb/crm.png']")).click();
}

@AfterMethod
public void afterMethod() {
	driver.close();
}




}
