package orange.testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import orange.library.Employee;
import orange.library.loginpage;
import utilis.Apputilis;

public class EmpReg extends Apputilis {
	
	@Parameters({"uid","pwd","fname","lname"})
	@Test
	public void addemp(String uid,String pwd ,String fname,String lname) throws InterruptedException
	{
		loginpage a= new loginpage();
		a.login(uid, pwd);
		Employee b= new Employee();
		boolean res= b.AddEmp(fname, lname);
		Assert.assertTrue(res);
		a.logout();
	}
	

}
