package nymgo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends NymgoPage {

	public static final String BTN_SIGN_IN = "html/body/header/div/div/div[3]/ul/li[2]/a";
	public static final String BTN_JOIN_NOW = "(.//div[@class='sloganHolder']/a)[1]";

	public MainPage(WebDriver driver) {
		super(driver);

	}

	public MainPage load() {
		driver.navigate().to("https://secure.nymgo.com/");
		return new MainPage(driver);
	}

	public SignInPage clickbtnSignIn() {
		getbtnSignIn().click();
		
		return new SignInPage(driver);
	}

	public JoinNowPage clickbtnJoinNow() {
		getbtnJoinNow().click();
		return new JoinNowPage(driver);
	}

	public MainPage waitToBeAvailable() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(getbtnJoinNow()));
		wait.until(ExpectedConditions.elementToBeClickable(getbtnSignIn()));
		
		return new MainPage(driver);

	}
	public WebElement getbtnSignIn() {
		return driver.findElement(By.xpath(BTN_SIGN_IN));
	}
	public WebElement getbtnJoinNow() {
		return driver.findElement(By.xpath(BTN_JOIN_NOW));
	}
}
