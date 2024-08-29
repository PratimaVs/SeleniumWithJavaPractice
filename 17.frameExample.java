package FrameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class frameExample {

	WebDriver drive;
	@Test
	public void BroswerCommandTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriverJars\\chromedriver.exe");
		drive= new ChromeDriver();
		drive.get("file:///C:/Users/Administrator/Desktop/frame.html");
		drive.manage().window().maximize();
		
		int noOfFrames = drive.findElements(By.tagName("iframe")).size();
		System.out.println(noOfFrames);	
		
		drive.switchTo().frame("HollandandBarrett");
		drive.get("https://auth.hollandandbarrett.com/u/login");
		drive.manage().window().maximize();
		
		drive.findElement(By.id("username")).sendKeys("biswajitstudy8@gmail.com");

		drive.findElement(By.name("password")).sendKeys("SuperEpicPub@25");

		drive.findElement(By.xpath("/html/body/main/section/div/div/div/form/div[2]/button")).click();

		Thread.sleep(5000);
		
		drive.navigate().to("https://www.selenium.dev");
		drive.findElement(By.xpath("//a[@id='navbarDropdown']")).click();
		Thread.sleep(700);
		
		drive.navigate().to("file:///C:/Users/Administrator/Desktop/frame.html");
		
		drive.switchTo().frame("My store");
		drive.navigate().to("https://demo.nopcommerce.com/");
		drive.findElement(By.name("Search")).sendKeys("Product");
		drive.findElement(By.xpath("//div[@class='search-box store-search-box']")).click();
		Thread.sleep(700);
		drive.quit();
		
 
		
		
}
	
}
