package selenium1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SH1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver","C://Users//user//Downloads//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		 
		 driver.get("https://google.com");
		 
		 File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
		 FileUtils.copyFile(srcfile,new File("C:\\Users\\user\\Desktop\\capture1234.PNG"));
		
		
		 driver.findElement(By.linkText("Gmail")).click();
		
		 File srcfile1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		 FileUtils.copyFile(srcfile1,new File("C:\\Users\\user\\Desktop\\capture1235.PNG"));
		

	}

}
