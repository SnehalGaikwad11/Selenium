package com.bridgelabz;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot {
	public static void main(String[] args) throws Exception {

		// setting the path of the chrome driver executable
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");

		// Launch the chrome browser
		WebDriver driver = new ChromeDriver();
		
		
		// Creating an object of date class
		Date d = new Date();

		// Printing the actual date
		String date1 = d.toString();
		System.out.println(date1);

		driver.get("https://www.facebook.com");
		//for maximize window
        driver.manage().window().maximize();

		
		// down casting WebDriver to use getScreenshotAs method.

		TakesScreenshot ts = (TakesScreenshot) driver;

		//This line of code will store the screenshot in some temporary files or folder location
		File srcFile = ts.getScreenshotAs(OutputType.FILE);

		File destFile = new File("./ScreenShot/Facebook1.png");

		Files.copy(srcFile, destFile);

		driver.close();

	}

}
