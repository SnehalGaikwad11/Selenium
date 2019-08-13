package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowser 
{

	 WebDriver driver;

	 @BeforeTest
	@Parameters("browser")

	

	// Passing Browser parameter from TestNG xml

	public void beforeTest(String browser) {

		// If the browser is chrome, then do this

		if (browser.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver");

			driver = new ChromeDriver();

			// If browser is firefox, then do this

		} else if (browser.equalsIgnoreCase("chrome")) {

			// Here I am setting up the path for my IEDriver

			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");

			driver = new FirefoxDriver();

		}

		// Doesn't the browser type, lauch the Website

		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();

	}

	// Once Before method is completed, Test method will start

	@Test
	public void login() throws InterruptedException {

		// driver.findElement(By.xpath(".//*[@id='account']/a")).click();

		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("snehalbridgelabz@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("Snehal1196");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();

		Thread.sleep(1000);
	}

	@AfterClass
	public void afterTest() {

		driver.quit();

	}

}
