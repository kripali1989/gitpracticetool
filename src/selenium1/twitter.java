package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class twitter {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C://Users//user//Downloads//geckodriver.exe");
    	WebDriver driver = new FirefoxDriver();
    	//open face book
		driver.get("https://twitter.com/");
		
		
		WebElement login=driver.findElement(By.className("css-901oao r-1awozwy r-jwli3a r-6koalj r-18u37iz r-16y2uox r-1qd0xha r-a023e6 r-b88u0q r-1777fci r-ad9z0x r-dnmrzs r-bcqeeo r-q4m81j r-qvutc0"));
		login.click();
		//find element email id 
				//WebElement username=driver.findElement(By.id("email"));
				//find out password 
				//WebElement password=driver.findElement(By.id("pass"));
				//find  login buttonusername.sendKeys("abc@gmail.com");
		//password.sendKeys("your_password");
		
	}

}
