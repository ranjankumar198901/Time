package Script;

import org.testng.annotations.Test;
import Generic.BaseTest;
import POM.EnterTimeTrack;
import POM.LoginPage;

public class verifyloginlogout extends BaseTest
{
	@Test
	public void testverifyloginlogout() throws InterruptedException
	{
		LoginPage l= new LoginPage(driver);
		//enter valid user name
		l.setusername("admin");
		
		//set password
		l.setPassword("manager");
		
		Thread.sleep(10);
		
		//click login
		l.clickLogin();
	
		Thread.sleep(10);
		
		//verify the home page is displayed 
	//	EnterTimeTrack e= new EnterTimeTrack(driver);
	//	e.verifyTitle("actiTIME - Enter Time- Track");
		
		//click logout
	//	e.clicklogout();
		
	//	Thread.sleep(10);
		
		//verify login page is displayed
	//	l.verifyTitle("actiTIME - Login");
		
	}
}
