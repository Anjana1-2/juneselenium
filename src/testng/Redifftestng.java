package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Redifftestng {
	ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		System.out.println("Rediff");                                                                                     
	}
    @BeforeMethod
    public void urlloding()
    {
    	driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
    }
    @Test
    public void logo()
    {
    	boolean isDisplayed=driver.findElement(By.xpath("//img[@title='Rediff.com']")).isDisplayed();
    	
    	if(isDisplayed) 
		{
			System.out.println("logo is displayed");
			
		}
		else
		{
			System.out.println("not displayed");
		}
    } 
    @Test
    public void radioelements()
    {
    	boolean isSelected= driver.findElement(By.xpath("//input[@type='radio']")).isSelected();
    	if(isSelected)
		{
			System.out.println("radio button is working");
		}
		else
		{
			System.out.println("radio button is not working");
		}
			
    }
    @Test
    public void button()
    {
    	boolean isEnabled  =   driver.findElement(By.xpath("//input[@type='button']")).isEnabled();
    	if(isEnabled)
		{
			System.out.println("Button is enabled");
		}
		else
		{
			System.out.println("button is not enabled");  
		}
    }

}
