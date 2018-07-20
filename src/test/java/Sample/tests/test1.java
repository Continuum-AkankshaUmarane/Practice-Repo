package Sample.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class test1 {

	@Test
	public void test11()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("www.google.com");
		Assert.assertTrue(true, "Test passed");
		System.out.println("test1");
		Assert.assertTrue(false, "Test passed");
	}
	
}
