package com.pagelayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.testbase.TestBase;

public class NonREA extends TestBase {
	
	

		public NonREA()
		{
			PageFactory.initElements(driver, this);
		}
		
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
			
			@FindBy(xpath="//body/app-root[1]/app-select-user-type[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/img[1]")
			private WebElement verifyAgentImage;
			
			@FindBy(xpath="//button[contains(text(),'Continue')]") //
			private WebElement verifyContinueBtnForAgent;
			
			@FindBy(xpath="//body/app-root[1]/app-seletect-agent-type[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/label[1]/input[1]")
			private WebElement NoRadio_Btn;
			
			@FindBy(xpath="//button[contains(text(),'Continue')]") ////button[contains(text(),'Continue')]
			private WebElement nonREA_Continue_btn;
			
			@FindBy(xpath="//button[contains(text(),'Continue')]") ////button[contains(text(),'Continue')]
			private WebElement nonREA_AnimationContinue_btn;
			
			
			@FindBy(xpath="//input[@formcontrolname='fullName']")
			private WebElement fullNameField;
			
			@FindBy(xpath="//select[@formcontrolname='gender']")
			private WebElement genderField;
			
			////input[@placeholder='DOB (yyyy-mm-dd)']
			
			@FindBy(xpath="//body/app-root[1]/app-personal-detail[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[4]/mat-datepicker-toggle[1]/button[1]/span[1]/*[1]")
			private WebElement DOBfield;
			
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
			
			@FindBy(xpath="//select[@formcontrolname='occupation']")
			private WebElement Occupation_Drop_Down;
			
			@FindBy(xpath="//label[contains(text(),'Select File')]")
			private WebElement Select_file;
			
			@FindBy(xpath="//input[@id='account_number']")
			private WebElement Account_Number_Field;
			
			@FindBy(xpath="//input[@id='account_holder_name']")
			private WebElement Account_HolderName_Field;
			
			@FindBy(xpath="//option[@value='salary']")
			private WebElement Account_Type_DropDown;
			
			@FindBy(xpath="//input[@id='ifsc_code']")
			private WebElement Ifsc_Field;
			
			@FindBy(xpath="//button[contains(text(),'Save & Next')]")
			private WebElement SaveNext_btn;
			
			@FindBy(xpath="//body/app-root[1]/app-verify-kyc[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/label[1]/img[1]")
			private WebElement upload_img_btn;
			
			@FindBy(xpath="//input[@id='panNumber']") //GFDPS0591T
			private WebElement pancard_Field;
			
//			@FindBy(xpath="//input[@id='adharNumber']") //701345674532
//			private WebElement Adharcard_Field;
//			
//			@FindBy(xpath="//body/app-root[1]/app-verify-kyc[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[2]/div[2]/div[2]/label[1]/small[1]") //701345674532
//			private WebElement select_fileFor_Adharcard;
			
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
				ClickOnMobileNoField.sendKeys("7564748122");
				
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
			
			public void SelectNOForAgent()
			{
				NoRadio_Btn.click();
			}
			
			public void clickOnContinueBtnForNonREAgent()
			{
				nonREA_Continue_btn.click();
			}
			
			public void scriptExecutononrea1()
			{
				JavascriptExecutor ks = (JavascriptExecutor)driver;
		        ks.executeScript("window.scrollBy(0,400)");
			}
			
		
			
			public void ClickNonREAanimation_Continue_btn()
			{
				nonREA_AnimationContinue_btn.click();
			}
			
			
			
			public void enterFullName()
			{
				fullNameField.sendKeys("Lucky");
			}
			
			public void selectGender()
			{
				genderField.click();
				Select m= new Select(genderField);
				m.selectByVisibleText("Male");
				
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
				eMAILfield.sendKeys("lucky12@gmail.com");
				
			}
			
			public void enterAddressField()
			{
				AddressField.sendKeys("MT-01");
				
			}
			
			public void enterLocality()
			{
				LocalityField.sendKeys("Maharaj Society");
				
			}
			
			public void scriptExecutorated()
			{
				JavascriptExecutor ks = (JavascriptExecutor)driver;
		        ks.executeScript("window.scrollBy(0,400)");
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
//				Select q=new Select(City);
//				q.selectByVisibleText("New Delhi");
				Thread.sleep(1500);
				CityOption.click();
				
			}
			
			public void scriptExecutor()
			{
				JavascriptExecutor js = (JavascriptExecutor) driver;
		        js.executeScript("scrollBy(0,2000)");
			}
			
			public void EnterPincode()
			{
				PinCode_Field.sendKeys("456123");
				
			}
			
			public void SelectOccupationDropDownValue()
			{
				Occupation_Drop_Down.click();
				
				Select p=new Select(Occupation_Drop_Down);
				p.selectByVisibleText("Architect"); //
				
			}
			public void SelectFileResume()
			{
				Select_file.click();
				
				//String upload="C:\\Users\\LaukikSontakke\\Desktop\\image\\Gratuity Form F.pdf";
				//Select_file.sendKeys("C:\\Users\\LaukikSontakke\\Desktop\\image\\Gratuity Form F.pdf");
				//Select_file.sendKeys(upload);
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
//				Select u=new Select(Account_Type_DropDown);
//				u.selectByVisibleText("Savings Account");
				
				
			}
			
			public void EnterIfsc()
			{
				Ifsc_Field.sendKeys("SBIN0005947");
				
			}
			
			public void ClickOnSaveAndNextBtn()
			{
				SaveNext_btn.click();
				
			}
			
			public void ClickOnFileUpload()
			{
				upload_img_btn.click();
				
			}
			
			public void EnterPancardNumber()
			{
				pancard_Field.sendKeys("GFDPS0591T");
				
			}
			
//			public void EnterAdharnumber()
//			{
//				Adharcard_Field.sendKeys("071234567890");
//				
//			}
//			
//			public void ClickOnSelectFileAdharnumberForNREA()
//			{
//				select_fileFor_Adharcard.click();
//				
//			}
			
			public void ClickOnIagreeWithTermOfUse_FieldCheckBox()
			{
				IagreeWithTermOfUse_Field.click();
				
			}
			
			public void SubmitButtonKYCnonREA()
			{
				Submit_Button_For_kycField.click();
				
			}
			
			
		

}
