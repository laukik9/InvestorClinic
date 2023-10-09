package com.testbase;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
// i did the changes for log4j file the name of file    icPropertLog.log
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.pagelayer.Builder;
import com.pagelayer.Customer;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static String fileinput="C:\\img\\Sample-JPEG-Image-File-Download-scaled.jpg";

	

	//public static Logger logger=LogManager.getLogger(TestBase.class);
	public static WebDriver driver;
	public Customer cust;
	public Builder q;
	
	FirefoxOptions fire=new FirefoxOptions();
	ChromeOptions chro= new ChromeOptions();
	EdgeOptions edg = new EdgeOptions();
	
//	@BeforeClass
//	public void start()
//	{
//		
//
//		logger.info("Investor Clinic Framework");
//		logger.info("Framework execution started");
//		
//	}
//	
//	@AfterClass
//	public void stop()
//	{
//		logger.info("Framework execution finished");
//	}
	
	
	@SuppressWarnings("deprecation")
	@Parameters("browser")
	@BeforeMethod
	public void setUp(String br) throws InterruptedException
	{
		
		if(br.equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(br.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
		}
		else {
			System.out.println("plz select browser");
			
		}
		
		 

  
		
		
        driver.get("https://ic.qkkalabs.com/");
        driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		Duration timeoutSeconds = Duration.ofSeconds(15);
		WebDriverWait wait = new WebDriverWait(driver, timeoutSeconds);
		
		
        // Wait for the page to load completely
        wait.until(ExpectedConditions.jsReturnsValue("return document.readyState == 'complete';"));


		
//		//-----obj creation--
//		cust=new Customer();
//		q= new Builder();
		
		
	}
	@AfterMethod
	public void tearDown()
	{
//		driver.quit();
//		logger.info("Browser closed");
	}

}
