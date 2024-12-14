package Default;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;






public class SearchBus extends LoginPage{
	
	
	public void system() {
		Select s=new Select(driver.findElement(By.id("ContentPlaceHolder1_ddlOrigin")));
		s.selectByValue("Mumbai");
		Select s1=new Select(driver.findElement(By.id("ContentPlaceHolder1_ddlDestination")));
		s1.selectByValue("Pune");
		driver.findElement(By.id("ContentPlaceHolder1_txtDate")).sendKeys("18/10/2024");
		driver.findElement(By.id("ContentPlaceHolder1_btnSearch")).click();		
		
	}
	

}
