package testng;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Janasya1 {
	
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://janasya.com/");
	}
	@Test
	public void test()
	{
		String actualtitle =driver.getTitle();
		String exptitle ="Janasya";
		System.out.println("title="+actualtitle);
		if(actualtitle.equals(exptitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	
	}
	@Test
	public void option()
	
	{
		
	WebElement ele =	driver.findElement(By.xpath("//*[@id=\"shopify-section-sections--16405611937962__header\"]/height-observer/x-header/nav[1]/ul/li[1]/details/summary"));
	WebElement options=	driver.findElement(By.xpath("//*[@id=\"shopify-section-sections--16405611937962__header\"]/height-observer/x-header/nav[1]/ul/li[1]/details/div/ul/li[1]/ul/li[3]/a"));
	Actions act= new Actions(driver);
	act.moveToElement(ele).perform();
	options.click();
	}


}
