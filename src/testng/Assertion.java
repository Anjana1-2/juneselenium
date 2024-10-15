package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assertion {
	
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
    
    public void test()
    {
    	WebElement button=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]"));
    	String actualtest=button.getAttribute("value");
    	Assert.assertEquals(actualtest, "Check availability1");
    }

}
