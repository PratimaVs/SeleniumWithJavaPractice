package seleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IdName {

	WebDriver drive;
	@Test
	public void exampleId() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriverJars\\chromedriver.exe");
		drive= new ChromeDriver();
		drive.get("https://auth.hollandandbarrett.com/u/login");
		drive.manage().window().maximize();
		
		//Locators id,name and Xpath (xml path)
		drive.findElement(By.id("username")).sendKeys("biswajitstudy8@gmail.com");
		drive.findElement(By.name("password")).sendKeys("SuperEpicPub@25");
		drive.findElement(By.xpath("/html/body/main/section/div/div/div/form/div[2]/button")).click();
		Thread.sleep(500);
		drive.quit();
	}
	
	@Test
	public void webElementsEnabled() throws Exception{
		drive= new ChromeDriver();
		drive.manage().window().maximize();
		drive.navigate().to("https://auth.hollandandbarrett.com/u/login");
		Boolean enabled = drive.findElement(By.id("username")).isEnabled();
		System.out.println(enabled);
		Thread.sleep(500);
		drive.quit();		
	}
	
	@Test
	public void webElementsSelected() throws Exception{
		drive= new ChromeDriver();
		drive.manage().window().maximize();
		drive.navigate().to("https://auth.hollandandbarrett.com/u/login");
		Boolean selected = drive.findElement(By.id("username")).isSelected();
		System.out.println(selected);
		Thread.sleep(500);
		drive.quit();		
	}	
}
