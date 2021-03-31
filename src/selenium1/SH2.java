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

public class SH2 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver","C://Users//user//Downloads//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.moneycontrol.com/news/");
		 
		 List<WebElement>links=driver.findElements(By.linkText("BKFS"));
		 
		 if(links.size()==0)
		 {
			 File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(srcfile,new File("C:\\Users\\user\\Desktop\\capture1.PNG")); 
		 }
		 else
		 {
			 links.get(0).click();
		 }
	}

}
