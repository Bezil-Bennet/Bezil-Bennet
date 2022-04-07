package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DelHRM extends BaseClass{
	@Test
	public void delUser() {
		/*
		 * WebDriverManager.chromedriver().setup(); ChromeDriver driver = new
		 * ChromeDriver(); driver.manage().window().maximize(); driver.get(
		 * "https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
		 * driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		 * driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		 * driver.findElement(By.id("btnLogin")).click();
		 */
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.id("btnDelete")).click();
		driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[2]/td/input")).click();
		driver.findElement(By.id("btnDelete")).click();
		driver.findElement(By.id("dialogDeleteBtn")).click();
		//String text = driver.findElement(By.xpath("//div[@class='top']/following-sibling::div")).getText();
	    //System.out.println(text);
	}
}
