package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Fbcreatepage;

public class Fbsignintest {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}

 @Test
 public void test()
 {
	 Fbcreatepage ob=new Fbcreatepage(driver);
	 ob.createclick();
	 ob.textverification();
	 ob.signinclick();
	 
 }
 
}
