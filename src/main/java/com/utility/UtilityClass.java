package com.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import com.testbase.TestBase;

public class UtilityClass extends TestBase {
	
	
	public UtilityClass()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public static String fileinput="C:\\img\\Sample-JPEG-Image-File-Download-scaled.jpg";
	
	public static String path ="C:\\Users\\LaukikSontakke\\eclipse-workspace\\InvestorClinic\\Screenshots";
	
	
	public static void takeScreenShot(String filename)
	{
		try 
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			
//			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
//		    LocalDateTime now = LocalDateTime.now();
//		    String dateandtime = dtf.format(now);
			
			File dest = new File(path+filename+System.currentTimeMillis()+".png");
			FileHandler.copy(src, dest);
		} 
		catch (IOException e) 
		{
			System.out.println("Please provide correct path");
			e.printStackTrace();
		}	
	}
	
	
	
	
	

}
