
package website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Run {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://patinformed.wipo.int/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		//driver.manage().timeouts().implicitlyWait()
		driver.findElement(By.xpath("//input [@type ='text']"));
		driver.findElement(By.xpath("//button [@class ='margin-right']"));
		
		

	}

}
