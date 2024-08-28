package com.scroll;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;

public class Scroll {
	WebDriver driver;
	
	@BeforeTest
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
	}
	@Test
	public void Example() throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("scroll(0,1200)");
		Thread.sleep(6000);
		((JavascriptExecutor) driver).executeScript("scroll(0,-1400)");
		driver.close();
	}

}
