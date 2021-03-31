package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;


public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.opera.driver","C:\\Users\\user\\Downloads\\operadriver_win64\\operadriver_win64\\operadriver.exe");
       WebDriver driver=new OperaDriver();
       driver.get("https://www.instagram.com");
       
       
	}

}