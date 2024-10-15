package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Title {

	public static void main(String[] args) {
	
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String actualtitle=driver.getTitle();
		String Exptitle="Google";
		System.out.println("Title="+actualtitle);
		if(Exptitle.equals(actualtitle))
		{
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("Fail");
		}

	}

}
