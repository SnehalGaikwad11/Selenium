package com.bridgelabz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
static {
		
		//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver");
	    System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		//System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer");
}

	//public static WebDriver driver = new FirefoxDriver();
	public static WebDriver driver = new ChromeDriver();

	
}


