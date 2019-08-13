package com.bridgelabz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserNavigation {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		//which is used to navigate to any web site.
		driver.navigate().to("http://www.gmail.com");
		
		//for maximize window
		driver.manage().window().maximize();
        Thread.sleep(3000);
        
		//it is used to navigate to the immediate previous page.
		driver.navigate().back();
		System.out.println("Back Action is Performed");
		Thread.sleep(1000);
		
        //it is used to navigate to the immediate next page.
		driver.navigate().forward();
		System.out.println("Forward Action is Performed");
		Thread.sleep(1000);
        
		//it is used to refresh the current page.
		driver.navigate().refresh();
		System.out.println("Refresh Action is Performed");
		Thread.sleep(1000);

		driver.close();

	}

}
