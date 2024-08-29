package UtilityDrivers;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Helper {
	public static WebDriver startBrowser(String browser) {
     	WebDriver driver = null;


		if (browser.equalsIgnoreCase("Chrome") || browser.equalsIgnoreCase("GC")
				|| browser.equalsIgnoreCase("Google Chrome")) {
			System.setProperty("webdriver.chrome.driver",".\\ChromeDriverJars\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
		} else if (browser.equalsIgnoreCase("FF") || browser.equalsIgnoreCase("Firefox")
				|| browser.equalsIgnoreCase("Mozila")) {
			System.setProperty("webdriver.gecko.driver",".\\FirefoxDriverJars\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			
		} else if (browser.equalsIgnoreCase("Edge") || browser.equalsIgnoreCase("EG")
				|| browser.equalsIgnoreCase("Microsoft Edge")) {
			System.setProperty("webdriver.edge.driver",".\\EdgeDriverJars\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		} else {
			System.out.println("Sorry we do not support this browser");
		}


		return driver;
	}
	public static void closeBrowser(WebDriver driver) {
		driver.quit();
	}
}
