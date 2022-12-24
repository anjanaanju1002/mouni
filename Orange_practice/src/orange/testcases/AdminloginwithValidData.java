package orange.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import orange.library.loginpage;
import utilis.Apputilis;

public class AdminloginwithValidData  extends Apputilis{
	@Parameters({"uid","pwd"})
@Test
	public void loginwithValidData(String uid,String pwd) throws InterruptedException
	
	{
		loginpage a= new loginpage();
		a.login(uid, pwd);
	  boolean res=  a.IsAdminModDisplayed();
	Assert.assertTrue(res);
	a.logout();
		
		
		
		
		
	}

}
