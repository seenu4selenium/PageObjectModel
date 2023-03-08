package testscenarios;

import org.testng.annotations.Test;

import pages.Dashboard;
import pages.Login;
import pages.Profile;
import utilities.ReUsableFuncations;

public class Case2 extends ReUsableFuncations {
//case-2
//navigate to the Demo website https://demoqa.com/profile.
//Login with a valid username & password and capture the page heading. (testsrini / Test@123)
//Logout from the session.
//Now login with an invalid username & password and verify the URL.

	@Test
	public void f() throws Exception {
		openChromweBrowser();//driver have some value the same value will be reallocate to all page reference
		
		Dashboard d = new Dashboard(driver);
		Login l = new Login(driver);
		Profile p = new Profile(driver);
		
		
		
		driver.get("https://demoqa.com/profile");
		p.click_login_Hyperlink();
		Thread.sleep(3000);

		l.username_type("testsrini");
		l.password_type("Test@123");
		l.login_Button();
		Thread.sleep(3000);
		d.captureHeader();
		Thread.sleep(3000);
		d.logout_Button();
		Thread.sleep(3000);
		// Now login with an invalid username & password and verify the URL.

		l.username_type("testsrini123");
		l.password_type("Test@123123");
		l.login_Button();
		Thread.sleep(3000);
		d.captureHeader();

	}
}
