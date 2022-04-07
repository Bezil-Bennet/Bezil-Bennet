package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LogOutHRM {
@Test	
public void logOut() {
     WebDriverManager.chromedriver().setup(); ChromeDriver driver = new
	 ChromeDriver(); driver.manage().window().maximize();
	 driver.get("https://opensource-demo.orangehrmlive.com/");
	 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	 driver.findElement(By.id("btnLogin")).click();

	driver.findElement(By.id("welcome")).click();
	WebElement logOut = driver.findElement(By.xpath("//a[text()='Logout']"));
	logOut.click();
}
}
