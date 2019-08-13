package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		//for maximize window
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
        driver.get("https://jqueryui.com/droppable/");
        //it will switch from here to here
       driver.switchTo().frame(0);
        
       
       //to perform drag and drop
       Actions action=new Actions(driver);
        
        action.clickAndHold(driver.findElement(By.xpath("//*[@id=\"draggable\"]")))
        .moveToElement(driver.findElement(By.xpath("//*[@id=\"droppable\"]")))
        .release()
        .build()
        .perform();
        
        System.out.println("Drag And Drop Action Perform Successfully");
        Thread.sleep(1000);
        
        driver.close();
        
	}

}
