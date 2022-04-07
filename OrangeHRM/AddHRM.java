package OrangeHRM;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddHRM extends BaseClass{
	
	
	@BeforeTest
	public void setFileName() {
		fileName ="OrangeHRM";
	}
	
	@Test(dataProvider="sendData")
	//@Parameters({"eName","usName","paName","cName"})
	public void addUser(String eName,String usName,String paName,String cName) {
		
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(eName);
		driver.findElement(By.id("systemUser_userName")).sendKeys(usName);
		driver.findElement(By.name("systemUser[password]")).sendKeys(paName);
		driver.findElement(By.name("systemUser[confirmPassword]")).sendKeys(cName);
		driver.findElement(By.id("btnSave")).click();
		//String text = driver.findElement(By.xpath("//div[@class='top']/following::div)")).getText();
		System.out.println("User Added");
		
		
		
}
/*
 * @DataProvider public static String[][] sendData() throws IOException{ return
 * ReadExcel.readData("OrangeHRM"); }
 */
}
	
	 
	

