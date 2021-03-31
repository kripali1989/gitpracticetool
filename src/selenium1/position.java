package selenium1;

import java.awt.Dimension;
import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class position {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C://Users//user//Downloads//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		
		
		driver.get("https://www.facebook.com/");
		WebElement email=driver.findElement(By.id("email"));
		org.openqa.selenium.Dimension d = email.getSize();
		//Dimension
		int email_hight =d.getHeight();
		int email_width =d.getWidth();
		//position
		org.openqa.selenium.Point p =email.getLocation();
		int email_X_position= p.getX();
		int email_y_position = p.getY();
		
		System.out.println("email filed hight is "+email_hight);
		System.out.println("email filed width is "+email_width);
		System.out.println("email filed x location is "+email_X_position);
		System.out.println("email filed y location is "+email_y_position); 
		
		//password
		WebElement pass=driver.findElement(By.id("email"));
		//
		
	}
	}
