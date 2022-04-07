package lenTNg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertion {
	//HardAssert-
	//SoftAssert
@Test	
public void lrnAssert() {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/control/main");
    driver.findElement(By.id("username")).sendKeys("demosalesmanager");
    driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.xpath("//img[@src='/opentaps_images/integratingweb/crm.png']")).click();
	//String expTitle ="My Home | opentaps CRM";
	String expTitle ="My tab | opentaps CRM";
	String actTitle = driver.getTitle();
	//Assert.assertEquals(actTitle, expTitle);
	
	//1.create obj for soft assert
	SoftAssert soft = new SoftAssert();
	soft.assertEquals(actTitle, expTitle);
	
	System.out.println("End");
	
	//Mandatory - soft Assert
	soft.assertAll();
}
}
//Hard Assert -stops at failure; static - assert
//1.Act=ExpTitle;End;PASSED-->if (equal)passed it will proceed completely
//2.Act!=expTitle;Failed;-->!= so it got stopped at failed code itself, so END not retured

//Soft Assert - proceed after failure
//1.Act=ExpTitle;End;Passed;
//2.Act!=ExpTitle;End;Passed;-->proceed after failure and gives pass result based on (END) last code
//To rectify above issue-include mandatory step-it consolidate overall codes
//3.Act!=ExpTitle;End;Failed; (mandatory step included)