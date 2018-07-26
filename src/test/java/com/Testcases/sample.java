package com.Testcases;

public class sample {

	public static void main(String[] args) {
		String str="Please enter your email address to create an account.";
		String remainingstring=str.substring(1);
		String firstchar=str.substring(0,1);
		System.out.println("substr  is  "+ firstchar);
		System.out.println("substr1 is " +remainingstring);
		if(firstchar.equals(firstchar.toUpperCase()) && remainingstring.equals(remainingstring.toLowerCase()))
			System.out.println("Test case passed");

	}

}
