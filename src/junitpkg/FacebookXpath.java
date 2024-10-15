package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class FacebookXpath {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
	}
	@Test
	public void fbtest()
	{
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("abcd@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("1234");
		driver.findElement(By.name("login")).click();
	}

}
