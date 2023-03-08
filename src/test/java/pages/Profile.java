package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Profile {
	WebDriver driver;
	
	//constructor
	public Profile(WebDriver driver) {
		this.driver = driver;
	}
	
	// Store profile page locators here [All the locators]
	By login_Hyperlink = By.linkText("login");
	By register_Hyperlink = By.linkText("register");

	// Prepare the functions(related to Profile page only)
	public void click_login_Hyperlink() {
		driver.findElement(login_Hyperlink).click();
	}

	public void click_register_Hyperlink() {
		driver.findElement(register_Hyperlink).click();
	}

}
