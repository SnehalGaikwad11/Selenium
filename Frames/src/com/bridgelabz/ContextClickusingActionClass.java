package com.bridgelabz;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextClickusingActionClass extends BaseClass 
{
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		//enter the url
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		//find the ActiTIME Inc. link
		WebElement link = driver.findElement(By.linkText("Forgotten account?"));
		
		//right click (context click) on actitime link
		Actions actions = new Actions(driver);
		actions.contextClick(link).perform();
		Thread.sleep(3000);
		
		//press 'w' from the keyboard for opening in a new window
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_W);
		
		//quit() method closes all the browsers opened by Selenium
		driver.quit();
				
		
		
	}

}
