package utilities;

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

public class ReUsableFuncations {

	protected WebDriver driver;

	public void openChromweBrowser() {
		driver = new ChromeDriver();//driver have some value
		driver.manage().window().maximize();
	}

	public String timestamp() {
		Date d = new Date();
		DateFormat abcd = new SimpleDateFormat("ddMMMyyyy_HHmmss");
		String timeStamp = abcd.format(d);
		return timeStamp;
	}

	public void takeScreenshot() throws Exception {
		// System will get the current screenshot and store it into temp to RAM location
		File abc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// From RAM location want to move it to specific folder,
		// will use Selenium method FileHandler
		FileHandler.copy(abc, new File(".\\screenshots\\test_" + timestamp() + ".png"));
	}

	public void takeScreenshot(String name) throws Exception {
		// System will get the current screenshot and store it into temp to RAM location
		File abc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// From RAM location want to move it to specific folder,
		// will use Selenium method FileHandler
		FileHandler.copy(abc, new File(".\\screenshots\\" + name + timestamp() + ".png"));
	}

}
