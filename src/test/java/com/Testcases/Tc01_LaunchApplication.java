package com.Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericFunctions;
import com.ScreenFunctions.Login;
import com.ScreenFunctions.Logout;

public class Tc01_LaunchApplication extends GenericFunctions {

	@Test

	public static void validate_LoginPage() {
		boolean status;
		status = launch_Application();
		if (status) {
			System.out.println("Enter Credentials");
			Login lgn = PageFactory.initElements(driver, Login.class);
			Logout lgt = PageFactory.initElements(driver, Logout.class);
			lgn.enterCredentials();
			if (lgt.Logoutvalue())
				System.out.println("Logout is successful");
			System.out.println("End of the HRM program");
		}
	}

	@Test
	public static void excel() {
		System.out.println(System.getProperty("user.dir"));
		connect_To_Excel();
		getCommonTestdata("UserName");

	}

}
