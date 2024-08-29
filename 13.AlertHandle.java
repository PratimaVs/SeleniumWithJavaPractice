package alertHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertHandle {

	WebDriver drive;
	@Test
	public void setup() throws Exception {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriverJars\\chromedriver.exe");
		drive= new ChromeDriver();
		drive.get("https://the-internet.herokuapp.com/javascript_alerts");
		drive.manage().window().maximize();
		Thread.sleep(400);
		
		drive.findElement(By.xpath("//button[@onclick='jsAlert()'][contains(.,'Click for JS Alert')]")).click();
		Alert alert = drive.switchTo().alert();
		Thread.sleep(400);
		alert.accept();
		String result = drive.findElement(By.cssSelector("#result")).getText();
		System.out.println(result);
		Assert.assertEquals("You successfully clicked an alert", result);
		
		
		
		drive.findElement(By.xpath("//button[@onclick='jsConfirm()'][contains(.,'Click for JS Confirm')]")).click();
		Alert alert2 = drive.switchTo().alert();
		Thread.sleep(400);
		alert2.dismiss();
		String result2 = drive.findElement(By.cssSelector("#result")).getText();
		System.out.println(result2);
		Assert.assertEquals("You clicked: Cancel", result2);
		
		drive.findElement(By.xpath("//button[@onclick='jsConfirm()'][contains(.,'Click for JS Confirm')]")).click();
		Alert alert3 = drive.switchTo().alert();
		Thread.sleep(400);
		alert3.accept();
		String result3 = drive.findElement(By.cssSelector("#result")).getText();
		System.out.println(result2);
		Assert.assertEquals("You clicked: Ok", result3);
		
		drive.findElement(By.xpath("//button[@onclick='jsPrompt()'][contains(.,'Click for JS Prompt')]")).click();
		drive.switchTo().alert().sendKeys("HII");
		drive.switchTo().alert().accept();
		String result4 = drive.findElement(By.cssSelector("#result")).getText();
		System.out.println(result4);
		Assert.assertEquals("You entered: Pratima", result4);
		
	//	drive.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
	}
	
	
	
}
