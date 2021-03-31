package selenium1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	ChromeDriver driver;
	@BeforeTest
	public void open() throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver","E:\\Browser\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.selenium.dev");
		 Thread.sleep(5000);
	}

	 @Test
	 
	 public void data() throws InterruptedException, IOException
	 {
		 driver.findElement(By.linkText("Downloads")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.linkText("3.141.59")).click();
		 
		 java.lang.Runtime.getRuntime().exec("C:\\Users\\Lenovo\\Desktop\\Script1.exe");
		 
		 
		 
	 }


}
