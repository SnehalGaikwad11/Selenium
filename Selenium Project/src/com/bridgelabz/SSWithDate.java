package com.bridgelabz;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;

public class SSWithDate extends BaseClass{
	
public static void main(String[] args) throws IOException {
	
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	
	Date d=new Date();
	
	// Printing the actual date
			String date1 = d.toString();
			System.out.println(date1);
			
			//replacing the colon present in the date timestamp format to "_" using replaceAll()
			//method of string class
			String date2 = date1.replaceAll(":", "_");
			System.out.println(date2);
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			
			File srcFile = ts.getScreenshotAs(OutputType.FILE);
			
			// Open the current date and time for console print
			//String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
			
			File destFile = new File("./ScreenShot/"+date2+"_Facebook4.png");
			//File destFile = new File(".\\screenshot\\"+date2+"__actiTIMELoginPage.png");

			Files.copy(srcFile, destFile);

			driver.close();



}	
	
	
	
	
}
