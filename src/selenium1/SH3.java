package selenium1;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SH3 {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.gecko.driver","C://Users//user//Downloads//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		 
		 driver.get("https://www.google.com");
		 
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		 for(int i=0;i<links.size();i++)
		 {
			 if(links.get(i).isDisplayed())
			 {
				 String name=links.get(i).getText();
				 links.get(i).click();
				 
				 File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				 FileUtils.copyFile(srcfile,new File("C:\\\\Users\\\\user\\\\Desktop\\\\capture1.PNG"+name+".png")); 
			
			      driver.navigate().back();
			      links=driver.findElements(By.tagName("a"));
			 
			 }
		 }
	}

}
