package pkg;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupload {
	
	WebDriver driver;
	@BeforeTest
	public void beforeTest()
	{
		driver = new ChromeDriver();
		
		
	}
	@SuppressWarnings("deprecation")
	@Test
	public void main() throws Exception 
	{
		driver.get("http://www.ilovepdf.com/word_to_pdf");
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec(" C:\\Users\\Hariii\\Desktop\\anjana\\file1.exe");
		Thread.sleep(3000);
		
	}
	
	
	
	
	

}
