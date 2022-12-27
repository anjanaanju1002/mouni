package orange.testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import orange.library.loginpage;
import utilis.Apputilis;

public class AdminloginWithInvalidData  extends Apputilis{
@Parameters({"uid","pwd"})
	@Test
	public void loginwithInvaliddata(String uid,String pwd) throws InterruptedException
	{
		loginpage a= new loginpage();
		a.login(uid, pwd);
		boolean res= a.IsErrMsgDsiplayed();
		Assert.assertTrue(res);
		
	}
	
	
	
	
	
}
