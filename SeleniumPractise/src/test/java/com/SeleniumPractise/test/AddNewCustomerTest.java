package com.SeleniumPractise.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SeleniumPractise.pages.AddNewCustomerPage;
import com.SeleniumPractise.pages.LoginPage;

public class AddNewCustomerTest extends BaseClass {
	AddNewCustomerPage addCustomer;
	LoginPage loginpage;
	
	@Test
	public void AddCustomerTest() throws InterruptedException
	{
		driver.get("http://demo.guru99.com/V4/");
		driver.manage().window().maximize();
		loginpage = new LoginPage(driver);
		String title = loginpage.getLoginTitle();
		Assert.assertTrue(title.toLowerCase().contains("guru99 bank"));
		loginpage.loginToGuru99("mngr26593", "Atharv@12");
		log.info("Logged into application");
		driver.findElement(By.xpath("//a[contains(text(),'New Customer')]")).click();
		System.out.println(driver.getTitle());
		addCustomer=new AddNewCustomerPage(driver);
		//Thread.sleep(200);
		log.info("Adding new customer");
		addCustomer.addNewCustomer("umesh", "Female","22-07-1995","Brahmadevam, Muthukur Mandal,Nellore district","Nellore","AndhraPradesh");
		
	}

}
