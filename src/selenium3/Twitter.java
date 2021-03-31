package selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Twitter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.gecko.driver","C://Users//user//Downloads//geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
    	//open face book
		driver.get("https://twitter.com/i/flow/signup");
		//Name
		WebElement Name=driver.findElement(By.className("css-1dbjc4n r-18u37iz r-16y2uox r-1wbh5a2 r-1wzrnnt r-1udh08x r-iphfwy r-s1qlax r-ttdzmv"));
		//find out number
		//WebElement Phone=driver.findElement(By.className("css-1dbjc4n r-18u37iz r-16y2uox r-1wbh5a2 r-1wzrnnt r-1udh08x r-iphfwy r-s1qlax r-ttdzmv"));
		
		Name.sendKeys("Admin");
		//Phone.sendKeys("admin123");
		
	//	WebElement login=driver.findElement(By.className("css-901oao r-1awozwy r-jwli3a r-6koalj r-18u37iz r-16y2uox r-1qd0xha r-a023e6 r-b88u0q r-1777fci r-ad9z0x r-dnmrzs r-bcqeeo r-q4m81j r-qvutc0"));
		//login.click();
	}

}
