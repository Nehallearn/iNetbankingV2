package com.iNetbankingV2.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	public LoginPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(name="uid")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(css="input[name='password']")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@value='LOGIN']")
	@CacheLookup
	WebElement loginButton;
	
	@FindBy(css="ul.menusubnav>li:nth-child(15) >a")
	@CacheLookup
	WebElement logoutlink;
	
	public void setUsername(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	public void clickSubmit()
	{
		loginButton.click();;
	}
	
	public void logout()
	{
		logoutlink.click();
	}
	
	

}
