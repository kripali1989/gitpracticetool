package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class script1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C://Users//user//Downloads//geckodriver.exe");
    	WebDriver driver = new FirefoxDriver();
       
          driver.get("http://www.facebook.com");
          String tagName= "";
        tagName = driver.findElement(By.id("email")).getTagName();
       System.out.println(tagName);
        driver.close();
        System.exit(0);
	}

}
