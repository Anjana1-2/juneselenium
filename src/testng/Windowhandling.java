package testng;

import java.util.Set;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;


public class Windowhandling {
	
	ChromeDriver driver;
	@BeforeTest
	public void beforeTest()
	{
		driver=new ChromeDriver();
		
	}
	@Test
	public void test()
	{
		driver.get("https://demo.guru99.com/popup.php");
		
		String parentWindow =driver.getWindowHandle(); //Current window
		
		System.out.println("parent Window Title"+driver.getTitle());
		driver.findElement(By.xpath("/html/body/p/a")).click();
		
		Set<String> allWindowhandles = driver.getWindowHandles();
		 
		for (String handle : allWindowhandles)
		{
			if (!handle.equalsIgnoreCase(parentWindow)) 
			{
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input]")).sendKeys("abcv@gmail.com");
				
				driver.close();
			}
			 driver.switchTo().window(parentWindow);
		}
		
	}

}
