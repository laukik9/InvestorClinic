package com.testlayer;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.pagelayer.Builder;

import com.testbase.TestBase;
//Test cases or run test cases
public class BuilderOnBoarding extends TestBase {
	@Test
	public void builderONBoard() throws InterruptedException, AWTException
	{
		
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("submit_button_id")));
		Builder q= new Builder();
		q.clickOnLoginBtn();
		//logger.info("clicked login button");
		q.clickOnSignInAsPartner();
		q.enterMobileNo();
		q.clickOnContinueBtn();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		q.enterOTP();
		q.clickOnContinueBtnOfOTP();
		//logger.info("OTP verification Done");
		Thread.sleep(2000);
		q.clickOnBuilderImage();
		q.clickOnContinueButtonForBuilder();//<class name="com.testlayer.BuilderOnBoarding"/>
		Thread.sleep(1000);
		q.clickOnContinueButtonForAnimation();
		Thread.sleep(1500);
		//logger.info("Personal details form opened");
		q.enterFullName();
		Thread.sleep(2000);
		q.selectGender();
		Thread.sleep(1500);
		q.clickDOBfield();
		Thread.sleep(1500);
		q.selectDOBfield();
		q.enterEmail();
		q.enterAddressField();
		q.enterLocality();
		q.scriptExecuto();
		Thread.sleep(1000);
		q.SelectStateDropD();
		q.SelectCity();
		
		q.EnterPincode();
		q.EnterInventorySold();
		q.EnterTurnOver();
		q.EnterWorkLocation();
		q.scriptExecutor();
		Thread.sleep(3000);
		q.EnterOrganization();
		Thread.sleep(1500);
		q.EnterLocationBeingServed();
		///driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);
		q.ClickOnSubmitBtnBuilderPersonalForm();
		//logger.info("Form submitted succesfully for Builder");
		//..................................................................
		//photo upload
		q.UploadImg();
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
		//logger.info("Photo upload successfully");
		//.............................................................		
		
//		Thread.sleep(1000);
//		q.ClickUploadImg();
		q.EnterPancardNumber();
		q.EnterGSTnumber();
		q.ClickOnIagreeWithTermOfUse_FieldCheckBox();
		q.SubmitButtonKYCbuilder();
		//logger.info("KYC form submitted for builder");
	
		
	}

}
