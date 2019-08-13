package com.bridgelabz;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class Alert_PopUp extends BaseClass
{
	public static void main(String[] args) {
		
		driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[contains(text(),'Generate Alert Box')]")).click();
		
		//handling alert boxes 
		//click on generate alert button
		Alert alert=(Alert) driver.switchTo().alert();
		//using accept method accept the alert box
		alert.accept();
		
		
		//handling confirmation box
		//click on generate confirm box
		driver.findElement(By.xpath("//button[contains(text(),'Generate Confirm Box')]")).click();
		
		
		Alert confirmBox=(Alert)driver.switchTo().alert();
		
		((Alert)confirmBox).dismiss();
		
	}
	

}
