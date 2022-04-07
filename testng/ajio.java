package testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ajio {

@Test
public void runAjio() {
	WebDriverManager.chromedriver().setup();
	ChromeOptions options = new ChromeOptions ();
	options.addArguments("--disable-notification");
	ChromeDriver driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get("https://www.ajio.com/shop/sale");
}
}
