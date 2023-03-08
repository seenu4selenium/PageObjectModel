package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class BlazeDemo {

	@Test
	public void t() throws Exception {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		//Home Screen
		driver.get("https://blazedemo.com/");
		Thread.sleep(3000);
		new Select(driver.findElement(By.name("fromPort"))).selectByVisibleText("Boston");
		new Select(driver.findElement(By.name("toPort"))).selectByVisibleText("London");
		//driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//Flights Selection Screen
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[3]/td[1]/input")).click();
		
		//Passenger Details Screen
		driver.findElement(By.id("inputName")).sendKeys("preethi");
		driver.findElement(By.id("address")).sendKeys("brocton lane");
		driver.findElement(By.id("city")).sendKeys("maplegrove");
		driver.findElement(By.id("state")).sendKeys("minneapolis");
		driver.findElement(By.id("zipCode")).sendKeys("55311");
		new Select(driver.findElement(By.id("cardType"))).selectByVisibleText("American Express");
		driver.findElement(By.id("creditCardNumber")).sendKeys("12345678");
		driver.findElement(By.id("creditCardMonth")).sendKeys("2");
		driver.findElement(By.id("creditCardYear")).sendKeys("2023");
		driver.findElement(By.id("nameOnCard")).sendKeys("preethi karnati");
		driver.findElement(By.id("rememberMe")).click();
		driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();
		Thread.sleep(3000);
		
		
		//Itinerary Screen
		String allText = driver.findElement(By.xpath("/html/body/div[2]/div")).getText();
		System.out.println(allText);
		
//		// get the text from thankyou page
//		String text1 = driver.findElement(By.xpath("/html/body/div[2]/div/h1")).getText();
//		System.out.println(text1);
//
//		String text2 = driver.findElement(By.xpath("/html/body/div[2]/div/table/tbody/tr[1]/td[2]")).getText();
//		System.out.println(text2);

		driver.quit();

	}

}
