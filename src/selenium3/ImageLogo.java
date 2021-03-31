package selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImageLogo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	   System.setProperty("webdriver.gecko.driver","C://Users//user//Downloads//geckodriver.exe");
	   WebDriver driver=new FirefoxDriver();
	   
	   driver.get("https://www.facebook.com/");
	   
	   WebElement image = driver.findElement(By.tagName("img"));
	   String value = image.getCssValue("img");
	   System.out.println(value);
	   if(value.equals(image))
	   {
		   System.out.println("Logo is created using image");
	   }
	   else
	   {
		   System.out.println("Logo is not created using image"); 
	   }
	}

}
