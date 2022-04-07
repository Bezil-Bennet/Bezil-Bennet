package lenTNg;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LrnDataProvider {
public class CreateLead extends BaseTestClass{
		
	@BeforeTest
	public void setFileName(){
		filename = "CreateLead";
	}
	
	@Test(dataProvider="readData")//to connect testcase and dataprovider
public void runCreateLead(String fname,String lname,String cname) {//arg order match with data order
		driver.findElement(By.linkText("Leads")).click();
	    boolean displayed = driver.findElement(By.xpath("//div[text()='My Leads']")).isDisplayed();
	    if(displayed) {
	    	System.out.println("Displayed");
	    }
	    driver.findElement(By.linkText("Create Lead")).click();
	    driver.findElement(By.name("companyName")).sendKeys(cname);
	    driver.findElement(By.name("firstName")).sendKeys(fname);
	    driver.findElement(By.name("lastName")).sendKeys(lname);
	    driver.findElement(By.name("submitButton")).click();
	    
	}
		
	}

}
