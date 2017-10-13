package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage
{

	WebDriver driver;
	
	public HomePage(WebDriver ldriver)
	{
	   this.driver = ldriver;
	}
	

	@FindBy(xpath = ".//*[@id='email']")
	WebElement Email;
	
	@FindBy(xpath = ".//*[@id='pass']")
	WebElement Password;
	
	@FindBy(xpath = ".//*[@id='u_0_3']")
	WebElement Login;
	
    
    public void LoginApplication(String user,String pass) throws Exception
    {
    	
    	Email.sendKeys(user);
    	Password.sendKeys(pass);  
    	Thread.sleep(2000);
    	Login.click();
    	
    }
	
}
