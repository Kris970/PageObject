package nymgo.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {
	public static WebDriver driver;

	public static WebDriver getFirefoxDriver() {
		if(driver ==null) 
		driver = new FirefoxDriver();
		return driver;
		
		
	}
	public static void killDriver() {
		driver.quit();
	}

}
