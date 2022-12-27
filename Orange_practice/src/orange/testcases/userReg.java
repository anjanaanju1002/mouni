package orange.testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import orange.library.loginpage;
import orange.library.user;
import utilis.Apputilis;

public class userReg  extends Apputilis{
@Parameters({"uid","pwd","ename","uname","pword"})
	@Test
	public void addUser(String uid,String pwd,String ename,String uname,String pword) throws InterruptedException
	{
		loginpage c=new loginpage();
		c.login(uid, pwd);
		user d= new user();
	boolean res=	d.addUser(ename,uname,pword);
	Assert.assertTrue(res);
	c.logout();
	}
	
}
