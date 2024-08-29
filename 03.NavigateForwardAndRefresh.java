package com.testNavigation;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateForwardAndRefresh {
	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver", ".\\ChromeDriverJars\\chromedriver.exe");
		ChromeDriver dr= new ChromeDriver();
		dr.navigate().to("https://www.google.co.in");
		dr.manage().window().maximize();
		Thread.sleep(500);
		dr.navigate().to("https://login.yahoo.com/");   
		dr.navigate().back();  //backward
		
		Thread.sleep(500);
		dr.navigate().forward();   //forward
		Thread.sleep(500);
		
		dr.navigate().refresh();
	}
	
}
