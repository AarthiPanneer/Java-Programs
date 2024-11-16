package Idea;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;


public class Idea123 {
	@Test
    public void idea_Report () throws InterruptedException, IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://share.amazon.com/sites/Ideation-Portal/Lists/Idea%20List/AllItems.aspx");
        driver.navigate().refresh();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

     
        WebElement Idea_Status = driver.findElement(By.xpath("//a[@title='Open Idea Status sort and filter menu']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", Idea_Status);
        js.executeScript("arguments[0].click()", Idea_Status);

        driver.findElement(By.xpath("(//span[normalize-space()='To be Reviewed'])[1]")).click();
        driver.findElement(By.xpath("(//div[contains(@class,'ms-core-menu-labelCompact')])[4]")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='Close'])[1]")).click();

        Thread.sleep(5000);

 
        List<WebElement> dateElements = driver.findElements(By.xpath("//tbody//tr//child::td[17]//span"));
        List<WebElement> titleElements = driver.findElements(By.xpath("//a[@class='ms-listlink ms-draggable']"));
        List<WebElement> nameElements = driver.findElements(By.xpath("//tbody//tr//child::td[4]//span//span//a[2]"));
        List<WebElement> userAliasElements = driver.findElements(By.xpath("//tbody//tr//child::td[14]//span//span//a[2]"));

     
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Details with Dates");

      
        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("Title");
        headerRow.createCell(1).setCellValue("Name");
        headerRow.createCell(2).setCellValue("User Alias");
        headerRow.createCell(3).setCellValue("Fetched Date");
        headerRow.createCell(4).setCellValue("Current Date");
        headerRow.createCell(5).setCellValue("Difference in Days");

       
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("M/d/yyyy");

      
        int rowNumber = 1;
        for (int i = 0; i < dateElements.size(); i++) {
            String fetchedDateText = dateElements.get(i).getText();
            LocalDate fetchedDate = LocalDate.parse(fetchedDateText, dateFormatter);
            long daysDifference = ChronoUnit.DAYS.between(fetchedDate, currentDate);

            Row row = sheet.createRow(rowNumber++);
            row.createCell(0).setCellValue(titleElements.get(i).getText());
            row.createCell(1).setCellValue(nameElements.get(i).getText());
            row.createCell(2).setCellValue(userAliasElements.get(i).getText());
            row.createCell(3).setCellValue(fetchedDate.toString());
            row.createCell(4).setCellValue(currentDate.toString());
            row.createCell(5).setCellValue(daysDifference);
        }

      
        try (FileOutputStream fileOut = new FileOutputStream("DetailsWithDates4.xlsx")) {
            workbook.write(fileOut);
            System.out.println("Excel Generated successfully");
        }

    
        workbook.close();
        driver.quit();
    }
}
