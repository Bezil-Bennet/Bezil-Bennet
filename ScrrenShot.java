package SeleniumAssignments;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrrenShot {
	public static void main(String[] args) throws IOException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	/*
	 * driver.get("https://phptravels.org/index.php?rp=/login"); File shot =
	 * driver.getScreenshotAs(OutputType.FILE); File fil = new
	 * File("./snapShot/img.png"); FileUtils.copyFile(shot, fil);
	 */
	driver.get("https://www.phptravels.net/login");
	WebElement scr2 = driver.findElement(By.xpath("//button[@type='submit']"));
	File src = scr2.getScreenshotAs(OutputType.FILE);
	File des = new File ("./snapShot/key1.png");
	FileUtils.copyFile(src, des);
	
	
	
}
}
