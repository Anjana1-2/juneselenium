package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbcreatepage {
	
	WebDriver driver;
	
	
	By fbcreateapagebutton=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	By fbsigninbutton= By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div[2]/div/div/span/a");
	
	public Fbcreatepage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void createclick()
	{
		driver.findElement(fbcreateapagebutton).click();
		
	}
	public void textverification()
	{
		String src=driver.getPageSource();
		if(src.contains("create a page"))
				{
			      System.out.println("pass");
				}
		else
		{
			System.out.println("fail");
		}
	}
	public void signinclick()
	{
		driver.findElement(fbsigninbutton).click();
	}
	
}
