package junitpkg;

import java.net.HttpURLConnection;
import java.net.URI;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkscount {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
}
	@Test
	public void test()
	{
		List<WebElement> linkslist=driver.findElements(By.tagName("a"));
		System.out.println("toal link count="+linkslist.size());
		
		for(WebElement ele:linkslist)
		{
			String link=ele.getAttribute("href");
			String text=ele.getText();
			//System.out.println(link+"----------------"+text);
			verifylink(link);
		}
	}
	private void verifylink(String link) {
		
		
		try
		{
			URI ob=new URI (link);
	HttpURLConnection con=(HttpURLConnection)ob.toURL().openConnection();
	if(con.getResponseCode()==200)
	{
		System.out.println("successfull response code is 200--"+link);
		
	}
	else if(con.getResponseCode()==404)
	{
		System.out.println("broken link response code is 404--"+link);
	}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}
