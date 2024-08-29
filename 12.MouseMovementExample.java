package mouseMovement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseMovementExample {

	WebDriver drive;
	@Test
	public void Test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriverJars\\chromedriver.exe");
		drive= new ChromeDriver();
		drive.get("https://www.easemytrip.com/");
		drive.manage().window().maximize();
		Thread.sleep(700);
		
		Actions action = new Actions(drive);
		action.moveToElement(drive.findElement(By.xpath("span[normalize-space()='Login or Signup']"))).build().perform();
		Thread.sleep(500);
		drive.findElement(By.xpath("//span[normalize-space()='Customer Login']")).click();
		Thread.sleep(700);		
		drive.quit();
}
}
