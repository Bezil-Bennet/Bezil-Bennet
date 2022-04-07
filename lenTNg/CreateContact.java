package lenTNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact extends BaseTestClass {
@Test
public void runCreateContact() {
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
	driver.findElement(By.linkText("Contacts")).click();
	driver.findElement(By.linkText("Create Contact")).click();
	driver.findElement(By.id("firstNameField")).sendKeys("Bezil");
	driver.findElement(By.id("lastNameField")).sendKeys("Bennet");
	driver.findElement(By.name("firstNameLocal")).sendKeys("Bez");
	driver.findElement(By.name("lastNameLocal")).sendKeys("M");
	driver.findElement(By.name("personalTitle")).sendKeys("Hello");
	driver.findElement(By.name("birthDate")).sendKeys("12/12/12");
	driver.findElement(By.name("departmentName")).sendKeys("Dept");
	driver.findElement(By.name("description")).sendKeys("Describe");
	driver.findElement(By.name("primaryEmail")).sendKeys("bezil@mail.com");
	WebElement sta = driver.findElement(By.name("generalStateProvinceGeoId"));
	Select state = new Select(sta);
	state.selectByVisibleText("Arizona");
	driver.findElement(By.className("smallSubmit")).click();
	driver.findElement(By.linkText("Edit")).click();
	driver.findElement(By.name("description")).clear();
	driver.findElement(By.name("importantNote")).sendKeys("TEXT");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	System.out.println("Title" +driver.getTitle());
	
	
	
	
	
	
	}
}
