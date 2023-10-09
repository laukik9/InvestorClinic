package com.testlayer;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.pagelayer.Customer;
import com.pagelayer.ListProperty;
import com.testbase.TestBase;   //<class name="com.testlayer.CustomerOnboardTest"/>  <class name="com.testlayer.BuilderOnBoarding"/>


public class ListPropertyTest extends TestBase {
	//@SuppressWarnings("deprecation")
	@Test
	public void listProp() throws InterruptedException
	{
		ListProperty c = new ListProperty();  //custumOnb
		c.clickOnLoginBtn();
		c.enterMobileNo();
		c.clickOnContinueBtn();
		Thread.sleep(3000);
		c.enterOTP();
		c.clickOnContinueBtnOfOTP();
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		Thread.sleep(1500);
		c.enterFirstname();
		c.enterEmailid();
		Thread.sleep(1000);
		c.selectGender();
		c.clickOnsaveBtn();
		//c.clickOncrossBtn();
		//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		Thread.sleep(9000);
		c.clickOnListPropertyBtn();
		//Thread.sleep(1000);
		c.scriptExec();
		Thread.sleep(1500);
		c.selectRentTab();
		c.selectResidential();
		c.selectApartment();
		Thread.sleep(1000);
		c.clickOnNextBtn();
		
		
		
		
		
//		Thread.sleep(1500);
//		c.selectRentNxt();
//		c.selectResidentialNxt();
//		c.selectApartmentNxt();
//		c.clickOnSaveNextBtnNxt();
	}
//    <class name="com.testlayer.REAonboardTest"/>
//	 <class name="com.testlayer.CustomerOnboardTest"/>
//		<class name="com.testlayer.BuilderOnBoarding"/>
//		 <class name="com.testlayer.NonREAonboardTest"/>
//	 <class name="com.testlayer.ListPropertyTest"/>

}
