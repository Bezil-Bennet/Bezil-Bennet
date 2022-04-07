package lenTNg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseTestClass{
	@Test(dataProvider="sendData")//to connect testcase and dataprovider
public void runCreateLead(String fname,String lname,String cname) {//arg order match with data order
	/*
	 * WebDriverManager.chromedriver().setup(); ChromeDriver driver = new
	 * ChromeDriver(); driver.manage().window().maximize();
	 * driver.get("http://leaftaps.com/opentaps/control/main");
	 * driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	 * driver.findElement(By.id("password")).sendKeys("crmsfa");
	 * driver.findElement(By.className("decorativeSubmit")).click();
	 * driver.findElement(By.xpath(
	 * "//img[@src='/opentaps_images/integratingweb/crm.png']")).click();
	 */
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
	@DataProvider(indices= {0,2})
	public String[][] sendData() {
		String data[][] = new String [4][3]; //[no. of row][col]
		data[0][0]="Hari";
		data[0][1]="R";
		data[0][2]="testleaf";
		
		data[1][0]="Sheriba";
		data[1][1]="T";
		data[1][2]="testleaf";
		
		data[2][0]="Bezil";
		data[2][1]="P";
		data[2][2]="test";
		
		data[3][0]="Benzen";
		data[3][1]="M";
		data[3][2]="test";
		return data;
		
	}
}
