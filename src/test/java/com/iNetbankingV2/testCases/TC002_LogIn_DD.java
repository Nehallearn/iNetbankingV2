package com.iNetbankingV2.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.iNetbankingV2.pageObjects.LoginPage;
import com.iNetbankingV2.utilities.XLUtils;

public class TC002_LogIn_DD extends BaseClass {
	
	@Test(dataProvider="LoginData")
	public void LoginDDT(String u,String p) throws IOException
	{
		LoginPage lp  = new LoginPage(driver);
		lp.setUsername(u);
		logger.info("User Name entered via Excel File");
		lp.setPassword(p);
		logger.info("Password entered via Excel File");
		lp.clickSubmit();
		logger.info("click on submit for DD test");
		if(isAlertPresent()==true)
		{
			driver.switchTo().alert().accept();
			logger.info("Accepted alert");
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			logger.warn("Login Failed warning");
		}
		else
		{
			Assert.assertTrue(true);
			lp.logout();
			driver.switchTo().alert().accept();
			logger.info("Accepted alert after logout");
			driver.switchTo().defaultContent();
			
		}
				
	}
	
	public boolean isAlertPresent()//user defined method to check alert
	{
		try
		{
			driver.switchTo().alert();
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	
	@DataProvider(name="LoginData")
	String[][] getData() throws Exception
	{
		String path = System.getProperty("user.dir")+"/src/test/java/com/iNetbankingV2/testData/Testdata.xlsx";
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path, "Sheet1", 1);
		String logindata[][] = new String[rownum][colcount];
		
		for(int i =1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j);
				
			}
			
		}
		return logindata;
		
	}

}
