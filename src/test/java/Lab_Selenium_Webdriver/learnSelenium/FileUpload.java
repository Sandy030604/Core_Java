package Lab_Selenium_Webdriver.learnSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FileUpload {
    public static void main(String[] args) {
        // Set up ChromeDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Step 1: Navigate to the file upload page
        driver.get("https://www.file.io/");

        // Step 2: Locate the file upload input element
        WebElement uploadInput = driver.findElement(By.xpath("//input[@type='file']"));
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


//        JavascriptExecutor js=(JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,500)");
//        WebElement uploadInput=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/label[1]"));
        //uploadInput.click();

        // Step 3: Provide the path of the file you want to upload
        uploadInput.sendKeys("C:\\Users\\santhosh.krishnan\\Downloads\\Testing_Types.txt"); // Use double backslashes in the file path
        // Optional: Verify upload
        System.out.println("File uploaded successfully.");

        // Close the browser
        //driver.quit();
    }
}




//"C:\Users\santhosh.krishnan\Downloads\Testing_Types.txt"
