package com.iNetbankingV2.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig()
	{
		File src = new File("./Configurations/config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception is"+e.getMessage());
		}
		
	}
	
	public String getApplicationUrl()
	{
		String url = pro.getProperty("baseURL");
		return url;
		
	}
	public String getUser()
	{
		String uname = pro.getProperty("username");
		return uname;
		
	}
	public String getPassword()
	{
		String pwd = pro.getProperty("password");
		return pwd;
		
	}
	public String getChromePath()
	{
		String chrome = pro.getProperty("chromepath");
		return chrome;
		
	}
	public String getFirefoxPath()
	{
		String firefox = pro.getProperty("firefoxpath");
		return firefox;
		
	}
	public String getIEPath()
	{
		String ie = pro.getProperty("iepath");
		return ie;
		
	}
	public String getEDGEPath()
	{
		String edge = pro.getProperty("edgepath");
		return edge;
		
	}
	
	

}
