package testscenarios;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import pages.Dashboard;
import pages.Login;
import pages.Profile;
import utilities.ReUsableFuncations;

public class Case1 extends ReUsableFuncations {

	@Test
	public void f() throws Exception {

		openChromweBrowser();

		// Creating object of home page
		Profile profile = new Profile(driver);
		// Creating object of Login page
		Login login = new Login(driver);
		// Creating object of Dashboard
		Dashboard dashboard = new Dashboard(driver);

//		    1 navigate to the Demo website https://demoqa.com/profile.
//			2 login into the store.(testsrini / Test@123)
//			3 capture the dashboard title.
//			4 logout from the store.

		driver.get("https://demoqa.com/profile");
		// takescreenshot
		takeScreenshot("profile");
		
		profile.click_login_Hyperlink();		
		// takescreenshot
		takeScreenshot("login");
		login.username_type("testsrini");
		login.password_type("Test@123");
		Thread.sleep(2000);
		login.login_Button();
		Thread.sleep(2000);
		
		dashboard.captureHeader();
		// takescreenshot
		takeScreenshot("dashboard");

		dashboard.logout_Button();
		// takescreenshot
		takeScreenshot("logout");

	

	}
}
