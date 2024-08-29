package seleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Clear {

	WebDriver drive;
	@Test
	public void exampleId() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriverJars\\chromedriver.exe");
		drive= new ChromeDriver();
		drive.get("https://auth.hollandandbarrett.com/u/login");
		drive.manage().window().maximize();
		
		//Locators id,name and Xpath(xml path)
		drive.findElement(By.id("username")).sendKeys("biswajitstudy8@gmail.com");
		drive.findElement(By.id("username")).clear();
		drive.quit();
	}
}
