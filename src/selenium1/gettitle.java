package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gettitle {

	public static void main(String[] args)throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","C://Users//user//Downloads//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		//String title=driver.getTitle();
		 //System.out.println(title);
		 //driver.findElement(By.linkText("Images")).click();
		
		String value=driver.getWindowHandle();
	     System.out.println(value);
		 

	}

}

