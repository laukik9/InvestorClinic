package com.testlayer;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.testng.annotations.Test;

import com.pagelayer.NonREA;
import com.testbase.TestBase;

public class NonREAonboardTest extends TestBase {
	
	@Test
	public void nonReaOnboard() throws InterruptedException, AWTException
	{
		NonREA l= new NonREA();
		l.clickOnLoginBtn();
		l.clickOnSignInAsPartner();
		l.enterMobileNo();
		l.clickOnContinueBtn();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		l.enterOTP();
		l.clickOnContinueBtnOfOTP();
		Thread.sleep(2000);
		l.clickOnAgentImage();
		l.clickOnContinueButtonForAgent();//<class name="com.testlayer.BuilderOnBoarding"/>
		Thread.sleep(1500);
		l.SelectNOForAgent();
		l.clickOnContinueBtnForNonREAgent();
		l.scriptExecutononrea1();
		Thread.sleep(1000);
		l.ClickNonREAanimation_Continue_btn();
		Thread.sleep(1500);
		l.enterFullName();
		l.selectGender();
		Thread.sleep(1000);
		l.clickDOBfield();
		Thread.sleep(1500);
		l.selectDOBfield();
		l.enterEmail();
		l.enterAddressField();
		l.enterLocality();
		l.scriptExecutorated();
		Thread.sleep(1000);
		l.SelectStateDropD();
		l.SelectCity();
		
		l.EnterPincode();
		Thread.sleep(1000);
		l.scriptExecutor();
		Thread.sleep(2000);
		l.SelectOccupationDropDownValue();
		l.SelectFileResume();
		Robot rb=new Robot();
		rb.delay(2000);
		//put file in clipboard
		StringSelection ss= new StringSelection("C:\\Users\\LaukikSontakke\\Desktop\\image\\Gratuity Form F.pdf");
		//ss.wait();
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		//CTRL+V
		rb.keyPress(KeyEvent.VK_CONTROL);// press on ctrl key on keyboard
		rb.keyPress(KeyEvent.VK_V);
		rb.delay(2000);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.delay(2000);
		
		//Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		l.EnterAccountNumber();
		l.EnterAccountHolderName();
		//Thread.sleep(5000);
		l.SelectAccountType();
		Thread.sleep(3000);
		l.EnterIfsc();
		l.ClickOnSaveAndNextBtn();
		Thread.sleep(2000);
		
		//......................................//
		//photo upload
		l.ClickOnFileUpload();
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
		//.........................................//
		l.EnterPancardNumber();
		//l.EnterAdharnumber();
		Thread.sleep(2000);
		
		//......................................//
				//photo upload
//				l.ClickOnSelectFileAdharnumberForNREA();
//				Robot gb=new Robot();
//				sb.delay(2000);
//				StringSelection ps= new StringSelection("C:\\Users\\LaukikSontakke\\Desktop\\image\\erro.png");
//				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ps, null);
//				//CTRL+V
//				gb.keyPress(KeyEvent.VK_CONTROL);// press on ctrl key on keyboard
//				gb.keyPress(KeyEvent.VK_V);
//				gb.delay(2000);
//				gb.keyRelease(KeyEvent.VK_CONTROL);
//				gb.keyRelease(KeyEvent.VK_V);
//				gb.delay(2000);
//				
//				//Enter
//				gb.keyPress(KeyEvent.VK_ENTER);
//				gb.keyRelease(KeyEvent.VK_ENTER);
//				Thread.sleep(5000);
//				//.........................................//
		
		l.ClickOnIagreeWithTermOfUse_FieldCheckBox();
		Thread.sleep(2000);
		l.SubmitButtonKYCnonREA();
	
				
	}

}
