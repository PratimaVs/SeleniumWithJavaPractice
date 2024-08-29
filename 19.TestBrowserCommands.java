package CommandsBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestBrowserCommands {
	
	WebDriver drive;
	@Test
	public void BroswerCommandTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriverJars\\chromedriver.exe");
		drive= new ChromeDriver();
		drive.get("https://auth.hollandandbarrett.com/u/login");
		drive.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println(drive.getTitle());
		String pgsrc= drive.getPageSource();
		System.out.println(pgsrc);

		String url= drive.getCurrentUrl();
		System.out.println(url);
		drive.quit();
	}
		
	}
