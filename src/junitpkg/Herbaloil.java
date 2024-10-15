package junitpkg;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Herbaloil {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://rishiherbalindia.linker.store/");
	}
	@Test
	public void titleverification()
	{
		String actualtitle =driver.getTitle();
		String exptitle ="Rishi Herbal India";
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
	public void linkcount()
	{
		List<WebElement> linkslist=driver.findElements(By.tagName("a"));
		int exptlinkcount=30;
		int actualcount=linkslist.size();
		System.out.println("toal link count="+actualcount);
		if(actualcount==exptlinkcount)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	@Test
	public void textverification()
	{
		String src=driver.getPageSource();
		if(src.contains("Health"))
		{
			System.out.println("Text is contains");
		}
		else
		{
			System.out.println("Text is not contains");
		}
	}
	@After
	public void quitpage()
	{
		driver.quit();
	}
}