package junitpkg;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazoneXpath {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");//input[@id='twotabsearchtextbox']
	}
	@Test
	public void amazontest()
	{
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobiles");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
		//driver.findElement(By.xpath("//div[@class='nav-sprite hmenu-close-icon']")).click();
	}

}
