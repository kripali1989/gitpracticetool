package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gettitle1 {

	public static void main(String[] args)throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","C://Users//user//Downloads//geckodriver.exe");
    	WebDriver driver = new FirefoxDriver();
    	
    	driver.get("https://www.instagram.com/");
    	  String value=driver.getPageSource();
		    System.out.println(value);
    	Thread.sleep(2000);
    	
    	
    	 //String title=driver.getTitle();
    	 //System.out.println(title);
    	// System.out.println(driver.getTitle());
    	// String value=driver.getCurrentUrl();
		 //   System.out.println(value);
	}

}
