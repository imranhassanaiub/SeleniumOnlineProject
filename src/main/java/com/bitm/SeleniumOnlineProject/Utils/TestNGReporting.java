package com.bitm.SeleniumOnlineProject.Utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGReporting implements ITestListener{
	

	public void onStart(ITestContext result)
	{
		System.out.println("Test Execution Has Started : " + result.getName());
	}
	
	public void onTestStart(ITestResult result)
	{
		System.out.println("Test Has Started : " + result.getName());
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test has been Successfull : " + result.getName());
	}
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test Has been Failed  : " + result.getName());
	}
	
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Test Has been Skipped : " + result.getName());
	}
	public void onFinish(ITestContext result)
	{
		System.out.println("Test Execution Has Finished : " + result.getName());
	}
}
