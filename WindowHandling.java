package SeleniumAssignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
	driver.findElement(By.xpath("//a[@target='_blank']")).click();
	Set<String> windowHandles = driver.getWindowHandles();
	List <String> winHand = new ArrayList<String>(windowHandles);
	System.out.println(winHand);
	String string = winHand.get(1);
	String string1 = winHand.get(0);
	System.out.println("Window 1:" +string);
	driver.switchTo().window(string1);
	driver.findElement(By.id("getwebsitebtn")).click();
	
}
}
