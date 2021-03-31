package selenium2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gettitle {

	public static void main(String[] args)throws InterruptedException
	{
	
		System.setProperty("webdriver.gecko.driver","C://Users//user//Downloads//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		//driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		String title=driver.getTitle();
		 System.out.println(title);
	}

}
