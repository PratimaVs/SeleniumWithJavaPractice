package screenshot;

import java.io.IOException;
import java.io.File;
import org.openqa.selenium.TakesScreenshot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotExample {

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriverJars\\chromedriver.exe");
		ChromeDriver drive= new ChromeDriver();
		drive.manage().window().maximize();
		drive.manage().deleteAllCookies();
		
		drive.get("https://www.google.com");
		File src =((TakesScreenshot)drive).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./demoScreenShot/googleHomepage.png"));
		drive.quit();
		
		
	}
}
