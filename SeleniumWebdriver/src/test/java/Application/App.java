package Application;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class App {

    public static void main(String[] args) {
        // Set the path to the GeckoDriver executable
        System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\geckodriver");

        // Initialize the FirefoxDriver
        WebDriver driver = new FirefoxDriver();

        // Navigate to the specified URL
        driver.get("https://crio-qkart-frontend-qa.vercel.app/register");

        // Refresh the page
        driver.navigate().refresh();

        // Maximize the window
        driver.manage().window().maximize();

        // Set an implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

        // Close the driver after use (optional, but good practice)
        driver.quit();
    }
}
 