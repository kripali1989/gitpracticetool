package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class coptpast {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C://Users//user//Downloads//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Fpc%3Dtopnav-about-n-en&flowName=GlifWebSignIn&flowEntry=SignUp");
		Thread.sleep(5000);
		
		WebElement password=driver.findElement(By.name("Passwd"));
		password.sendKeys("shweta@12");
		password.sendKeys(Keys.CONTROL+"a");
		password.sendKeys(Keys.CONTROL,"c");
		Thread.sleep(1000);

		
		WebElement cpasw=driver.findElement(By.name("ConfirmPasswd"));
		cpasw.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(10000);
	
		driver.quit();
		//
	}

}
