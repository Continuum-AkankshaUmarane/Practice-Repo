package Sample.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class test1 {
	WebDriver driver;
	@Test
	public void test1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Assert.assertTrue(true, "Test passed");
		//Master changes 
		
	}
	@Test
	public void test2()
	{
		System.out.println(driver.getTitle());
	}
	
}
