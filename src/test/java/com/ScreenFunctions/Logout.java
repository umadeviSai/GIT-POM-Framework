package com.ScreenFunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Logout {

	@FindBy(how = How.ID, using = "welcome")
	public static WebElement Btn_Logout_Welcome;

	@FindBy(how = How.XPATH, using = "//*[text()='Logout']")
	public static WebElement Btn_Logout_Logout;

	public static boolean Logoutvalue() {
		boolean status = true;
		try{
			Btn_Logout_Welcome.click();
			Btn_Logout_Logout.click();			
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("Logout is not successful");
		}
	
		return status;
	}

}
