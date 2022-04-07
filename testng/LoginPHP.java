package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPHP {
public static void main(String[] args) throws InterruptedException {
	
WebDriverManager.chromedriver().setup();
			//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			// maximize the screen
			driver.manage().window().maximize();
			driver.get("https://phptravels.org/index.php?rp=/login");
			// locate the element
			driver.findElement(By.id("inputEmail")).sendKeys("sheriba.ts@gmail.com");
			driver.findElement(By.id("inputPassword")).sendKeys("password");
			Thread.sleep(1000);
			driver.findElement(By.id("login")).click();
			// Link Text
			driver.findElement(By.linkText("Register")).click();
			driver.findElement(By.id("inputFirstName")).sendKeys("Raja");
			driver.findElement(By.id("inputLastName")).sendKeys("Raja");
			driver.findElement(By.id("inputEmail")).sendKeys("abc@123.com");
			driver.findElement(By.id("inputAddress1")).sendKeys("Addr1");
			driver.findElement(By.id("inputCity")).sendKeys("city");
			driver.findElement(By.id("inputPhone")).sendKeys("23454322");
			driver.findElement(By.linkText("inputNewPassword1")).click();
			driver.findElement(By.xpath("//input[@value='Register']")).click();
}
}
