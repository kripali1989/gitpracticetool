package selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class findEs {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C://Users//user//Downloads//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.gmail.com");
	    List<WebElement> elements = driver.findElements(By.id("gmail"));
	    System.out.println("Number of elements:" +elements.size());

	   // for (int i=0; i<elements.size();i++){
	     // System.out.println("Radio button text:" + elements.get(i).getAttribute("value"));
	    }

	    
	}


