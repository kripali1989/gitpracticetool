package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class closedriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.setProperty("webdriver.edge.driver","C:\\Users\\user\\Downloads\\edgedriver_win64\\msedgedriver.exe");
         WebDriver driver=new EdgeDriver();
         driver.get("http://www.google.com");
         
         
	}

}
