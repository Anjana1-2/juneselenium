package testng;

import static org.testng.Assert.assertEquals;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extentreportss {
WebDriver driver;
String baseurl="https://www.facebook.com";
ExtentSparkReporter reporter;
ExtentTest test;
ExtentReports extent;

@BeforeTest
public void beftest()
{
	reporter=new ExtentSparkReporter("./Reports/myreport1.html");
	reporter.config().setDocumentTitle("Automationreport");
	reporter.config().setReportName("functional test");
	reporter.config().setTheme(Theme.DARK);
	extent=new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("hostname", "local host");
	extent.setSystemInfo("os", "Windows11");
	extent.setSystemInfo("Testername", "abc");
	extent.setSystemInfo("Browser name", "chrome");
}
   @BeforeMethod
   public void setup()
   {
	   driver.get(baseurl);
}
  @Test
   public void fbtitleverification()
   {
	   test=extent.createTest("fbtitleverfication");
	   String Exp="Facebook";
	   String actual=driver.getTitle();
	   Assert.assertEquals(Exp, actual);
   }
   @Test
   public void buttontestverification()
   {
	   test=extent.createTest("buttontestverification");
   }
@AfterTest
public void teardown()
{
	extent.flush();
}
					@AfterMethod
					public void browserclose(ITestResult result)
					{
						if(result.getStatus()==ITestResult.FAILURE)
						{
							
						}
					}

}
