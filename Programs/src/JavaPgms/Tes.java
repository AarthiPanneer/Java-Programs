package JavaPgms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tes {
	
	public static void main(String[] arg) {
		
		System.setProperty("webdriver.chrome.driver", "C:\Users\aarthpg\Desktop\Eclipse\Workspace\SeleniumWebdriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.co.za/");
		
	}

}
