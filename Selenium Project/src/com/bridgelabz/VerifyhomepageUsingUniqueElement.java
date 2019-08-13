package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class VerifyhomepageUsingUniqueElement {

	public static void main(String[] args) throws InterruptedException {
		
        //Create instance of chrome option class for notification pop up handling
		ChromeOptions options = new ChromeOptions();
		//add chrome switch to disable notification
		options.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		//Pass chrome option instance to chrome driver constructor
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com");
		//for maximize window
        driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("9158472761");
		driver.findElement(By.name("pass")).sendKeys("Snehal@1234");
		driver.findElement(By.xpath("//label[@id='loginbutton']")).click();
		Thread.sleep(3000);

		// WebDriver driver =new ChromeDriver(options);

		WebElement more = driver.findElement(By.xpath("//div[@id='userNavigationLabel']"));
		more.click();
		Thread.sleep(3000);

		WebElement logoutBtn = driver.findElement(By.xpath("//li[@class='_54ni navSubmenu _6398 _64kz __MenuItem']"));
		
		if (logoutBtn.isDisplayed()) 
		{
			System.out.println("Welcome to Facebook home page");
		} else {
			System.out.println("Home page is NOT displayed");
		}
		logoutBtn.click();
	}
}
	

