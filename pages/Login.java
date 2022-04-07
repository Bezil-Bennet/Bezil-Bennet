package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class Login extends ProjectSpecificMethods{
	        //action(enter)+elementName(userName)
public Login enterUserName() {
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	return this;  //this-->className(pagename), so change void to classname(same page)
}

public Login enterPassword() {
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	return this;    //returns same page 
}

public Home clickLoginbutton() {
	driver.findElement(By.className("decorativeSubmit")).click();
	Home hpage = new Home();//goes to next page > create object for next page and return next page
	return hpage;
	
}
}
