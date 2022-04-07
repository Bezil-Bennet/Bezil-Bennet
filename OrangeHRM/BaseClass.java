package OrangeHRM;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public ChromeDriver driver;
	public static String fileName;
	
	@DataProvider
	public static String[][] sendData() throws IOException{
		return ReadExcel.readData(fileName);
	}
	
	@Parameters({"url","uName","pName"})
	@BeforeMethod
	public void precondition(String url,String uName,String pName) {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);			
		driver.findElement(By.id("txtUsername")).sendKeys(uName);
	    driver.findElement(By.id("txtPassword")).sendKeys(pName);
	    driver.findElement(By.id("btnLogin")).click();
	}
	
	@AfterMethod
	public void postcondition() {
	   driver.findElement(By.id("welcome")).click();
	   WebElement logOut = driver.findElement(By.xpath("//a[text()='Logout']"));
	   logOut.click();
	}
}
