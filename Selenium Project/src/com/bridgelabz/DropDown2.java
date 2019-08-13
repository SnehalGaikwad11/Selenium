package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown2 {
	@Test
	public void SelectDD()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		// Launch Website
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();

		//Select month fr4om dropdown list using id
		WebElement month_dropdown=driver.findElement(By.id("month"));
		
		Select month_dd=new Select(month_dropdown);
		
		WebElement selected_value=month_dd.getFirstSelectedOption();
		
		//it should return me month
		System.out.println("Before selelction selected value is:"+selected_value.getText());
		
		//It will select November
		month_dd.selectByIndex(11);
		
		WebElement selected_value1=month_dd.getFirstSelectedOption();
		
		//it should return me month
		System.out.println("After selelction selected value is:"+selected_value1.getText());
		
		
	}

}
