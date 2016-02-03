package nymgo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage extends NymgoPage {
	public static final String IN_USERNAME = "//input[@id='username-el']";
	public static final String IN_PASSWORD = ".//*[@id='Password-el']";
	public static final String BTN_SIGN_IN = ".//*[@id='user-login-el']";

	public static final String USERNAME_ERROR = ".//*[@id='username']/div/div[@class = 'validation-msg']";
	public static final String PASSWORD_ERROR = ".//*[@id='Password']/div/div[@class = 'validation-msg']";
	
	public SignInPage(WebDriver driver) {
		super(driver);
	}
	public SignInPage loginAsWrongUser(String username, String password) {
		getInUsername().sendKeys(username);
		getbtnInPassword().sendKeys(password);
		clickbtnSignIn();
		return new SignInPage(driver);
	}
	
	
	private void clickbtnSignIn() {
		getbtnSignIn().click();
		
	}
	public WebElement getInUsername() {
		return driver.findElement(By.xpath(IN_USERNAME));
	}
	
	public WebElement getbtnInPassword() {
		return driver.findElement(By.xpath(IN_PASSWORD));
	}
	public WebElement getbtnSignIn() {
		return driver.findElement(By.xpath(BTN_SIGN_IN));
	}
	public WebElement getUserError() {
		return driver.findElement(By.xpath(USERNAME_ERROR));
	}
	public WebElement getPasswordError() {
		return driver.findElement(By.xpath(PASSWORD_ERROR));
	}

	

}
