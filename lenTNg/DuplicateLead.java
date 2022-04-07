package lenTNg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead extends BaseTestClass {
	@Test
public void runDuplicateLead() {
	/*
	 * WebDriverManager.chromedriver().setup(); ChromeDriver driver = new
	 * ChromeDriver(); driver.manage().window().maximize();
	 * driver.get("http://leaftaps.com/opentaps/control/main");
	 * driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	 * driver.findElement(By.id("password")).sendKeys("crmsfa");
	 * driver.findElement(By.className("decorativeSubmit")).click();
	 * driver.findElement(By.xpath(
	 * "//img[@src='/opentaps_images/integratingweb/crm.png']")).click();
	 * 
	 * driver.findElement(By.linkText("Leads")).click();
	 * driver.findElement(By.linkText("Find Leads")).click();
	 */
	driver.findElement(By.xpath("//span[text()='Email']")).click();
	driver.findElement(By.name("emailAddress")).sendKeys("abc@gmail.com");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	String text = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).getText();
	System.out.println("Lead Name:" +text);
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
	driver.findElement(By.linkText("Duplicate Lead")).click();
	String title = driver.getTitle();
	System.out.println("title:" +title);
	driver.findElement(By.name("submitButton")).click();
	String text1 = driver.findElement(By.id("viewLead_firstName_sp")).getText();
	System.out.println("Duplicated Name:" +text1);
	boolean equals = text.equals(text1);
	System.out.println(equals);
	//driver.close();
	
	
	
	
}
}
