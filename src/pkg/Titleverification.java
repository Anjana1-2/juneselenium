package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Titleverification {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		String actualtitle =driver.getTitle();
		String exptitle ="Google";
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

}
