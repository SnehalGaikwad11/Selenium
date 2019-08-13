package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GeoLocationandNotification extends BaseClass
{

	public static void main(String[] args) throws InterruptedException {
		
		
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("disable-geolocation");
		option.addArguments("disable-notification");
		
		WebDriver driver=new ChromeDriver(option);
		
		driver.get("https://www.cleartrip.com");
		driver.manage().window().maximize();

		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='DepartDate']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("15")).click();
		driver.close();

	}

}
