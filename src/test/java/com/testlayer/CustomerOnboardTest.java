package com.testlayer;

import org.testng.annotations.Test;

import com.pagelayer.Customer;
import com.testbase.TestBase;   //<class name="com.testlayer.CustomerOnboardTest"/>  <class name="com.testlayer.BuilderOnBoarding"/>


public class CustomerOnboardTest extends TestBase {
	@Test
	public void custumOnb() throws InterruptedException
	{
		Customer c = new Customer();
		c.clickOnLoginBtn();
		c.enterMobileNo();
		c.clickOnContinueBtn();
		Thread.sleep(3000);
		c.enterOTP();
		c.clickOnContinueBtnOfOTP(); 
	}
//    <class name="com.testlayer.REAonboardTest"/>
//	 <class name="com.testlayer.CustomerOnboardTest"/>
//		<class name="com.testlayer.BuilderOnBoarding"/>
//		 <class name="com.testlayer.NonREAonboardTest"/>
	//<class name="com.testlayer.ListPropertyTest"/>

}
