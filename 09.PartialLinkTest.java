package seleniumLocators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.List;

public class PartialLinkTest {

	WebDriver drive;
	int Total = 0;
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriverJars\\chromedriver.exe");
		drive= new ChromeDriver();
		drive.manage().window().maximize();
	}
	
	@Test
	public void PartialLink() throws Exception
	{
		drive.navigate().to("https://www.hollandandbarrett.com/");
		Thread.sleep(400);
		drive.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
		drive.findElement(By.linkText("Vitamins & Supplements")).click();
		
		List<WebElement> links = drive.findElements(By.xpath("//a"));
		int linkCount = links.size();
		Total = Total + links.size();
		
		System.out.println("Number of links: " + linkCount);
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
		}
		
		
	}
	/*
	@AfterTest
	public void closing() throws Exception{
		drive.quit();
		
	}*/
	
	
}
