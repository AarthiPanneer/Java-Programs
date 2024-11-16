package TestInfo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebD {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/s?k=iphone14&crid=3I25I6B4W5S1G&sprefix=iphone14%2Caps%2C207&ref=nb_sb_noss_2");
		
		
        

	}

}
