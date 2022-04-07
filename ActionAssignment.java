package SeleniumAssignments;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
//action - class
public class ActionAssignment {
private static final CharSequence Ctrl = null;

public static void main (String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/");
	
	//drag
	//driver.findElement(By.linkText("Draggable")).click(); 
	 Actions build = new Actions (driver); 
	 //driver.switchTo().frame(0); 
	 //WebElement drag = driver.findElement(By.id("draggable")); 
	 //build.dragAndDropBy(drag, 100,100).perform(); 
	 //driver.close();
	 
	 //Drop
		/*
		 * driver.findElement(By.linkText("Droppable")).click();
		 * driver.switchTo().frame(0); 
		 * WebElement drag1 =driver.findElement(By.id("draggable")); 
		 * WebElement drop =driver.findElement(By.id("droppable")); 
		 * build.dragAndDrop(drag1,drop).perform();
		 */
	//Resizable
	//driver.findElement(By.linkText("Resizable")).click();
	//.switchTo().frame(0);
	//WebElement resize = driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
	//build.dragAndDropBy(resize, 150,100).perform();
	//WebElement resize1 = driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
	//build.dragAndDrop(resize, resize1);
	
	 
	 //Selectable - mouse
	 //driver.findElement(By.linkText("Selectable")).click();
	 //driver.switchTo().frame(0);
	 //WebElement select = driver.findElement(By.xpath("//li[text()='Item 1']"));
	 //WebElement select1 = driver.findElement(By.xpath("//li[text()='Item 4']"));
	 //WebElement select2 = driver.findElement(By.xpath("//li[text()='Item 6']"));
	 //build.clickAndHold(select).moveToElement(select1).release().perform();
     //build.keyDown(Keys.CONTROL).click(select2).keyUp(Keys.CONTROL).perform(); 
	 
	 //---Keyboard
	 //build.keyDown(Keys.CONTROL).click(select).click(select1).click(select2).keyUp(Keys.CONTROL).perform();
	 
	 //Sortable
	 driver.findElement(By.linkText("Sortable")).click();
	 driver.switchTo().frame(0);
	 WebElement sort = driver.findElement(By.xpath("//li[text()='Item 2']"));
	 WebElement sort1 = driver.findElement(By.xpath("//li[text()='Item 5']"));
	 //build.clickAndHold(sort).moveToElement(sort1).release().perform();
	 build.dragAndDrop(sort, sort1).perform();
	 
}
}
