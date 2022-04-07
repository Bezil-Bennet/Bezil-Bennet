package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class MyLead extends ProjectSpecificMethods{
public CreateLead clickCreateLead() {
	driver.findElement(By.linkText("Create Lead")).click();
	CreateLead cl = new CreateLead();
	return cl;
}
}
