package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlepage {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
}
	@Test
	public void goolesearch()
	{
		WebElement search= driver.findElement(By.name("q"));
		search.sendKeys("book",Keys.ENTER);
		//driver.findElement(By.name("btnK")).click();
	}
}