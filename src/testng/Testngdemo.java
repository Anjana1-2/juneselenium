package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngdemo {
	
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
    @Test(priority = 2,invocationCount = 3) // Execute same method many times(here 3 times)
    public void test1()
    {
    	System.out.println("test1");
    }
    @Test(priority = 3,dependsOnMethods = {"test1"}) // first priority test execute only after test1. bcz depends on method used for depensonmethod
    public void test2()
    {
    	System.out.println("test2");
    }
    @Test(priority = 1,enabled=false)  // Priority for setting priority for test execution, enabled = false is for skip the test)
    public void test3()
    {
    	System.out.println("test3");
    }
    @Test(priority = 4)
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
