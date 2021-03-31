package selenium3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Links {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	 System.setProperty("webdriver.gecko.driver","C://Users//user//Downloads//geckodriver.exe");
   	 WebDriver driver=new FirefoxDriver();
	 driver.get("https://www.google.com/?gws_rd=ssl");
	 
	 List<WebElement>dropdowns=driver.findElements(By.tagName("a"));
	 System.out.println(dropdowns.size());
	 
	 for(int i=0; i<dropdowns.size(); i++)
	 {
		 System.out.println(dropdowns.get(i).getAttribute("text"));
	 }

	}

}
