package orange.library;

import org.openqa.selenium.By;

import utilis.Apputilis;

public class loginpage extends Apputilis {

	public void login(String uid,String pwd)
	{
		driver.findElement(By.id("txtUsername")).sendKeys(uid);
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		driver.findElement(By.id("btnLogin")).click();
	}
	
	
	public boolean IsAdminModDisplayed()
	{
		if(driver.findElement(By.linkText("Admin")).isDisplayed())
				
				{
					return true;
				}else
				{
					return false;
				}
	}
	
	public boolean IsErrMsgDsiplayed() {
		if(driver.findElement(By.id("spanMessage")).isDisplayed())
		{
			return true;
		}else
		{
			return false;
		}
		
	}
	
	public void logout() throws InterruptedException
	{Thread.sleep(3000);
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[9]/ul/li[4]/a")).click();
	}
	
	
	
	
	
}
