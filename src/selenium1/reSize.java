package selenium1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class reSize {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C://Users//user//Downloads//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
 		 
         // Launch the application
     	 driver.get("https://www.google.com/");
     	 
     	Dimension d = new Dimension(300,1080);
     	//Resize current window to the set dimension
     	   driver.manage().window().setSize(d);
     	        
     	 //To Delay execution for 10 sec. as to view the resize browser
     	 Thread.sleep(10000);
     	       
     	 //Close the browser
     	 driver.quit();
	}

}
