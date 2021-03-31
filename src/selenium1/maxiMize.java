package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class maxiMize {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C://Users//user//Downloads//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
 		 
		 // Launch the application
    	 driver.get("https://www.google.com/");
    	 
    	     	//Resize current window to the set dimension
    	        driver.manage().window().maximize();
    	       
    	       //To Delay execution for 10 sec. as to view the maximize browser
    	        Thread.sleep(10000);
    	       
    	        //Close the browser
    	        driver.quit();
	}

}
