package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import base.ProjectSpecificMethods;

public class Home extends ProjectSpecificMethods {

	/*
	 * public Login clickLogout() {
	 * driver.findElement(By.className("decorativeSubmit")).click(); //Login log =
	 * new Login(); //return log; return new Login();
	 */
	//}
	public MyHome verifyHome() {
		 WebElement crm = driver.findElement(By.linkText("CRM/SFA"));
		 boolean displayed = crm.isDisplayed();
		 crm.click();
		 Assert.assertTrue(displayed);
		 System.out.println(displayed);
		 MyHome my = new MyHome();
		 return my;
	}
}
