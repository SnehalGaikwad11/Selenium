package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		
		//Create instance of chrome option class for notification pop up handling
				ChromeOptions options = new ChromeOptions();
				

				System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
				//Pass chrome option instance to chrome driver constructor
				WebDriver driver = new ChromeDriver(options);
				driver.get("https://ui.cogmento.com");
				//for maximize window
		        driver.manage().window().maximize();
				driver.findElement(By.name("email")).sendKeys("snehalgaikwad52@gmail.com");
				driver.findElement(By.name("password")).sendKeys("Snehal@1234");
				driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//div[@class='ui fitted checkbox']//input")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//body/div[@id='ui']/div[@class='ui fluid container']/div[@class='ui fluid container']/div[@id='top-header-menu']/div[@class='right menu']/div[@class='ui buttons']/div[@class='ui basic button floating item dropdown']/i[1]")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();


	}

}
