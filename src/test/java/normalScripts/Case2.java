package normalScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Case2 {
	@Test
	public void f() throws Exception {
//	      navigate to the Demo website https://demoqa.com/profile.
//		  Login with a valid username & password and capture the page heading.
//		  Logout from the session.
//		  Now login with an invalid username & password and verify the URL.

		// Instantiating chrome driver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Opening web application
		driver.get("https://demoqa.com/profile");

		// Locating the Login button and clicking on it
		driver.findElement(By.linkText("login")).click();
		Thread.sleep(5000);

		// Locating the username & password and passing the credentials
		driver.findElement(By.id("userName")).sendKeys("testsrini");
		driver.findElement(By.id("password")).sendKeys("Test@123");

		// Click on the login button
		driver.findElement(By.id("login")).click();

		// Print the web page heading
		System.out.println("The page title is : "
				+ driver.findElement(By.xpath("//*[@id='app']//div[@class='main-header']")).getText());
		Thread.sleep(5000);
		// Click on Logout button
		driver.findElement(By.id("submit")).click();

//		  Now login with an invalid username & password and verify the URL.
		driver.findElement(By.id("userName")).sendKeys("testsriniDummy");
		driver.findElement(By.id("password")).sendKeys("Test@123Dummy");
		// Click on the login button
		driver.findElement(By.id("login")).click();

		String currentURL = driver.getCurrentUrl();
		String proURL = "https://demoqa.com/profile";
		if (currentURL.equals(proURL)) {
			System.out.println("Given crdentials are vald");

		} else {
			System.out.println("Given crdentials are in-vald");
		}

	}
}
