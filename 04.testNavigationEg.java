package com.testNavigation;

import org.openqa.selenium.chrome.ChromeDriver;

public class testNavigationEg {

	public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", ".\\ChromeDriverJars\\chromedriver.exe");
			ChromeDriver dr= new ChromeDriver();
			dr.navigate().to("	https://www.google.co.in");
			dr.manage().window().maximize();
			dr.quit();
		}

	}


