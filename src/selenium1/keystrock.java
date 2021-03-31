package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

public class keystrock {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C://Users//user//Downloads//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://login.yahoo.com/");
		
		WebElement un = driver.findElement(By.id("login-username"));
		un.sendKeys("Kripali");
		Thread.sleep(1000);
		un.sendKeys(Keys.CONTROL+"a");
		
		Thread.sleep(1000);
		un.sendKeys(Keys.BACK_SPACE);
		
		driver.findElement(By.id("login-signin")).sendKeys(Keys.ENTER);
		String red_color="#f0162f";
		WebElement error=driver.findElement(By.id("username-error"));
		String value = error.getCssValue("color");
		System.out.println(value);
		Color c = Color.fromString(value);
		
		String value_hex = c.asHex();
		System.out.println(value_hex);
		if (value_hex.equals(red_color))
		{
			System.out.println("error msg displayed in red color");
		}
		else
		{
			System.out.println("error msg not displayed in red color");
		}
		
		}
		
	}


