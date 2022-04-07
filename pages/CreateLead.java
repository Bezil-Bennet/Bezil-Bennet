package pages;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;

public class CreateLead extends ProjectSpecificMethods{
@BeforeTest	
public void file( String fName) {
		fName="CreateLead";
	}
@Test(dataProvider="takeData")	
public CreateLead enter() {
	driver.findElement(By.name("companyName")).sendKeys("cname");
	driver.findElement(By.name("firstName")).sendKeys("fname");
	driver.findElement(By.name("lastName")).sendKeys("lname");

	return this;
}

public ViewLead clickSubmit() {
	driver.findElement(By.name("submitButton")).click();
    return new ViewLead();
}
}
