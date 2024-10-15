package testng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazone_Window_handling {
	
	WebDriver driver;
	
	@BeforeTest
	public void beforetest() 
	{
		driver=new ChromeDriver();
		
	}
	@Test
	public void test()
	{
		driver.get("https://www.amazon.in/");
		String parentWindow =driver.getWindowHandle(); //Current window
		

		System.out.println("parent Window Title"+driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"nav-logo-sprites\"]")).click();
		
		Set<String> allwindowhandles = driver.getWindowHandles();
		for (String handle : allwindowhandles)
		{
			if (!handle.equalsIgnoreCase(parentWindow)) 
			{
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobiles");
				driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
				driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
				driver.close();
				
			}
			 driver.switchTo().window(parentWindow);
								
		
	}

}
}

