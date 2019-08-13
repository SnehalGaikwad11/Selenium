package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyhomepageUsingUrl {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("9158472761");
		driver.findElement(By.name("pass")).sendKeys("Snehal@1234");
		driver.findElement(By.xpath("//label[@id='loginbutton']")).click();
		Thread.sleep(3000);
		
		String expectedUrl = "https://www.facebook.com";
		String actualUrl = driver.getCurrentUrl();
		if (actualUrl.contains(expectedUrl)) {
			System.out.println("Welcome to Facebook home page");
		} else {
			System.out.println("Home page is NOT displayed");
		}
	}
}
