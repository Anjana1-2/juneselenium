package testng;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Guru {
	
ChromeDriver driver;
	
	
    @Before
    public void urlloding()
    {
    	driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
    }

    @Test
    
    public void test()
    {
    driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).click();
    driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
    driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
    
    	
    }

}
