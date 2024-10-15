package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testnggroup {
	

	@BeforeTest
	public void setup()
	{
		System.out.println("beforetest");
	}
    @BeforeMethod
    public void urlloding()
    {
    	System.out.println("beforemethod");
    }
    @Test(groups = {"smoke"})
    public void test1()
    {
    	System.out.println("test1");
    }
    @Test(groups = {"sanity","smoke"})
    public void test2()
    {
    	System.out.println("test2");
    }
    @Test(groups = {"regression"})
    public void test3()
    {
    	System.out.println("test3");
    }
    @Test(groups = {"sanity"})
    public void test4()
    {
    	System.out.println("test4");
    }
    @AfterMethod
    public void aftermethod()
    {
    	System.out.println("aftermetho");
    }
    @AfterTest
    public void teardown()
    {
    	System.out.println("aftertest");
    }
}


