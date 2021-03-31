package selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C://Users//user//Downloads//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		 
		 driver.get("https://www.mercurytravels.co.in/");
		 driver.findElement(By.className("white-text")).click();
		 
		 List<WebElement>dropdowns=driver.findElements(By.tagName("select"));
		 System.out.println(dropdowns.size());
	
	 for(int i=0;i<dropdowns.size();i++)
	 {
		 System.out.println(dropdowns.get(i).getAttribute("name"));
	 }
		
	 driver.findElement(By.id("themes")).sendKeys("Family");

	 
}
}
