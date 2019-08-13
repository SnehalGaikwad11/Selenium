package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Independent_Dependent_Xpath_Seleniumsite_javaDownload {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");

		WebDriver driver = new ChromeDriver();
// enter the url
		driver.get("http://www.seleniumhq.org/download/");
		Thread.sleep(3000);
// xpath using independent and dependent concept
		driver.findElement(By.xpath("//td[.='Java']/..//a[.='Download']")).click();
	}
}
