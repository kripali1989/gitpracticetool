package selenium1;


import org.openqa.selenium.chrome.ChromeDriver;

public class openBrowser {

	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   ChromeDriver driver=new ChromeDriver();
		   driver.get("www.google.com");
		  
	          
	}

}
