package com.bridgelabz;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.openqa.selenium.By;

//Test Scenario:
//1. Access the website url http://www.indeed.co.in.
//2. Click on upload resume link.
//3. Implement the Logic using the java.awt.robot to provide the absolute location of the file.
//
//4. Capture the full page of the screenshot by providing the dimensions.

public class FileUploadUsingRobot extends BaseClass {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		driver.manage().window().maximize();

		driver.get("https://www.indeed.co.in");
		
		driver.findElement(By.xpath("//a[@class='icl-Button icl-Button--primary icl-Button--md']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class='icl-Button icl-Button--primary icl-Button--lg icl-Button--block janus-upload-button']")).click();
	    Thread.sleep(1000);
	    
	    StringSelection strSel=new StringSelection("/home/userq/AResume");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSel, null);

	    
	    
	    Robot robot=new Robot();
	    //using this key copy the resume
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    //enter the path using Enter key and get the resume
	    robot.keyPress(KeyEvent.VK_ENTER);
	    Thread.sleep(2000);
	    //upload the resume and also hit the key and upload the resume on site
	    robot.keyRelease(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	    Thread.sleep(2000);
	    
	    
	    
	    
	    Rectangle d1 = new Rectangle(1200,1800);
		BufferedImage bufImage = robot.createScreenCapture(new Rectangle(d1));
		File f = new File("./screenshot/indeedscreenshot.jpg");
		ImageIO.write(bufImage,"jpg", f);
		driver.close();
			
	}

}
