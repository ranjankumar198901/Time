package POM;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import Generic.BasePage;

public class LoginPage extends BasePage
{
	
	SoftAssert s= new SoftAssert();

	@FindBy(name="username")
	private WebElement UnTb;
	
	@FindBy(name="pwd")
	private WebElement Pwtb;
	
	@FindBy(id="loginButton")
	private WebElement LoginBtn;
	
	@FindBy(xpath ="//nobr[contains(.,'v')]")
	private WebElement version;
	
	@FindBy(xpath="//span[contains(.,'invalid')]")
	private WebElement errMsg;
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
		
	}
	
	public void setusername(String un)
	{
		UnTb.sendKeys(un);
	}
	
	public void setPassword(String pw)
	{
		Pwtb.sendKeys(pw);
	}
	
	public void clickLogin()
	{
		LoginBtn.click();
	}
	
	public void verifyversion(String eVersion)
	{
		String aVersion = version.getText();
		Assert.assertEquals(aVersion,eVersion);
	}
	
	public void verifyerrisPresent()
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try
		{
			wait.until(ExpectedConditions.visibilityOf(errMsg));
			Reporter.log("Error message is diplayed",true);
		}
		catch(TimeoutException e)
		{
			Reporter.log("Error message is not displayed",true);
			s.fail();
		}
		
	}
	
}

