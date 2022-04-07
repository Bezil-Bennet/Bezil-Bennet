package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.ProjectSpecificMethods;

public class ViewLead extends ProjectSpecificMethods{
public ViewLead display() {
	boolean dis = driver.findElement(By.xpath("//div[text()='View Lead']")).isDisplayed();
	Assert.assertTrue(dis);
	System.out.println("Displayed:" +dis);
	return this;
}
}
