package com.iNetbankingV2.testCases;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.iNetbankingV2.pageObjects.LoginPage;

public class TC001_LogIn extends BaseClass{
	
	@Test
	public void Login() throws IOException, Exception
	{
		
		LoginPage lp  = new LoginPage(driver);
		lp.setUsername(username);
		logger.info("User Name entered");
		lp.setPassword(password);
		logger.info("Password entered");
		lp.clickSubmit();
		logger.info("submit button clicked");
		Thread.sleep(3000);
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Page title is fine");
		}
		else
		{
			captureScreen(driver, "Login");
			Assert.assertTrue(false);
			logger.info("Page title is not fine");
		}
	}

}
