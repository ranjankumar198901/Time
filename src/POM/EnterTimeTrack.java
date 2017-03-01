package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import Generic.BasePage;

public class EnterTimeTrack extends BasePage 
{

	@FindBy(xpath="//a[contains(.,'Logout')]")
	private WebDriver Logoutlink; 
	
	
	
	public EnterTimeTrack(WebDriver driver)
	{
		super(driver);
		
	}
	
	
	
	

	public void clicklogout()
	{
		//Logoutlink.click();
		driver.close();
	}
}
