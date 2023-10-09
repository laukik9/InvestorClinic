package com.pagelayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.testbase.TestBase;

public class RealEstateAgent extends TestBase {
	
	public RealEstateAgent()
	{
		PageFactory.initElements(driver, this);
	}
	
	//......obj.................
	
	@FindBy(xpath="//button[contains(text(),'Login')]")
	private WebElement login_btn;
	
	@FindBy(xpath="//a[contains(text(),'Sign in as Partner')]")
	private WebElement Sign_IN_As_Partner;
	
	@FindBy(xpath="//input[@id='phone']")
	private WebElement ClickOnMobileNoField;
	
	@FindBy(xpath="//button[contains(text(),'Continue')]")//      //button[@class='btn btn-defult continue-btn btn-active']
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
		
		@FindBy(css = "img[src='assets/images/agent1.svg']")  
		private WebElement verifyAgentImage;
		
		@FindBy(xpath="//button[contains(text(),'Continue')]") //
		private WebElement verifyContinueBtnForAgent;
		
		@FindBy(xpath="//body/app-root[1]/app-seletect-agent-type[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/label[1]")
		private WebElement YesRadio_Btn;
		
		@FindBy(xpath="//button[contains(text(),'Continue')]") ////button[contains(text(),'Continue')]
		private WebElement REA_Continue_btn;
		
		@FindBy(xpath="//button[@class='btn btn-default active-btn']") ////button[contains(text(),'Continue')]
		private WebElement REA_AnimationContinue_btn;
		
		
		@FindBy(xpath="//input[@formcontrolname='fullName']")
		private WebElement fullNameField;
		
		@FindBy(xpath="//select[@formcontrolname='gender']")
		private WebElement genderField;
		
		@FindBy(xpath="//body/app-root[1]/app-personal-detail[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[4]/mat-datepicker-toggle[1]/button[1]")
		private WebElement DOBfield;
		
		@FindBy(xpath="//div[contains(text(),'3')]")
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
		
		@FindBy(xpath="//span[contains(text(),'New Delhi')]") ////body/div[2]/div[1]/div[1]/div[1]/mat-option[1]/span[1]
		private WebElement CityOption;
		
		
		@FindBy(xpath="//input[@id='pincode']")
		private WebElement PinCode_Field;
		
		@FindBy(xpath="//input[@id='account_number']")
		private WebElement Account_Number_Field;
		
		@FindBy(xpath="//input[@id='account_holder_name']")
		private WebElement Account_HolderName_Field;
		
		@FindBy(xpath="//select[@formcontrolname='account_type']")
		private WebElement Account_Type_DropDown;
		
		@FindBy(xpath="//input[@id='ifsc_code']")
		private WebElement Ifsc_Field;
		
		@FindBy(xpath="//input[@id='experience*']")
		private WebElement Years_Of_Experience_Field;
		
		@FindBy(xpath="//input[@id='turnover']")
		private WebElement Total_Turnover_Field;
		
		@FindBy(xpath="//input[@id='inventoriesSold']")
		private WebElement No_Of_InventeriesSold_Field;
		
		@FindBy(xpath="//input[@id='location']")
		private WebElement Current_work_location_Field;
		
		@FindBy(xpath="//input[@id='pac-input']")
		private WebElement Locations_Worked_On_Field;
		
		@FindBy(xpath="//span[contains(text(),'Nagpur')]")
		private WebElement sele_Worked_On_Field;
		
		@FindBy(xpath="//input[contains(@formcontrolname,'organization')]")
		private WebElement Organization_Name_Field;
		
		@FindBy(xpath="//button[contains(text(),'Save & Next')]")
		private WebElement SaveNext_Btn;
		
		@FindBy(xpath="//body/app-root[1]/app-verify-kyc[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/label[1]/img[1]")
		private WebElement upload_img_btn; // upload img
		
		@FindBy(xpath="//input[@id='organization']")
		private WebElement Organization_Radio_Btn;
		
		@FindBy(xpath="//input[@id='panNumber']") //GFDPS0591T
		private WebElement pancard_FieldREA_Organization;
		
		@FindBy(xpath="//body/app-root[1]/app-verify-kyc[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[2]/div[2]/div[2]/label[1]/small[1]") //GFDPS0591T
		private WebElement select_File_pancard_REA_Organization;
		
		@FindBy(xpath="//input[@id='adharNumber']") //701345674532
		private WebElement Adharcard_Field;
		
		@FindBy(xpath="//input[@id='gstNumber']") //07AAGFF2194N1Z1
		private WebElement GSTnumber_Field;
		
		@FindBy(xpath="//input[@id='rerano']")
		private WebElement Rera_Number_FieldREA;
		
		@FindBy(xpath="//input[@formcontrolname='agreeTerms']")
		private WebElement AgreeTerm_CheckBoxREA;
		
		@FindBy(xpath="//button[contains(text(),'Submit')]")
		private WebElement Submit_btn_REA;
		
		
		
		
		
		
		//..............Action..........
		
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
			ClickOnMobileNoField.sendKeys("6712311122");
			
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
		
		public void clickOnAgentImage()
		{
			
			verifyAgentImage.click();
		}
		
		public void clickOnContinueButtonForAgent()
		{
			verifyContinueBtnForAgent.click();
		}
		
		public void SelectYesForAgent()
		{
			YesRadio_Btn.click();
		}
		
		public void clickOnContinueBtnForREAgent()
		{
			REA_Continue_btn.click();
		}
		
		public void scriptExecutorea1()
		{
			JavascriptExecutor ps = (JavascriptExecutor)driver;
	        ps.executeScript("window.scrollBy(0,300)");
		}
		
		public void ClickREAanimation_Continue_btn()
		{
			REA_AnimationContinue_btn.click();
		}
		
		
		
		public void enterFullName()
		{
			fullNameField.sendKeys("Ram");
		}
		
		public void selectGender()
		{
			genderField.click();
			Select m= new Select(genderField);
			m.selectByVisibleText("Male");
			
		}
		
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
			eMAILfield.sendKeys("rm12@gmail.com");
			
		}
		
		public void enterAddressField()
		{
			AddressField.sendKeys("OT-01");
			
		}
		
		public void enterLocality()
		{
			LocalityField.sendKeys("jin Society");
			
		}
		
		public void scriptExecutorat()
		{
			JavascriptExecutor ps = (JavascriptExecutor)driver;
	        ps.executeScript("window.scrollBy(0,400)");
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
			Thread.sleep(3000);
			CityOption.click();
			
		}
		
		public void scriptExecutor()
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,550)");
		}
		
		public void EnterPincode()
		{
			PinCode_Field.sendKeys("456893");
			
		}
		
		public void EnterAccountNumber()
		{
			Account_Number_Field.sendKeys("890123455");
			
		}
		
		public void EnterAccountHolderName()
		{
			 Account_HolderName_Field.sendKeys("menon yeole");
			
		}
		
		public void SelectAccountType()
		{
			Account_Type_DropDown.click();
			Select u=new Select(Account_Type_DropDown);
			u.selectByVisibleText("Salary Account");
			
			
		}
		
		public void EnterIfsc()
		{
			Ifsc_Field.sendKeys("SBIN0005947");
			
		}
		
		public void scriptExecuForKycREA()
		{
			JavascriptExecutor bs = (JavascriptExecutor)driver;
	        bs.executeScript("window.scrollBy(0,400)");
		}
		
		public void EnterYearOfExperience()
		{
			Years_Of_Experience_Field.sendKeys("8");
			
		}
		
		public void EnterTotalTurnOver()
		{
			Total_Turnover_Field.sendKeys("60");
			
		}
		
		public void EnterNoOfInventories()
		{
			No_Of_InventeriesSold_Field.sendKeys("45");
			
		}
		
		public void EnterCurrentWorkLOcation()
		{
			Current_work_location_Field.sendKeys("Noida");
			
		}
		
		public void EnterLocationWorkedOn() throws InterruptedException
		{
			Locations_Worked_On_Field.sendKeys("Nagpur");
			Thread.sleep(1000);
			sele_Worked_On_Field.click();
			
		}
		
//		public void selectLocationWorkedOn()
//		{
//			Locations_Worked_On_Field.sendKeys("Nagpur");
//			
//			
//		}
		
		public void EnterOrganizationName()
		{
			Organization_Name_Field.sendKeys("tcc");
			
		}
		
		public void ClickOnSaveNextBtnForREAPersonalDetailsPage()
		{
			SaveNext_Btn.click();
			
		}
		
		public void scriptExecutorForKycREA()
		{
			JavascriptExecutor bs = (JavascriptExecutor)driver;
	        bs.executeScript("window.scrollBy(0,-400)");
		}
		
		public void UploadImgForREA()
		{
			upload_img_btn.click();
			
		}
		
		public void SelectOrganizationForREA()
		{
			Organization_Radio_Btn.click();
			
			
			
		}
		
		public void EnterPancardNumberReaOrganization()
		{
			pancard_FieldREA_Organization.sendKeys("GFDPS0591T");
			
		}
		
		public void UploadPancardReaOrganization()
		{
			select_File_pancard_REA_Organization.click();
			
		}
		
		
		public void EnterAdharnumberForREAorganization()
		{
			Adharcard_Field.sendKeys("071234567890");
			
		}
		
		public void scriptExecutorForKycREAdown()
		{
			JavascriptExecutor ms = (JavascriptExecutor)driver;
	        ms.executeScript("window.scrollBy(0,400)");
		}
		
		public void EnterGSTnumberForREAorganization()
		{
			GSTnumber_Field.sendKeys("07AAGFF2194N1Z1");
			
		}
		
//		public void EnterRERAnumberForREAorganization()
//		{
//			Rera_Number_FieldREA.sendKeys("PRMA/KA/RERA/1251/446/PR/00006");
//			
//		}
		
		public void ClickOnTermAndAgreeCheckboxForREAorganization()
		{
			AgreeTerm_CheckBoxREA.click();
			
		}
		
		public void ClickOnSubmitBtnForREAorganization()
		{
			Submit_btn_REA.click();
			
		}
		
		
		
		
		
		
		

}
