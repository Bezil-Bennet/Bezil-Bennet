package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CarWale {
public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.carwale.com/");
driver.manage().window().maximize();
Actions build = new Actions(driver);
//driver.findElement(By.xpath("//span[text()='New']")).click();
driver.findElement(By.xpath("//span[text()='Used']")).click();
driver.findElement(By.xpath("//input[@placeholder='City, eg: Mumbai']")).sendKeys("Chennai");
driver.findElement(By.xpath("//li[@label='Chennai, Tamil Nadu']/div']")).click();
//WebElement drag = driver.findElement(By.xpath("//button[@aria-valuemin='0']"));
driver.findElement(By.xpath("//input[@type='number']")).sendKeys("4");
driver.findElement(By.xpath("//input[@placeholder='Max']")).sendKeys("8");

/*
 * WebElement drop =
 * driver.findElement(By.xpath("//button[@aria-valuemin='5']")); Point location
 * = drop.getLocation(); int x = location.x; int y = location.y;
 * 
 * build.dragAndDropBy(drop, x, y);
 */

//WebElement drag1 = driver.findElement(By.xpath("//button[@aria-valuemin='20']"));
//WebElement drop1 = driver.findElement(By.xpath("//button[@aria-valuemin='10']"));
//build.dragAndDrop(drag1, drop1);




}
}
