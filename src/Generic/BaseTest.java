package Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements Autoconst
{
	public WebDriver driver;
	
	@BeforeMethod
	public void precondition()
	{
		System.setProperty(CHROME_KEY,CHROME_VALUE);
		driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("http://ranjan-pc/login.do");
	}
	
	@AfterMethod
		public void postcondition()
		{
			driver.close();
		}
	
	
	
}
	
	
	

