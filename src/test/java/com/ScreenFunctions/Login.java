package com.ScreenFunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenerateReports.GenerateReports;

import ExcelFuntions.ReadExcel;

public class Login extends ReadExcel {
	@FindBy(how=How.ID,using="txtUsername")
	public static WebElement Edi_Login_Username;
	
	@FindBy(how=How.ID,using="txtPassword")
	public static WebElement Edi_Login_Password;
	
	@FindBy(how=How.ID,using="btnLogin")
	public static WebElement Btn_Login_Login;
	
public static  boolean enterCredentials()
{  boolean status = true;

	try{
		Edi_Login_Username.sendKeys(getCommonTestdata("UserName"));
		GenerateReports.logEvent("Pass", "UserName Entered");
		Edi_Login_Password.sendKeys(getCommonTestdata("Password"));
		Btn_Login_Login.click();		
		
	}catch(Exception e)
	{
		System.out.println("This is the error MESSAGE" + e.getMessage());
		GenerateReports.logEvent("FAIL","Error in EnterCredentials method "+ e);
		System.out.println("Unable to login to the application");
		status=false;
	}
	return status;
}

}
