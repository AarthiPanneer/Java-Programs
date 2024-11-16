package Idea;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IdeaSelenium {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://crio-qkart-frontend-qa.vercel.app/register");
		driver.navigate().refresh();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
	    WebElement Username_Rg = driver.findElement(By.xpath("//input[@id = 'username']"));
	    Username_Rg .sendKeys("Sonu_12345");
	    
	    WebElement pwd = driver.findElement(By.xpath("//input[@id = 'password']"));
	    pwd.sendKeys("Neela*28");
	    
	    WebElement Confirm_Pwd =driver.findElement(By.xpath("//input[@id = 'confirmPassword']"));
	    Confirm_Pwd.sendKeys("Neela*28");
	    
	    driver.findElement(By.xpath("//button[text()='Register Now']")).click();
	    
	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	    wait.until(ExpectedConditions.urlToBe("https://crio-qkart-frontend-qa.vercel.app/login"));
	   

	    WebElement User = driver.findElement(By.xpath("//input[@id ='username']"));
	    User.sendKeys("Sonu_12345");
	    
	    WebElement Pwd_Us = driver.findElement(By.xpath("//input[@id ='password']"));
	    Pwd_Us.sendKeys("Neela*28");
	    
	    driver.findElement(By.xpath("//button[text()='Login to QKart']")).click();
	    
	    System.out.print("Login Succeed");
	    
	    driver.quit();
	    
	    
	    
	  
		
		//Actions actions = new Actions(driver);
		//actions.scrollByAmount(5000, 0).perform();
		
	}

}
