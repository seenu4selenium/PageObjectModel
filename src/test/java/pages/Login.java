package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	WebDriver driver;

	public Login(WebDriver driver) {
		this.driver = driver;
	}

	// Store Login page locators here [All the locators]
	By userName_Editbox = By.id("userName");
	By password_Editbox = By.id("password");
	By login_Button = By.id("login");
	By newUser_Button = By.id("newUser");

	// Sendkeys
	public void username_type(String inputdata) {
		driver.findElement(userName_Editbox).sendKeys(inputdata);
	}

	public void password_type(String inputdata) {
		driver.findElement(password_Editbox).sendKeys(inputdata);
	}

	// Click
	public void login_Button() {
		driver.findElement(login_Button).click();
	}

	public void newUser_Button() {
		driver.findElement(newUser_Button).click();
	}

}
