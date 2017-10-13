package factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory
{
	static WebDriver driver;
	
	public static WebDriver getBrowser(String browserName)
	{
		
		if(browserName.equalsIgnoreCase("firefox"))
		{
			
			driver = new FirefoxDriver();
					
		}
		else
		{
			System.out.println("Program is terminated");	
			
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		return driver;
	}
	
	
	public static void closeBrowser(WebDriver ldriver)
	{
		ldriver.quit();
	}
	
}
