package dropBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class DropDownBox {

	WebDriver drive;
	@Test
	public void dropDOwn() throws Exception {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriverJars\\chromedriver.exe");
		drive= new ChromeDriver();
		drive.get("https://www.facebook.com/campaign/landing.php");
		drive.manage().window().maximize();
		Thread.sleep(400);
		
		WebElement month_elem = drive.findElement(By.id("month"));
		
		Select months = new Select(month_elem);
		
		
		WebElement option =   months.getFirstSelectedOption();
		System.out.println(option);
		
		months.selectByIndex(8);
		Thread.sleep(5000);
		months.selectByValue("3");
		Thread.sleep(5000);
		months.selectByVisibleText("Aug");
		Thread.sleep(400);
		drive.quit();
		
		
		
		
		drive.quit();
}
}
