package javaScriptExecuter;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.JavascriptExecutor; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class javaScriptExecuterEg {

	WebDriver drive;
	@Test
	public void Test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriverJars\\chromedriver.exe");
		drive= new ChromeDriver();
		drive.get("http://www.bing.com");
		drive.manage().window().maximize();
		Thread.sleep(700);
		((JavascriptExecutor) drive).executeScript("scroll(0,1400");
		Thread.sleep(400);
		((JavascriptExecutor) drive).executeScript("window.scrollBy(0,-1400");
		drive.quit();
		
		
}
}
