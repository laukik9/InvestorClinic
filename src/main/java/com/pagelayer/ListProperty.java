package com.pagelayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testbase.TestBase;

public class ListProperty extends TestBase {

	public ListProperty()
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
	
	
	
	@FindBy(xpath="//body/ngb-modal-window[1]/div[1]/div[1]/div[1]/button[1]")
	private WebElement crossBtn;
	
	
	
	@FindBy(xpath="//input[@id='name']")
	private WebElement firstName;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement email;
	
	@FindBy(xpath="//option[contains(@value,'female')]")
	private WebElement gender;
	
	@FindBy(xpath="//button[contains(text(),'Save')]")
	private WebElement save;
	
	
	@FindBy(xpath="//button[contains(text(),'Sell/Rent Property')]")
	private WebElement SellRentProperty;
	
	@FindBy(xpath="//button[contains(text(),'Rent / Lease')]")
	private WebElement rentTab;
	
	@FindBy(xpath="//input[@id='inlineRadio1']")
	private WebElement residentialTabRadioBtn;
	
	@FindBy(xpath="//button[contains(text(),'Apartments')]")
	private WebElement Apartment;
	
	@FindBy(xpath="//button[contains(text(),'Next')]")
	private WebElement NextBtn;
	
	
	
	
	
	
	
	
	
	
//	
//	@FindBy(xpath="//button[contains(text(),'Rent / Lease')]")
//	private WebElement rentTab1;
//	
//	@FindBy(xpath="//input[@id='inlineRadio1']")
//	private WebElement residentialTab1;
//	
//	@FindBy(xpath="//button[text()='Apartment']")
//	private WebElement Apartment1;
//	
//	@FindBy(xpath="//button[contains(text(),'Save & Next')]")
//	private WebElement SaveNextBtn;
//	
	
	
	
	
	//...Action class.....
	
	public void clickOnLoginBtn()
	{
		login_btn.click();
		
	}
	
	public void enterMobileNo()
	{
		ClickOnMobileNoField.sendKeys("7687112211");
		
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
	
	public void clickOncrossBtn()
	{
		crossBtn.click();
	}
	
	public void enterFirstname()
	{
		firstName.sendKeys("meena");
	}
	
	public void enterEmailid()
	{
		email.sendKeys("meena@gmail.com");
	}
	
	public void selectGender()
	{
		gender.click();
	}
	
	public void clickOnsaveBtn()
	{
		save.click();
	}
	
	public void clickOnListPropertyBtn()
	{
		SellRentProperty.click();
	}
	
	public void scriptExec()
	{
		JavascriptExecutor ls = (JavascriptExecutor)driver;
        ls.executeScript("window.scrollBy(0,100)");
	}
	
	public void selectRentTab()
	{
		rentTab.click();
	}
	
	public void selectResidential()
	{
		residentialTabRadioBtn.click();
	}
	
	public void selectApartment()
	{
		Apartment.click();
	}
	
	public void clickOnNextBtn()
	{
		NextBtn.click();
	}
	
	
	
	
	
	
	
	

//	
//	
//	//Next page
//	public void selectRentNxt()
//	{
//		rentTab1.click();
//	}
//	
//	public void selectResidentialNxt()
//	{
//		residentialTab1.click();
//	}
//	
//	public void selectApartmentNxt()
//	{
//		Apartment1.click();
//	}
//	
//	public void clickOnSaveNextBtnNxt()
//	{
//		SaveNextBtn.click();
//	}
//	
	
	
	
	

}
