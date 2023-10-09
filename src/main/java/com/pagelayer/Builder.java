package com.pagelayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.testbase.TestBase;

// Test Script logic/ we are maintaining here the 
public class Builder extends TestBase { 
	
	public Builder()
	{
		PageFactory.initElements(driver, this);// using it to find hidden elements 
	}
	//Static method(initelement, initialise data members
	
	//.....obj repo....
	
	
			
	@FindBy(xpath="//button[contains(text(),'Login')]")
	private WebElement login_btn;
	
	@FindBy(xpath="//a[contains(text(),'Sign in as Partner')]")
	private WebElement Sign_IN_As_Partner;
	
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
		
		@FindBy(xpath="//body/app-root[1]/app-select-user-type[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/img[1]\r\n"
				+ "")
		private WebElement verifyBuilderImage;
		
		@FindBy(xpath="//button[@class='btn btn-default active-btn']")
		private WebElement verifyContinueBtnForBuilder;
		
		@FindBy(xpath="//button[contains(text(),'Continue')]")
		private WebElement clickOnContinueButtonForAnimation;
		
		@FindBy(xpath="//input[@formcontrolname='fullName']")
		private WebElement fullNameField;
		
		@FindBy(xpath="//select[@formcontrolname='gender']")
		private WebElement genderField;
		
		////input[@placeholder='DOB (yyyy-mm-dd)']
		
		@FindBy(xpath="//body/app-root[1]/app-builder[1]/app-personal-detail-builder[1]/div[1]/app-personal-detail[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[4]/mat-datepicker-toggle[1]/button[1]")  
		private WebElement DOBfield;  //tbody/tr[2]/td[3]/button[1]/div[1]
		
		@FindBy(xpath="//div[contains(text(),'2')]")
		private WebElement seleDOBfield;
		
		
		@FindBy(xpath="//input[@id='email']")
		private WebElement eMAILfield;
		
		@FindBy(xpath="//input[@id='address']")
		private WebElement AddressField;
		
		@FindBy(xpath="//input[@id='locality']")
		private WebElement LocalityField;
		
		@FindBy(xpath="//select[@formcontrolname='states']")
		private WebElement State_Droop_Down;
		
		@FindBy(xpath="//input[@formcontrolname='city']")
		private WebElement City;
		
		@FindBy(xpath="//span[contains(text(),'New Delhi')]")
		private WebElement CityOption;
		
		
		@FindBy(xpath="//input[@id='pincode']")
		private WebElement PinCode_Field;
		
		@FindBy(xpath="//input[@id='inventoriesSold']")
		private WebElement Inventories_Field;
		
		@FindBy(xpath="//input[@id='turnover']")
		private WebElement TurnOver_Field;
		
		@FindBy(xpath="//input[@id='location']")
		private WebElement Current_work_location_Field;
		
		@FindBy(xpath="//input[@id='organization']")
		private WebElement Organization_Name_Field;
		
		@FindBy(xpath="//input[@id='pac-input']")
		private WebElement Locations_Worked_On_Field_Builder;
		
		@FindBy(xpath="//span[contains(text(),'Noida')]")
		private WebElement sele_Worked_On_Field_Builder;
		
		@FindBy(xpath="//button[@class='btn btn-default']")
		private WebElement Submit_Btn_Builder_PersonalForm;
		
		@FindBy(xpath="//body/app-root[1]/app-verify-kyc[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/label[1]/img[1]")
		private WebElement photo_upload_click;
		
		@FindBy(xpath="//input[@id='panNumber']") //GFDPS0591T
		private WebElement pancard_Field;
		
		@FindBy(xpath="//input[@id='gstNumber']")  //07AAGFF2194N1Z8
		private WebElement Gst_Field;
		
		@FindBy(xpath="//body/app-root[1]/app-verify-kyc[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[3]/label[1]/input[1]")
		private WebElement IagreeWithTermOfUse_Field;
		
		@FindBy(xpath="//button[contains(text(),'Submit')]")
		private WebElement Submit_Button_For_kycField;
		
		
		//...Action class.....
		
		public void clickOnLoginBtn()
		{
			login_btn.click();
			
		}
		
		public void clickOnSignInAsPartner()
		{
			Sign_IN_As_Partner.click();
		}
		
		public void enterMobileNo()
		{
			ClickOnMobileNoField.sendKeys("6733220000");
			
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
		
		public void clickOnBuilderImage()
		{
			verifyBuilderImage.click();
		}
		
		public void clickOnContinueButtonForBuilder()
		{
			verifyContinueBtnForBuilder.click();
		}
		////button[contains(text(),'Continue')]
		
		public void clickOnContinueButtonForAnimation()
		{
			verifyContinueBtnForBuilder.click();
		}
		
		
		public void enterFullName()
		{
			fullNameField.sendKeys("Jassi");
		}
		
		public void selectGender()
		{
			genderField.click();
			Select m= new Select(genderField);
			m.selectByVisibleText("Female");
			
		}
		////div[contains(text(),'12')]
		public void clickDOBfield()
		{
			DOBfield.click();
			
		}
		
		public void selectDOBfield()
		{
			seleDOBfield.click();
			
		}
		
		public void enterEmail()
		{
			eMAILfield.sendKeys("jassi12@gmail.com");
			
		}
		
		public void enterAddressField()
		{
			AddressField.sendKeys("TS-01");
			
		}
		
		public void enterLocality()
		{
			LocalityField.sendKeys("Chauhan marg");
			
		}
		
		public void scriptExecuto()
		{
			JavascriptExecutor ls = (JavascriptExecutor)driver;
	        ls.executeScript("window.scrollBy(0,300)");
		}
		
		public void SelectStateDropD()
		{
			State_Droop_Down.click();
			Select z=new Select(State_Droop_Down);
			z.selectByVisibleText("Delhi");
			
		}
		
		public void SelectCity() throws InterruptedException
		{
			City.click();
//			Select q=new Select(City);
//			q.selectByVisibleText("New Delhi");
			Thread.sleep(2000);
			CityOption.click();
			
		}
		
		public void scriptExecutor()
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("scrollBy(0,2000)");
		}
		
		public void EnterPincode()
		{
			PinCode_Field.sendKeys("891234");
			
		}
		
		public void EnterInventorySold()
		{
			Inventories_Field.sendKeys("89");
			
		}
		
		public void EnterTurnOver()
		{
			TurnOver_Field.sendKeys("65");
			
		}
		
		public void EnterWorkLocation()
		{
			Current_work_location_Field.sendKeys("Pune");
			
		}
		
		public void EnterOrganization()
		{
			Organization_Name_Field.sendKeys("matrix");
			
		}
		
		public void EnterLocationBeingServed() throws InterruptedException
		{
			Locations_Worked_On_Field_Builder.sendKeys("Noida");
			Thread.sleep(1000);
			sele_Worked_On_Field_Builder.click();
			
		}
		
		public void ClickOnSubmitBtnBuilderPersonalForm()
		{
			
			Submit_Btn_Builder_PersonalForm.click();
			
		}
		
		public void UploadImg()
		{
			
			photo_upload_click.click();  
			
			
		}
//		
//		public void ClickUploadImg()
//		{
//			String fileinput="C:\\img\\Sample-JPEG-Image-File-Download-scaled.jpg";
//			
//			photo_upload_click.sendKeys(fileinput); 
//			
//			
//		}
		
		public void EnterPancardNumber()
		{
			pancard_Field.sendKeys("GFDPS0591T");
			
		}
		
		public void EnterGSTnumber()
		{
			Gst_Field.sendKeys("07AAGFF2194N1Z8");
			
		}
		
		public void ClickOnIagreeWithTermOfUse_FieldCheckBox()
		{
			IagreeWithTermOfUse_Field.click();
			
		}
		
		public void SubmitButtonKYCbuilder()
		{
			Submit_Button_For_kycField.click();
			
		}
		
		
		


	

}
