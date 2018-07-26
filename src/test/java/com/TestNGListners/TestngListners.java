package com.TestNGListners;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.GenerateReports.GenerateReports;

import ExcelFuntions.ReadExcel;

public class TestngListners implements ITestListener, IInvokedMethodListener {
	public static String crntclassname;

	@Override
	public void afterInvocation(IInvokedMethod arg0, ITestResult arg1) {
		// TODO Auto-generated method stub
		GenerateReports.flushReport();
	}

	@Override
	public void beforeInvocation(IInvokedMethod arg0, ITestResult arg1) {
		// TODO Auto-generated method stub
		GenerateReports.starttest(crntclassname);
	}

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext classname) {
		// TODO Auto-generated method stub
		
		ReadExcel.connect_To_Excel();
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult classname) {
		// TODO Auto-generated method stub
		String tcname=classname.getInstanceName().toString();
		int lastpos_dot =tcname.lastIndexOf(".")+1;
		crntclassname=tcname.substring(lastpos_dot);
		GenerateReports.initializeReport(crntclassname);
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

}
