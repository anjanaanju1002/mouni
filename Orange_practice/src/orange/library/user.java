package orange.library;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilis.Apputilis;

public class user extends Apputilis{

	public boolean addUser(String ename,String uname,String pwd) throws InterruptedException
	{
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(ename);
		driver.findElement(By.id("systemUser_userName")).sendKeys(uname);
		driver.findElement(By.id("systemUser_password")).sendKeys(pwd);
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(pwd);
		Thread.sleep(3000);
		driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.name("searchSystemUser[userName]")).sendKeys(uname);
		
		driver.findElement(By.id("searchBtn")).click();
	List<WebElement>rows=	driver.findElement(By.id("resultTable")).findElements(By.tagName("tr"));
	boolean res=false;
		for(int i=1;i<rows.size();i++)
		{
			if(rows.get(1).getText().contains(uname))
			{
				res=true;
			}else
			{
				res=false;
			}
		}
		return res;
	}
	
	
	
	
	
}
