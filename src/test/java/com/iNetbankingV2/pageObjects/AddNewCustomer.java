package com.iNetbankingV2.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomer {
	
	WebDriver ldriver;
	public AddNewCustomer(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(css="ul.menusubnav:nth-child(1) > li:nth-child(2) > a")
	@CacheLookup
	WebElement addnewCustomerlink;
	
	@FindBy(css="input[name='name']")
	@CacheLookup
	WebElement customerName;
	
	@FindBy(css="input[value='m']")
	@CacheLookup
	WebElement gender;
	
	@FindBy(css="#dob")
	@CacheLookup
	WebElement dateofbirth;
	
	@FindBy(css="textarea[name='addr']")
	@CacheLookup
	WebElement address;
	
	@FindBy(css="input[name='city']")
	@CacheLookup
	WebElement city;
	
	@FindBy(css="input[name='state']")
	@CacheLookup
	WebElement state;
	
	@FindBy(css="input[name='pinno']")
	@CacheLookup
	WebElement pin;
	
	@FindBy(css="input[name='telephoneno']")
	@CacheLookup
	WebElement mobilenumber;
	
	@FindBy(css="input[name='emailid']")
	@CacheLookup
	WebElement email;
	
	@FindBy(css="input[name='password']")
	@CacheLookup
	WebElement password;
	
	@FindBy(css="input[value='Submit']")
	@CacheLookup
	WebElement submit;
	
	
	public void clickaddnewCustomer()
	{
		addnewCustomerlink.click();
	}
	
	public void entercustName(String cname) {
		customerName.sendKeys(cname);
		
	}

	public void entercustgender(String cgender) {
		gender.click();
	}

	public void entercustdob(String mm,String dd,String yy) {
		dateofbirth.sendKeys(mm);
		dateofbirth.sendKeys(dd);
		dateofbirth.sendKeys(yy);
		
	}

	public void entercustaddress(String caddress) {
		address.sendKeys(caddress);
	}

	public void entercustcity(String ccity) {
		city.sendKeys(ccity);
	}

	public void entercuststate(String cstate) {
		state.sendKeys(cstate);
	}

	public void entercustpinno(String cpinno) {
		pin.sendKeys(cpinno);
	}

	public void entercusttelephoneno(String ctelephoneno) {
		mobilenumber.sendKeys(ctelephoneno);
	}

	public void entercustemailid(String cemailid) {
		email.sendKeys(cemailid);
	}

	public void entercustpassword(String cpassword) {
		password.sendKeys(cpassword);
	}

	public void clickonsubmit() {
		submit.click();
	}
	

}
