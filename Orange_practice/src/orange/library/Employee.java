package orange.library;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilis.Apputilis;

public class Employee  extends Apputilis{

	public boolean AddEmp(String fname,String lname)
	{
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.id("firstName")).sendKeys(fname);
		driver.findElement(By.id("lastName")).sendKeys(lname);
		String value= driver.findElement(By.id("employeeId")).getAttribute("value");
		driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.linkText("Employee List")).click();
		driver.findElement(By.id("empsearch_id")).sendKeys(value);
		driver.findElement(By.id("searchBtn")).click();
	List<WebElement>rows=	driver.findElement(By.id("resultTable")).findElements(By.tagName("tr"));
	boolean res= false;
	for(int i=1;i<rows.size();i++)
	{
		List<WebElement> cols= rows.get(i).findElements(By.tagName("td"));
		if(cols.get(1).getText().equals(value))
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
