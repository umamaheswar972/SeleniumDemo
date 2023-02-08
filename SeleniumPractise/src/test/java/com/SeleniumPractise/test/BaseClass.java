package com.SeleniumPractise.test;

import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	WebDriver driver;
	Logger log;
	@BeforeTest
	public void setup()
	{
	
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//target//resources//Drivers//chromedriver.exe");
	driver = new ChromeDriver();
	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	log = Logger.getLogger("SeleniumPractise");
	PropertyConfigurator.configure("log4j.properties");
	}
	
	@AfterTest
	public void teardown()
	{
	 System.out.println("Closing the driver instance");	
	 driver.close();
	}

}
