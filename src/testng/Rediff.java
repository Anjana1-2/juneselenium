package testng;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {

	
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void redifftest()
	{
	boolean isDisplayed=	driver.findElement(By.xpath("//img[@title='Rediff.com']")).isDisplayed();
	boolean isEnabled  =   driver.findElement(By.xpath("//input[@type='button']")).isEnabled();
	 boolean isSelected=  driver.findElement(By.xpath("//input[@type='radio']")).isSelected();
		
		if(isDisplayed) 
		{
			System.out.println("logo is displayed");
			
		}
		else
		{
			System.out.println("not displayed");
		}
		if(isEnabled)
		{
			System.out.println("Button is enabled");
		}
		else
		{
			System.out.println("button is not enabled");  
		}
		if(isSelected)
		{
			System.out.println("radio button is working");
		}
		else
		{
			System.out.println("radio button is not working");
		}
			
			
	}
}
