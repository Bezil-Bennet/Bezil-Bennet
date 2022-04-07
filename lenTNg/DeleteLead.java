package lenTNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead extends BaseTestClass{

@Test
public void runDeleteLead()  {
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
	driver.findElement(By.linkText("Phone")).click();
	driver.findElement(By.name("phoneNumber")).sendKeys("2345");
	String text = driver.findElement(By.xpath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a")).getText();
	System.out.println("Text:" +text);
	driver.findElement(By.xpath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a")).click();
	
	
	driver.findElement(By.linkText("Delete")).click();
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.linkText("Phone")).click();
	driver.findElement(By.name("phoneNumber")).sendKeys(text);
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	
	String confirm = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
	
	System.out.println("Confirmation Msg:" +confirm);
	//driver.close();
	}
}


