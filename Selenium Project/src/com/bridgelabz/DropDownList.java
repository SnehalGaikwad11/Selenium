package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownList {

	@Test
	public void SelectDD() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		// Launch Website
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();

		
		WebElement month_dropdown=driver.findElement(By.id("month"));
		
		Select month_dd=new Select(month_dropdown);
		
		//It will select November
		month_dd.selectByIndex(11);
		System.out.println("Select By Index used in dropdown is passed");
		Thread.sleep(3000);
		
		//It will select June
		month_dd.selectByValue("6");
		System.out.println("Select By Value used in dropdown is passed");
		Thread.sleep(3000);
		
		//it will select April
		month_dd.selectByVisibleText("Apr");
		System.out.println("Select By VisibleText used in dropdown is passed");
		
	}

}
