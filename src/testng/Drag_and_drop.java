package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Drag_and_drop {
	
ChromeDriver driver;
	
	@BeforeTest
	    public void setup()
    {
    	driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
    }
	@Test
	public void drag()
	{
		
		
		
		WebElement Bank=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement account=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		WebElement rs=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement amount=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		WebElement rupees=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement amount2=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
		WebElement account2=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
		WebElement sales=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		
		Actions act=new Actions(driver);
		
		//WebElement w=driver.findElement(By.xpath("//*[@id=\"g-mainbar\"]/div/div/div/div/div/div/table/tbody/tr/td[1]"));
		//WebElement w2=driver.findElement(By.xpath("//*[@id=\"g-mainbar\"]/div/div/div/div/div/div/table/tbody/tr/td[2]"));
		
		//driver.switchTo().frame(w);
		//driver.switchTo().frame(w2);
		
		act.dragAndDrop(Bank, account).perform();
		act.dragAndDrop(rs, amount).perform();
		act.dragAndDrop(rupees, amount2).perform();
		act.dragAndDrop(sales,account2).perform();
		
		
	}
	

}
