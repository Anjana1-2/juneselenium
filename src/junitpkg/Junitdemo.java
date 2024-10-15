package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
	}
	@Test
	public void titleverification()
	{
		String actualtitle =driver.getTitle();
		String exptitle ="Google";
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
	public void textverification()
	{
		String src=driver.getPageSource();
		if(src.contains("Gmail"))
		{
			System.out.println("Text is contains");
		}
		else
		{
			System.out.println("text is not contains");
		}
	}
	@After
	public void quitpage()
	{
		driver.quit();
	}
	

}
