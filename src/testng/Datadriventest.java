package testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.poifs.crypt.temp.SXSSFWorkbookWithCustomZipEntrySource;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriventest {
	
ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		System.out.println("Rediff");                                                                                     
	}
    @BeforeMethod
    public void urlloding()
    {
    	driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
    }


    @Test
    
    public void datadriven() throws Exception 
    {
    	FileInputStream f=new FileInputStream("C:\\Users\\acer\\Desktop\\Anjana\\anjana\\Book1.xlsx");
         XSSFWorkbook wb=new XSSFWorkbook(f);
         XSSFSheet sh=wb.getSheet("sheet1");
         int row=sh.getLastRowNum();
         for(int i=1;i<=row;i++)
         {
        	 String usrname=sh.getRow(i).getCell(0).getStringCellValue();
        	 String pswd=sh.getRow(i).getCell(1).getStringCellValue();
        	 System.out.println(usrname+"----------"+pswd);
        	 driver.findElement(By.name("email")).clear();
        	 driver.findElement(By.name("email")).sendKeys( usrname);
        	 
        	 driver.findElement(By.name("pass")).sendKeys(pswd);
        	 driver.findElement(By.name("login")).click();
        	 String expurl="https://wwww.facebook.com/home";
        	String actualurl= driver.getCurrentUrl();
        	if(expurl.equals(actualurl))
        	{
        		System.out.println("login successfull");
        	}
        	else
        	{
        		System.out.println("invalid login");
        	}
         }
    }

}
