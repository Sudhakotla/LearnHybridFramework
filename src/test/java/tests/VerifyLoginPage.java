package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.HomePage;

public class VerifyLoginPage
{

	WebDriver driver;
	
    @BeforeMethod	
	
	public void setUP()
	{
        driver = BrowserFactory.getBrowser("firefox");
		
		driver.manage().window().maximize();
		
		driver.get(DataProviderFactory.getConfig().getApplicationurl());
		
	}
	
   @Test

	public void verifyLogin() throws Exception 
	{
		
	   HomePage home = PageFactory.initElements(driver, HomePage.class);		
	   home.LoginApplication(DataProviderFactory.getExcel().getData(0, 0, 0), DataProviderFactory.getExcel().getData(0, 1, 0));
	   
		
	}
	
   @AfterMethod
	
	public void tearDown()
	
	{
		BrowserFactory.closeBrowser(driver);
	}
	
	
}
