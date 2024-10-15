package testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Gurusite {
	ChromeDriver driver;
	@BeforeTest
    public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
}
	@Test
	public void test()
	{
		WebElement rightclickme=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		WebElement edit=driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]/span"));
		WebElement doubleclickElement=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		Actions act=new Actions(driver);
		act.contextClick(rightclickme).perform();
         edit.click();
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a=driver.switchTo().alert();
		String alerttext=a.getText();
		System.out.println(alerttext);
		a.accept(); 
		
	}

}
