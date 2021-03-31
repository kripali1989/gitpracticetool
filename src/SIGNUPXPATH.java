import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SIGNUPXPATH {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C://Users//user//Downloads//geckodriver.exe");
    	WebDriver driver = new FirefoxDriver();
    	driver.get("file:///C:/Users/user/Desktop/signuppage.html");					
        driver.findElement(By.xpath("./html /body /input[4]")).sendKeys("kripali");
	}

}
