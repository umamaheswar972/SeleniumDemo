package com.SeleniumPractise.test;

import org.testng.annotations.Test;

public class GoogleTest1 extends BaseClass {
	

	@Test
	public void test()
	{
	driver.get("https://www.google.co.in/");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	String title = driver.getTitle();
	if(title.equals("Google"))
		System.out.println("Page Title is Matched");
	else 
		System.out.println("Page Title is Mismatched");
	}
	
	
}

