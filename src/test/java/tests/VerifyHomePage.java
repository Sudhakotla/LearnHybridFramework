package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import dataProvider.ConfigurationData;
import factory.BrowserFactory;
import factory.DataProviderFactory;
import utility.Helper;

public class VerifyHomePage
{
	
	WebDriver driver;
	ExtentReports report;
	ExtentTest logger;;
	
	@BeforeMethod	
	
	public void setUP()
	{
		
		report = new ExtentReports("./Reports/LoginPageReport.html",true);
		//logger = new ExtentTest("Verify Face book Home Page","This page will verify home page");
		
		logger = report.startTest("Verify Face book Home Page");
			
		 
        driver = BrowserFactory.getBrowser("firefox");
		
		driver.manage().window().maximize();
		
		driver.get(DataProviderFactory.getConfig().getApplicationurl());
		
		logger.log(LogStatus.INFO, "Application is up and running");
		
		
	}
	
	@Test
	public void verifyPageTitle()
	{
		
	    String title = driver.getTitle();
	    
	    String actual = "Facebook – log in or sign up";
	    
	    Assert.assertEquals(actual, title);
	    
	    logger.log(LogStatus.INFO, logger.addScreenCapture(Helper.caprtureScreenshot(driver, "Validation 1")));
	    
	    logger.log(LogStatus.PASS, "Verified home page successfully");
	    
			
		System.out.println("Page title is:"+title);
			
				  
	}
	
	@AfterMethod
	
	public void tearDown(ITestResult result)	
    {
		
		
		if (result.getStatus() == ITestResult.FAILURE)
		{
			String path = Helper.caprtureScreenshot(driver, result.getName());
			
			logger.log(LogStatus.FAIL, logger.addScreenCapture(path));
			
		}
		
		
		BrowserFactory.closeBrowser(driver);
		report.endTest(logger);
		report.flush();
		
		
	}
	
			
}

