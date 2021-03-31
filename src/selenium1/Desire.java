package selenium1;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Desire {

	public static void main(String[] args) {
		//it is used to define ff capability 
		 DesiredCapabilities capabilities = DesiredCapabilities.Firefox();
		  
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "FF");
		capabilities.setCapability(InternetExplorerDriver.
		  INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);




		 //it is used to initialize the IE driver
		 WebDriver driver = new InternetExplorerDriver(capabilities);
		  
		 driver.manage().window().maximize();

		 driver.get("http://gmail.com");
		  
		 driver.quit()
	}

}
