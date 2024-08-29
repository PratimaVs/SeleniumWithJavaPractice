package seleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.List;



public class ExampleTagName {


	WebDriver drive;
	/*@Test  
	public void exampleId() throws Exception {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriverJars\\chromedriver.exe");
		drive= new ChromeDriver();
		drive.get("https://auth.hollandandbarrett.com/u/login");
		drive.manage().window().maximize();
		Thread.sleep(400);
		
		String tagname = drive.findElement(By.id("username")).getTagName();
		System.out.println(tagname);
		drive.quit();	
	}*/
	@Test
	public void TagNameGetAttribute() throws Exception {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriverJars\\chromedriver.exe");
		drive= new ChromeDriver();
		drive.get("https://auth.hollandandbarrett.com/u/login");
		drive.manage().window().maximize();
		Thread.sleep(400);
		
		String name = drive.findElement(By.tagName("img")).getAttribute("src");
		System.out.println(name);
		drive.quit();	
	}
	
}
