package launchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class allBrowser {

	WebDriver drive;
	@Test(priority=1)
	public void ChromeBrowserLaunch() throws Exception{
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriverJars\\chromedriver.exe");
		drive= new ChromeDriver();
		drive.get("https://auth.hollandandbarrett.com/u/login");
		drive.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println(drive.getTitle());
		drive.quit();
	}
	@Test(priority=2)
	public void FirefoxBrowserLaunch() throws Exception{
		System.setProperty("webdriver.gecko.driver",".\\FirefoxDriverJars\\geckodriver.exe");
		drive= new FirefoxDriver();
		drive.get("https://auth.hollandandbarrett.com/u/login");
		drive.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println(drive.getTitle());
		drive.quit();
	}
	
	@Test(priority=3)
	public void EdgeBrowserLaunch() throws Exception{
		System.setProperty("webdriver.edge.driver",".\\EdgeDriverJars\\msedgedriver.exe");
		drive= new EdgeDriver();
		drive.get("https://auth.hollandandbarrett.com/u/login");
		drive.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println(drive.getTitle());
		drive.quit();
	}
	
}
