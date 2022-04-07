package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class MyHome extends ProjectSpecificMethods {

	public MyLead clickLeads() {
		driver.findElement(By.linkText("Leads")).click();
		MyLead ml = new MyLead();
		return ml;
	}
}
