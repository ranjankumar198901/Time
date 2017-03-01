package Script;

import org.testng.annotations.Test;

import Generic.BaseTest;
import POM.LoginPage;

public class VerifyLoginPage extends BaseTest
{
	@Test
	public void TestVerifyLoginPage()
	{
		LoginPage l= new LoginPage(driver);
				l.verifyTitle("actiTime - Login");
	}

}
