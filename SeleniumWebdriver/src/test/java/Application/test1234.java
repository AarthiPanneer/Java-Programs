package Application;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class test1234 {

	public static void main(String[] args) {
		// Setup WebDriverManager to handle ChromeDriver binary
	    WebDriverManager.chromedriver().setup();
	    
	    // Create a new instance of the Chrome driver
	    WebDriver driver = new ChromeDriver();
	
	    // Maximize the browser window
	    driver.manage().window().maximize();
	    
	    // Implicitly wait for elements to be present
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(20));
	    
	    // Perform any further actions with the driver...
	    driver.get("google.com");
	    
	}
}


	    
	    
	    
	    
