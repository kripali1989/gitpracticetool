package selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangeHrm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C://Users//user//Downloads//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		String baseUrl="https://opensource-demo.orangehrmlive.com/";
		
		driver.get(baseUrl);
		WebElement username=driver.findElement(By.id("txtUsername"));
		//find out password 
		WebElement password=driver.findElement(By.id("txtPassword"));
		//find  login button
		
		WebElement login=driver.findElement(By.name("Submit"));
	//	username.sendKeys("Admin");
		//password.sendKeys("admin123");
		//login.click();
		
		//username.sendKeys("admin");
		//password.sendKeys("admin123");
		
		//username.sendKeys("admin");
		//password.sendKeys("Admin123");
		
		username.sendKeys("Admin");
		password.sendKeys("admin1234");
		
		login.click();
		
		String title=driver.getTitle();
		System.out.println(title);
		String expectedTitle="not display OrangeHRM";
		String actualTitle="";
		actualTitle=driver.getTitle();
		
		if(actualTitle.contentEquals(expectedTitle))
		{
			System.out.println("Test Passed");
		}else
		{
			System.out.println("Test Failed");
		}

       // close fire fox
		driver.close();	

	}

}

