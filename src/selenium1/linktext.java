package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class linktext {

	public static void main(String[] args) throws InterruptedException {
						
		System.setProperty("webdriver.gecko.driver","C://Users//user//Downloads//geckodriver.exe");
    	WebDriver driver = new FirefoxDriver();
        
        String baseUrl = "file:///C:/Users/user/Desktop/link.html";	
        driver.get(baseUrl);
        Thread.sleep(10000);
        WebElement link= driver.findElement(By.partialLinkText("Sig"));
        link.click();
        Thread.sleep(10000);
        //System.out.println("title of page is: " + driver.getTitle());							
        driver.quit();
	}

}
