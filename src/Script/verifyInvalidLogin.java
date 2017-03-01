package Script;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Generic.BaseTest;
import POM.LoginPage;

public class verifyInvalidLogin extends BaseTest
{
	@Test
	public void testverifyInvalidLogin()
	{
		
		SoftAssert s = new SoftAssert();
		
		LoginPage l = new LoginPage(driver);
		//Enter invalid user name
		l.setusername("abc");
		
		//Enter invalid password
		l.setPassword("xyz");
		
		//click on login button
		l.clickLogin();
		
		//verify error msg is displayed
		l.verifyerrisPresent();
		
		s.assertAll();
		
		
	}

}
