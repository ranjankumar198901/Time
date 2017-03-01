package Script;

import org.testng.annotations.Test;

import Generic.BaseTest;
import POM.LoginPage;

public class verifyloginlogout extends BaseTest
{
	@Test
	public void testverifyloginlogout()
	{
		LoginPage l= new LoginPage(driver);
		//enter valid username
		l.setusername("admin");
		
	}
}
