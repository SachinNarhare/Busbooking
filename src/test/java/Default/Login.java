
package Default;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
	WebDriver driver;

	@SuppressWarnings("deprecation")
	@BeforeClass

	public void login() {
		driver = new ChromeDriver();
		driver.get("http://localhost/doctor");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@Test
	public void HP_Admin() throws InterruptedException {
		driver.findElement(By.id("linkLogin")).click();
		driver.findElement(By.id("ContentPlaceHolder1_txtUserId")).sendKeys("rahul_shinde");
		driver.findElement(By.id("ContentPlaceHolder1_txtPassword")).sendKeys("rahul_shinde");
		driver.findElement(By.id("ContentPlaceHolder1_btnLogin")).click();
		Thread.sleep(2000);

	}

	@Test

	public void search_bus() {
		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddlOrigin\"]")).click();
		List<WebElement> options1 = driver
				.findElements(By.xpath("//select[@id='ContentPlaceHolder1_ddlOrigin']//option"));

		String option = "Mumbai";

		for (int i = 1; i < options1.size(); i++) {
			if (options1.get(i).getText().contains(option)) {
				options1.get(i).click();

			}
		}

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddlDestination\"]")).click();

		List<WebElement> options2 = driver
				.findElements(By.xpath("//select[@id='ContentPlaceHolder1_ddlDestination']//option"));
		String option2 = "Pune";
		for (int i = 1; i < options2.size(); i++) {
			if (options2.get(i).getText().contains(option2)) {
				options2.get(i).click();
			}
		}
		driver.findElement(By.id("ContentPlaceHolder1_txtDate")).sendKeys("25/03/2017");
		driver.findElement(By.id("ContentPlaceHolder1_btnSearch")).click();
	}

	@Test
	public void select_bus() throws InterruptedException {
		driver.findElement(By.xpath("//a[@title='Select Bus']")).click();
		driver.findElement(By.xpath("//div[@id='holder']//ul//li[2]")).click();

		/*driver.findElement(By.id("ddlBoardingpoints")).click();
		List<WebElement> options3 = driver.findElements(By.xpath("//*[@id=\"ddlBoardingpoints\"]"));
		String option3="Achole";
		for(int i=1; i<options3.size();i++) {
			if(options3.get(i).getText().contains(option3)) {
				options3.get(i).click();
			}
		}*/
		
		Select s2=new Select(driver.findElement(By.id("ddlBoardingpoints")));
		s2.selectByValue("5");
		
		driver.findElement(By.id("btnPayment")).click();
		Thread.sleep(5000);
		
	}
	
	@Test
	
	public void passenger_details() {
	
		
		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_gdPassengerDetails_txtFName_0\"]")).sendKeys("Keshav");
		
	
	}
}
