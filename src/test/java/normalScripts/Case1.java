package normalScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Case1 {
	@Test
	public void f() throws InterruptedException {

//      Firstly, navigate to the Demo website https://demoqa.com/profile.
//		Secondly, login into the store.(testsrini / Test@123)
//		Thirdly, capture the dashboard title.
//		Finally, logout from the store.

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
	
		// Close driver instance
		driver.quit();
	}
}
