package com.bridgelabz;

import org.junit.Test;

public class CrossB {
	
	static{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		//System.setProperty("webdriver.ie.driver","./driver/IEDriverServer.exe");
		}
		WebDriver driver;
		@Test
		@Parameters({"browser"})


		public void VerifyTitle(String browser) {
		if (browser.equals("firefox")) {
		driver = new FirefoxDriver();
		System.out.println("Application get open into FireFox Browser");
		} else 
		{
		driver = new ChromeDriver();
		System.out.println("Application get open into Google Chrome Browser");
		}

		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());

		//driver.quit();
		}
	
	

}
