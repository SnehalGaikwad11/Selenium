package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyhomepageUsingTitle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("9158472761");
		driver.findElement(By.name("pass")).sendKeys("Snehal@1234");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@id='loginbutton']")).click();
		Thread.sleep(3000);
		
		String expectedTitle = "Facebook";
		String actualTitle = driver.getTitle();

		// If actual title contains "Enter Time" text then home page is displayed.
		if (actualTitle.contains(expectedTitle)) {
			System.out.println("Welcome to Facebook home page");
		} else {
			System.out.println("Home page is NOT displayed");
		}
	}
}
