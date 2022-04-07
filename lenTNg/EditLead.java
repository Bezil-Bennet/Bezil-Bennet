package lenTNg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead extends BaseTestClass{
	@Test
public void runEditLead() {
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
	 * 
	 * driver.findElement(By.linkText("Leads")).click();
	 * driver.findElement(By.linkText("Find Leads")).click();
	 */
	driver.findElement(By.name("firstName")).sendKeys("abc");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	
	driver.findElement(By.linkText("Edit")).click();
	driver.findElement(By.name("companyName")).clear();
	String name = "changed";
	driver.findElement(By.name("companyName")).sendKeys(name);
	driver.findElement(By.name("submitButton")).click();
	String text2 = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	boolean contains = text2.contains(name);
    System.out.println(contains);
//driver.close();


}
}
