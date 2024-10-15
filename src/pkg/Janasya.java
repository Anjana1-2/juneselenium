package pkg;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Janasya {
	ChromeDriver driver;
	@Before
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
	public Janasya() {
		// TODO Auto-generated constructor stub
	}@Test
	public void option()
	{
		driver.findElement(By.xpath("//*[@id=\"shopify-section-sections--16405611937962__header\"]/height-observer/x-header/nav[1]/ul/li[1]/details/summary")).click();
		driver.findElement(By.xpath("//*[@id=\"shopify-section-sections--16405611937962__header\"]/height-observer/x-header/nav[1]/ul/li[1]/details/div/ul/li[1]/ul/li[3]/a")).click();
	}

}

