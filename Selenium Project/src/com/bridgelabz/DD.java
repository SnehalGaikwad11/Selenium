package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DD {

	@Test
	public void DropDown() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		WebDriver driver = new ChromeDriver();

		// Launch Website
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();

		// Select day from dropdown list using id
		WebElement day_dropdown = driver.findElement(By.id("day"));
		
		// Select month from dropdown list using id
        WebElement month_dropdown = driver.findElement(By.id("month"));
        
		// Select year from dropdown list using id
        WebElement year_dropdown = driver.findElement(By.id("year"));

		Select day_dd = new Select(day_dropdown);
		Select month_dd = new Select(month_dropdown);
		Select year_dd = new Select(year_dropdown);

		
		day_dd.selectByIndex(11);
		System.out.println("Selected day from drop down list using SelectByIndex");
		month_dd.selectByVisibleText("Nov");
		System.out.println("Selected month from drop down list using selectByVisible text");
		year_dd.selectByValue("1996");
		System.out.println("Selected day from drop down list using select by Value");

	}

}
