package com.testlayer;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.testng.annotations.Test;

import com.pagelayer.RealEstateAgent;
import com.testbase.TestBase;

public class REAonboardTest extends TestBase {
	
	@Test
	public void reaOnboard() throws InterruptedException, AWTException
	{
		
		RealEstateAgent r= new RealEstateAgent(); //<class name="com.testlayer.BuilderOnBoarding"/>         
		
		r.clickOnLoginBtn();  
                               //<class name="com.testlayer.NonREAonboardTest"/>
		r.clickOnSignInAsPartner();
		r.enterMobileNo();
		r.clickOnContinueBtn();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		r.enterOTP();
		r.clickOnContinueBtnOfOTP();
		//Thread.sleep(1000);
		r.clickOnAgentImage();
		r.clickOnContinueButtonForAgent();//<class name="com.testlayer.BuilderOnBoarding"/>
		Thread.sleep(1000);
		r.SelectYesForAgent();
		r.clickOnContinueBtnForREAgent();
		r.scriptExecutorea1();
		Thread.sleep(1000);
		r.ClickREAanimation_Continue_btn();
		Thread.sleep(1000);
		r.SelectOrganizationForREA();
		//r.EnterAdharnumberForREAorganization();
		Thread.sleep(1500);
		r.enterFullName();
		r.selectGender();
		Thread.sleep(1000);
		r.clickDOBfield();
		Thread.sleep(1500);
		r.selectDOBfield();
		r.enterEmail();
		r.enterAddressField();
		r.enterLocality();
		Thread.sleep(1000);
		r.scriptExecutorat();
		r.SelectStateDropD();
		Thread.sleep(2000);
		r.SelectCity();
		
		r.EnterPincode();
		Thread.sleep(1000);
		r.scriptExecutor();
		Thread.sleep(1000);
		r.EnterAccountNumber();
		Thread.sleep(1000);
		r.EnterAccountHolderName();
		Thread.sleep(1000);
		r.SelectAccountType();
		Thread.sleep(1000);
		r.EnterIfsc();
		r.scriptExecuForKycREA();
		Thread.sleep(1000);
		
		//Experience details
		r.EnterYearOfExperience();
		r.EnterTotalTurnOver();
		r.EnterNoOfInventories();
		r.EnterCurrentWorkLOcation();
		r.EnterLocationWorkedOn();
		r.EnterOrganizationName();
		Thread.sleep(1000);
		r.ClickOnSaveNextBtnForREAPersonalDetailsPage();
		Thread.sleep(2000);
		r.scriptExecutorForKycREA();
		Thread.sleep(2000);
		//...upload img......
		r.UploadImgForREA();
		Thread.sleep(2000);
		Robot sb=new Robot();
		sb.delay(2000);
		StringSelection ls= new StringSelection("C:\\Users\\LaukikSontakke\\Desktop\\image\\erro.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ls, null);
		//CTRL+V
		sb.keyPress(KeyEvent.VK_CONTROL);// press on ctrl key on keyboard
		sb.keyPress(KeyEvent.VK_V);
		sb.delay(2000);
		sb.keyRelease(KeyEvent.VK_CONTROL);
		sb.keyRelease(KeyEvent.VK_V);
		sb.delay(2000);
		
		//Enter
		sb.keyPress(KeyEvent.VK_ENTER);
		sb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		//....................................
		
		//r.SelectOrganizationForREA();
		//r.EnterAdharnumberForREAorganization();
		r.EnterPancardNumberReaOrganization();
		Thread.sleep(2000);
		
		//...upload pan img......
				r.UploadPancardReaOrganization();
				Thread.sleep(2000);
				Robot mb=new Robot();
				sb.delay(2000);
				StringSelection hs= new StringSelection("C:\\Users\\LaukikSontakke\\Desktop\\image\\erro.png");
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(hs, null);
				//CTRL+V
				mb.keyPress(KeyEvent.VK_CONTROL);// press on ctrl key on keyboard
				mb.keyPress(KeyEvent.VK_V);
				mb.delay(2000);
				mb.keyRelease(KeyEvent.VK_CONTROL);
				mb.keyRelease(KeyEvent.VK_V);
				mb.delay(2000);
				
				//Enter
				mb.keyPress(KeyEvent.VK_ENTER);
				mb.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(5000);
				//....................................
		
		
		r.scriptExecutorForKycREAdown();
		Thread.sleep(1500);
		r.EnterGSTnumberForREAorganization();
		//r.EnterRERAnumberForREAorganization();
		Thread.sleep(1000);
		r.ClickOnTermAndAgreeCheckboxForREAorganization();
		Thread.sleep(1000);
		r.ClickOnSubmitBtnForREAorganization();
	}

}
