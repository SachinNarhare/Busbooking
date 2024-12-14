package Default;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Registration {

	WebDriver driver;

	@BeforeClass
	public void Login() {
		driver = new ChromeDriver();

		driver.get("http://localhost/doctor");
		driver.manage().window().maximize();

	}

	//@Test
	public void Regi() {

		driver.findElement(By.xpath("//*[@id=\"linkRegister\"]")).click();
		//Enter First Name
		driver.findElement(By.id("ContentPlaceHolder1_txtFirstName")).sendKeys("Rahul");
		//Enter Last Name
		driver.findElement(By.id("ContentPlaceHolder1_txtLastName")).sendKeys("Shinde");
		//Enter User Name
		driver.findElement(By.id("ContentPlaceHolder1_txtMobileNo")).sendKeys("rahul_shinde");
		//Enter Password
		driver.findElement(By.id("ContentPlaceHolder1_txtPassword")).sendKeys("rahul_shinde");
		//Enter Email ID
		driver.findElement(By.id("ContentPlaceHolder1_txtEmailID")).sendKeys("rahuls@gmail.com");
		//Enter City
		driver.findElement(By.id("ContentPlaceHolder1_txtCity")).sendKeys("Mumbai");
		//Enter Address
		driver.findElement(By.id("ContentPlaceHolder1_txtAddress")).sendKeys("Near high tower");
		//Enter pincode
		driver.findElement(By.id("ContentPlaceHolder1_txtPincode")).sendKeys("400001");
		
		driver.findElement(By.id("ContentPlaceHolder1_btnSave")).click();
	}

}
