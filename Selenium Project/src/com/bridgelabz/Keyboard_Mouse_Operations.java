package com.bridgelabz;

//abstract window toolkit
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboard_Mouse_Operations {
	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");

		// Launch the browser
		WebDriver driver = new ChromeDriver();

		// enter url
		driver.navigate().to("http://www.gmail.com");
		Thread.sleep(5000);

		// creating an object of robot class
		Robot r = new Robot();

		// move the mouse by x and y coordinate
		r.mouseMove(300, 500);

		// press ALT keyword from keyboard
		r.keyPress(KeyEvent.VK_ALT);

		// press F keyword from keyboard
		r.keyPress(KeyEvent.VK_F);

		// release F keyword from keyboard
        r.keyRelease(KeyEvent.VK_F);
        
		// release ALT keyword from keyboard
        r.keyRelease(KeyEvent.VK_ALT);

		Thread.sleep(3000);
		
        //Press W key from keyboard to open a new private window
		r.keyPress(KeyEvent.VK_W);
		
		//Release W key from keyboard
		r.keyRelease(KeyEvent.VK_W);

		Thread.sleep(3000);
        
		// It will close only the current browser window
		driver.close();
		
		// It will close all the browser windows opened by Selenium
		driver.quit();

	}

}
