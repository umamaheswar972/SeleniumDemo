package com.SeleniumPractise.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomerPage {
	WebDriver driver;
	
	@FindBy(name="name")
	WebElement CustomerName;
	
	@FindBy(xpath="//input[@name=\"rad1\" and @value=\"m\"]")
	WebElement GenderMale;
	
	@FindBy(xpath="//input[@name=\"rad1\" and @value=\"f\"]")
	WebElement GenderFemale;
	
	@FindBy(xpath= "//input[@name='dob']")
	WebElement DOB;
	
	@FindBy(name= "addr")
	WebElement addr;
	
	@FindBy(name="city")
	WebElement city;
	
	@FindBy(name= "state")
	WebElement state;
	
	@FindBy(name="pinno")
	WebElement pin;
	
	@FindBy(name="telephoneno")
	WebElement Mobile;
	
	@FindBy(name="emailid")
	WebElement email;
	
	@FindBy(name="password")
    WebElement password;
	
	@FindBy(xpath="//p[contains(text(), 'Add New Customer')]")
	WebElement pagetitle;
	
	@FindBy(name="sub")
	WebElement submit;
	
	@FindBy(name="res")
	WebElement reset;
	
	public AddNewCustomerPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public String getPageTitle()
	{
		return pagetitle.getText();
	}
	
	//Methods
	public void SetCustomerName(String strCustomerName)
	{
		CustomerName.sendKeys(strCustomerName);
		
	}
	
	public void SetGender(String strGender)
	{
		if(strGender=="Male")
			GenderMale.click();
		else
			GenderFemale.click();
	}
	
	public void setDOB(String strDOB)
	{
		DOB.sendKeys(strDOB);
	}
	
	public void setAddress(String straddr)
	{
		addr.sendKeys(straddr);
	}

	public void setCity(String strcity)
	{
		city.sendKeys(strcity);
	}
	
	public void setState(String strstate)
	{
		state.sendKeys(strstate);
	}
	public void addNewCustomer(String strCustomerName,String strGender, String strDOB, String straddr, String strcity, String strstate)
	{
		this.SetCustomerName(strCustomerName);
		this.SetGender(strGender);
		this.setDOB(strDOB);
		this.setAddress(straddr);
		this.setCity(strcity);
		this.setState(strstate);
	}
	
}


