package SeleniumAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailWebTable {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://erail.in/");
	WebElement ele1 = driver.findElement(By.id("txtStationFrom"));
    ele1.clear();
    ele1.sendKeys("MS",Keys.ENTER);
    WebElement ele2 = driver.findElement(By.id("txtStationTo"));
    ele2.clear();
    ele2.sendKeys("MDU",Keys.ENTER);
    driver.findElement(By.id("buttonFromTo")).click();
    
   //find table
    WebElement table = driver.findElement(By.xpath("//div[@id='divTrainsList']/table"));
   //rows
    List<WebElement> rowList = table.findElements(By.tagName("tr"));
    System.out.println("Number of train:" +rowList.size());
       //coloumn
    WebElement colo = driver.findElement(By.xpath("//div[@id='divTrainsList']/table//tr[1]"));
    List<WebElement> coloList = colo.findElements (By.tagName("td"));
    System.out.println("Coloum count" +coloList.size());
   display contents
    System.out.println("-----content-------");
    for (WebElement eachRow : rowList) {
		String text = eachRow.getText();
		System.out.println(text);
	}
    //display train names
    
System.out.println("-------List of Train-------");
    for(int i=0;i>rowList.size();i++) {
    	WebElement row = rowList.get(i);
    	List<WebElement> tds = row.findElements(By.tagName("td"));
    	String text = tds.get(1).findElement(By.tagName("a")).getText();
    	System.out.println(text);
    	
    }
    System.out.println("**********************");
 }
}
