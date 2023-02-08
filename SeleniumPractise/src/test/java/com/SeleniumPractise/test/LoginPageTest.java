package com.SeleniumPractise.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SeleniumPractise.pages.LoginPage;

public class LoginPageTest extends BaseClass {
	
	LoginPage loginpage;
	
	@Test
	public void login_test()
	{
		driver.get("http://demo.guru99.com/V4/");
		driver.manage().window().maximize();
		loginpage = new LoginPage(driver);
		String title = loginpage.getLoginTitle();
		Assert.assertTrue(title.toLowerCase().contains("guru99 bank"));
		loginpage.loginToGuru99("mngr26593", "Atharv@12");
	}
	

}
