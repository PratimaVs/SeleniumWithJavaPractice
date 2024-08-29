package seleniumLocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Classname {
	
	WebDriver drive;
	@Test
	public void exampleId() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriverJars\\chromedriver.exe");
		drive= new ChromeDriver();
		drive.get("https://www.hollandandbarrett.com/basket");
		drive.manage().window().maximize();
		Thread.sleep(400);
		boolean displayed = drive.findElement(By.className("ProductCard-module_productImage_7VPgE")).isDisplayed();
		System.out.println(displayed);
		
		
		List<WebElement> elements = drive.findElements(By.className("ProductCard-module_productImage__7VPgE"));
		
		for(WebElement element: elements)
		{
			System.out.println(element.getText());
		}
		drive.quit();
		drive.quit();
}
}
