package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");


		WebDriver driver = new ChromeDriver();

		// Enter the URL of web page
		driver.get("https://www.facebook.com");

		// Used “id” locator to find USERNAME text box
		WebElement unwb = driver.findElement(By.id("email"));
		
	       WebElement css=driver.findElement(By.cssSelector("#email"));


		// Clear the existing value present in the text box
		unwb.clear();

		// Enter value into the USERNAME text box
		unwb.sendKeys("9158472761");

		// Used “name” locator to find Password text box
		WebElement passwb = driver.findElement(By.name("pass"));

		// Clear the existing value present in the text box
         passwb.clear();
         
       //Halt the program execution for 2 seconds
		Thread.sleep(2000);
		
		// Enter value into the PASSWORD text box
       passwb.sendKeys("Snehal@1234");
       
        
    // Find the address of fORGOTTEN ACCOUNT Link and click
		//driver.findElement(By.linkText("Forgotten account?")).click();
       driver.findElement(By.xpath("//*[@id=\"login_form\"]/table/tbody/tr[3]/td[2]/div/a")).click();
		Thread.sleep(2000);

	}

}





