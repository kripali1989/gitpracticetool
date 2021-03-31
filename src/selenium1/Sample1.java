package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

;



public class Sample1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C://Users//user//Downloads//geckodriver.exe");
    	WebDriver driver = new FirefoxDriver();
    	//open face book
		driver.get("https://www.facebook.com/");
		//find element email id 
		//WebElement username=driver.findElement(By.id("email"));
		WebElement username=driver.findElement(By.cssSelector("input[type=\"text\"]"));
		username.sendKeys("abc@gmail.com");
		
		//find out password 
		//WebElement password=driver.findElement(By.id("pass"));
		WebElement password=driver.findElement(By.cssSelector("input[type=\"password\"]"));
		password.sendKeys("your_password");
		Thread.sleep(1000);
		// clear input 
		username.clear();
		password.clear();
		//find  login button
			//WebElement login=driver.findElement(By.name("login"));
		WebElement login=driver.findElement(By.cssSelector("button[value=\"1\"]"));
			login.submit();
			
		
					
	    
		//login.click();
	  
		
		
	}

}
