package Script;

import org.testng.annotations.Test;

import Generic.BaseTest;
import POM.LoginPage;

public class VerifVversion extends BaseTest
{
	@Test
	public void testVerifVversion()
	{
		
		LoginPage l = new LoginPage(driver);
		l.verifyversion("v. 3.1");
	}
	
}
