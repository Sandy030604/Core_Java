package Lab_Selenium_Webdriver.learnSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Download {
    public static void main(String[] args) {
        // Set up ChromeDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            // Step 1: Go to the sample file download page
            driver.get("https://sample-videos.com/download-sample-text-file.php");

            // Step 2: Find and click the download link for a sample text file
            driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/div[2]/table/tbody/tr[1]/td[3]/a")).click();

            // Wait for download to complete
            Thread.sleep(10000); // Adjust as needed based on download speed

            System.out.println("File download initiated.");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
//            driver.quit();
        }
    }
}

