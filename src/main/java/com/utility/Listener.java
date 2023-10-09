package com.utility;


import org.testng.ITestListener;
import org.testng.ITestResult;

import com.mongodb.diagnostics.logging.Logger;
import com.testbase.TestBase;


public class Listener extends TestBase implements ITestListener {

	public void onTestStart(ITestResult result) {
		//logger.info("Testcase execution started");
	}

	public void onTestSuccess(ITestResult result) {
		//logger.info("Testcase execution Passed");
	}

	public void onTestFailure(ITestResult result) {
		//logger.info("Testcase execution failed");
		UtilityClass.takeScreenShot(result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		//logger.info("Testcase execution skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

}
