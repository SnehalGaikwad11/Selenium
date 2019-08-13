package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMoment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		//for maximize window
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        //open url
		driver.get("http://spicejet.com/");
		
		
		
        //Mouse moment will be done by actions class
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
        
		Thread.sleep(3000);
		driver.findElement(By.linkText("Hot Meals")).click();
		
	}
	

}
