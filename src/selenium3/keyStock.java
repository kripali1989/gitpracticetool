package selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class keyStock {
	public static void main(String[] args) throws InterruptedException
	{
	  System.setProperty("webdriver.gecko.driver","C://Users//user//Downloads//geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://login.yahoo.com/");
	  
	  WebElement un = driver.findElement(By.id("login-username"));
	  un.sendKeys("Shivani");
	  un.sendKeys(Keys.CONTROL+"a");
	  Thread.sleep(1000);
	  un.sendKeys(Keys.BACK_SPACE);
	  
	  driver.quit();
	}

}
