package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class radio {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C://Users//user//Downloads//geckodriver.exe");
    	WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/user/Desktop/signuppage.html");					
        WebElement radio1 = driver.findElement(By.id("m"));							
        WebElement radio2 = driver.findElement(By.id("f"));							
        		
        //Radio Button1 is selected		
        
        boolean s1=radio.isDisplayed();
        if (s1)
        {
        	 System.out.println("Radio Button Option 1 displayed");	
        	 boolean s2=radio.isSelected();
        	 if (s2)
        	 {    radio1.click();
        		 System.out.println("Radio Button Option 1 Selected"); 
        	 }
        	 else
        	 {
        		 System.out.println("Radio Button Option 1 not selected");
        		
        	 }
        }
        else 
        	 System.out.println("Radio Button Option not Displayed");
        driver.close();		
	}

	private static boolean isSelected() {
		// TODO Auto-generated method stub
		return true;
	}

	private static boolean isDisplayed() {
		// TODO Auto-generated method stub
		return true;
	}
	
        
        					
        		
        //Radio Button1 is de-selected and Radio Button2 is selected		
        //radio2.click();			
       // System.out.println("Radio Button Option 2 Selected");	
        
        //driver.get("file:///C:/Users/user/Desktop/checklist.html");	
        		
        // Selecting CheckBox		
        //WebElement option1 = driver.findElement(By.id("vfb-6-0"));							

        // This will Toggle the Check box 		
        //option1.click();			

        // Check whether the Check box is toggled on 		
      //  if (option1.isSelected()) {					
         //   System.out.println("Checkbox is Toggled On");					

      //  } else {			
          //  System.out.println("Checkbox is Toggled Off");					
       // }		
         
        		
        		
        //Selecting Checkbox and using isSelected Method		
        //driver.get("http://demo.guru99.com/test/facebook.html");					
       // WebElement chkFBPersist = driver.findElement(By.id("persist_box"));							
        //for (int i=0; i<2; i++) {											
         //   chkFBPersist.click (); 			
         //   System.out.println("Facebook Persists Checkbox Status is -  "+chkFBPersist.isSelected());							
        //}		
		
        		


	
	}

