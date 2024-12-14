package Default;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPage {
	WebDriver driver;

	@BeforeClass

	public void HomePage() {
		driver = new ChromeDriver();

		driver.get("http://localhost/doctor");
		driver.manage().window().maximize();
	}

	@Test
	public void HP_OnlineBusBookingTitle() {

		driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/div/div[1]/a")).click();
		String PageTitle = driver.getTitle();
		Assert.assertEquals(PageTitle, "On Line Bus Booking");
	}

	@Test
	public void HP_Home() {

		driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/div/div[2]/ul[1]/li[1]/a")).click();
		String PageTitle = driver.getTitle();
		Assert.assertEquals(PageTitle, "On Line Bus Booking");
	}

	@Test
	
	public void HP_AboutUs() {
		driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/div/div[2]/ul[1]/li[2]/a")).click();
		String Title = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[4]/div/div/div[1]/div/h3")).getText();
		Assert.assertEquals(Title, "About Us");

	}
	
	@Test
	public void HP_SearchBuses() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"A2\"]")).click();
		String Title=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lblAccType\"]")).getText();
		Assert.assertEquals(Title,"From");
		Thread.sleep(2000);
	}
	
	
	
}
