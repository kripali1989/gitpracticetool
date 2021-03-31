package selenium1;

import java.awt.Window;
import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxb {

	public static void main(String[] args)throws InterruptedException 
	{
	
System.setProperty("webdriver.gecko.driver","C://Users//user//Downloads//geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://www.orangehrm.com/");
driver.get("https://www.google.com");

Thread.sleep(2000);

driver.navigate().to("https://www.mercurytravels.co.in/");
driver.navigate().to("https://www.facebook.com");



Options optnObj= driver.manage();
Window winObj= (Window) optnObj.window();
((org.openqa.selenium.WebDriver.Window) winObj).maximize();

driver.manage().window().maximize();
driver.manage().window().fullscreen();

 
String title=driver.getTitle();
System.out.println(title);
String value=driver.getCurrentUrl();
System.out.println(value);
//String value1=driver.getPageSource();
//System.out.println(value1);
String value2=driver.getWindowHandle();
System.out.println(value2);
	}

}
