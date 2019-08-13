package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropdownMenu_mouseover {
		public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		//open the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://www.actimind.com/");
		
		Actions actions=new Actions(driver);
		WebElement AreaOfExpertise=driver.findElement(By.xpath("//a[@class='c-link dropdown-toggle']"));
		//actions.moveToElement(AreaOfExpertise).perform();
		
		WebElement cloudApp=driver.findElement(By.linkText("Cloud Applications"));
		//actions.moveToElement(cloudApp).click().perform();
		
		//composite multiple actions can be achieved using the below statement
		actions.moveToElement(AreaOfExpertise).moveToElement(cloudApp).click().build().perform();
		
		}
}

