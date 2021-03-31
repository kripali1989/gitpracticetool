package selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class yahoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver","C://Users//user//Downloads//geckodriver.exe");
	        WebDriver driver = new FirefoxDriver();
	    	//open Yahoo
			driver.get("https://login.yahoo.com/");
			//Username
			WebElement Username=driver.findElement(By.id("login-username"));
			Username.sendKeys("monika569");
			
			WebElement Next=driver.findElement(By.id("login-signin"));
			Next.click();
			
			

	}

}
