package com.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testbase.TestBase;

public class Customer extends TestBase {

	public Customer()
	{
		PageFactory.initElements(driver, this);
	}
	
	//.....obj repo....
	
	
	@FindBy(xpath="//button[contains(text(),'Login')]")
	private WebElement login_btn;
	
	@FindBy(xpath="//input[@id='phone']")
	private WebElement ClickOnMobileNoField;
	
	@FindBy(xpath="//button[@class='btn btn-defult continue-btn btn-active']")
	private WebElement verifyContinueBtn;
	//------for OTP field----
	@FindBy(xpath="//input[@id='first']")
	private WebElement otp1field;
	
	@FindBy(xpath="//input[@id='second']")
	private WebElement otp2field;
	
	@FindBy(xpath="//input[@id='third']")
	private WebElement otp3field;
	
	@FindBy(xpath="//input[@id='fourth']")
	private WebElement otp4field;
	
	@FindBy(xpath="//input[@id='fifth']")
	private WebElement otp5field;
	
	@FindBy(xpath="//input[@id='sixth']")
	private WebElement otp6field;
	
	@FindBy(xpath="//button[@class='btn btn-defult continue-btn btn-active']")  // OTP page continue button
	private WebElement verifyContinueBtnOtp;
	
	
	
	//...Action class.....
	
	public void clickOnLoginBtn()
	{
		login_btn.click();
		
	}
	
	public void enterMobileNo()
	{
		ClickOnMobileNoField.sendKeys("8888556611");
		
	}
	
	public void clickOnContinueBtn()
	{
		verifyContinueBtn.click();
	}
	
	public void enterOTP()
	{
		otp1field.sendKeys("1");
		otp2field.sendKeys("2");
		otp3field.sendKeys("3");
		otp4field.sendKeys("4");
		otp5field.sendKeys("5");
		otp6field.sendKeys("6");
	}
	
	public void clickOnContinueBtnOfOTP()
	{
		verifyContinueBtnOtp.click();
	}

}
