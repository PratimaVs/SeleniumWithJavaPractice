package com.dataDriven;

import java.io.FileReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import au.com.bytecode.opencsv.CSVReader;

public class CSVFileReading {
	
	WebDriver drive;
	//String csvPath = "C:\\Users\\Administrator\\Desktop\\Selenium\\SeleniumPractise\\DataDrivenProjectCSVFile\\demo\\demoCSV.csv";
	String csvPath = "./demo/demoCSVV.csv";
	
	@BeforeTest
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriverJars\\chromedriver.exe");
		drive= new ChromeDriver();
		drive.manage().window().maximize();
		drive.get("http://only-testing-blog.blogspot.com/2014/05/form.html");
		
	}
	
	@Test
	public void locatorsTestingBlog() throws Exception
	{
		CSVReader reader = new CSVReader(new FileReader(csvPath));
		String[] csvCell;
		
		while((csvCell = reader.readNext()) != null)
		{
			String FName = csvCell[0];
			String LName = csvCell[1];
			String Email = csvCell[2];
			String Mob = csvCell[3];
			String CName = csvCell[4];
			
			
			drive.findElement(By.name("FirstName")).sendKeys(FName);
			drive.findElement(By.name("LastName")).sendKeys(LName);
			drive.findElement(By.name("EmailID")).sendKeys(Email);
			drive.findElement(By.name("MobNo")).sendKeys(Mob);
			drive.findElement(By.name("Company")).sendKeys(CName);
			
			Thread.sleep(400);
			drive.findElement(By.xpath("//input[@value='Submit']"));
			Thread.sleep(400);
			drive.switchTo().alert().accept();
		}
		reader.close();
	}
	
	@AfterMethod
	public void quits() {
		drive.quit();
	}

	
	
}
