package lenTNg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CarWale {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.carwale.com/");
	ChromeOptions options = new ChromeOptions();
	
	//USED CARS
	Actions build = new Actions(driver);
	WebElement ele1 = driver.findElement(By.xpath("//div[text()='USED CARS']"));
	build.moveToElement(ele1).perform();
	//FIND USED CARS
	driver.findElement(By.xpath("//div[text()='Find Used cars']")).click();
	//LOCATION
	driver.findElement(By.id("closeLocIcon")).click();
	//city
	WebElement ele3 = driver.findElement(By.id("drpCity"));
    ele3.click();
    Select drop = new Select(ele3);
    drop.selectByValue("176");
    //budget
    driver.findElement(By.id("budgetBtn")).click();
    driver.findElement(By.id("minInput")).click();
    //driver.findElement(By.xpath("//ul[@id='minPriceList']/li[6]")).click();
    
    driver.findElement(By.id("maxInput")).click();
    //driver.findElement(By.xpath("//ul[@id='minPriceList']/li[7]")).click();
 driver.findElement(By.name("CarsWithPhotos")).click();
 driver.findElement(By.xpath("//span[text()=' Hyundai ']")).click();//ElementClickInterruptedException
 driver.findElement(By.xpath("//span[text()='Creta']")).click();
 driver.findElement(By.xpath("//div[@name='fuel']/h3")).click();
 driver.findElement(By.name("Petrol")).click();
 driver.close();
 
	
	
	
}
}
