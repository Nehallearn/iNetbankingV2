package com.iNetbankingV2.testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.testng.annotations.Test;

import com.iNetbankingV2.pageObjects.AddNewCustomer;
import com.iNetbankingV2.pageObjects.LoginPage;

public class TC003_AddCustomer extends BaseClass {
	
	@Test
	public void addNewCustomer() throws Exception
	{
		LoginPage lp  = new LoginPage(driver);
		lp.setUsername(username);
		logger.info("User Name entered");		
		lp.setPassword(password);
		logger.info("Password entered");
		lp.clickSubmit();
		logger.info("submit button clicked");
		
		Thread.sleep(3000);
		
		AddNewCustomer addcus= new AddNewCustomer(driver);
		addcus.clickaddnewCustomer();
		logger.info("New Customer addition page opened");
		logger.info("starting input for new customer");
		addcus.entercustName("Nehal");
		addcus.entercustgender("male");
		addcus.entercustdob("15","12","1990");
		Thread.sleep(3000);
		addcus.entercustaddress("This is Test Address");
		addcus.entercustcity("Bradford");
		addcus.entercuststate("Bihar");
		addcus.entercustpinno("110025");
		addcus.entercusttelephoneno("9810101010");
		String email = randomString()+"@abcd.com";
		addcus.entercustemailid(email);
		addcus.entercustpassword("India");
		logger.info("All Customer details provided");
		addcus.clickonsubmit();
		logger.info("Submit button clicked for new customer addition");
		Thread.sleep(3000);
		boolean res = driver.getPageSource().contains("Customer Registered Successfully!!!");
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("Vrified successfully");
			
		}
		else
		{  
			logger.info("Vrification failed");
			captureScreen(driver, "addNewCustomer");
			Assert.assertTrue(false);
			
		}
		
	}
	
	//user defined function to generate email id dynamically
	public String randomString()
	{
		String a =RandomStringUtils.randomAlphabetic(8);
		return a;
	}

}
