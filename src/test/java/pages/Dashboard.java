package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboard {
	WebDriver driver;

	// Constructor that will be automatically called as soon as the object of the
	// class is created
	public Dashboard(WebDriver driver) {
		this.driver = driver;
	}

	By profile_Header = By.xpath("//*[@id='app']//div[@class='main-header']");
	By logout_Button = By.id("submit");

	// Click
	public void logout_Button() {		
		driver.findElement(logout_Button).click();
	}

	// capture the dashboard title.
	public void captureHeader() {
		System.out.println("The page title is : " + driver.findElement(profile_Header).getText());
	}
}
