package com.GenericFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import ExcelFuntions.ReadExcel;

public class GenericFunctions extends ReadExcel {

	public static WebDriver driver;
	
	public static  boolean launch_Application()
	{
		boolean status=true;
		try
		{
		driver= new FirefoxDriver();
		driver.get("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		System.out.println("Application launched");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("Unable to Launch application");
			status =false;
		}
	return status;			
	}	
	
}
