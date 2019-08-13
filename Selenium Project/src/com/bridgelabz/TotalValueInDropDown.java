package com.bridgelabz;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TotalValueInDropDown {
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
		
		List<WebElement>month_list=month_dd.getOptions();
		
		int total_month=month_list.size();
		
		Assert.assertEquals(total_month, 13);
		
		System.out.println("Total month count is:"+total_month);
		
		//enhance loop or advanced loop
		for(WebElement ele:month_list)
		{
			String month_name=ele.getText();
			System.out.println("Months are:"+month_name);
			
		}

}
}
