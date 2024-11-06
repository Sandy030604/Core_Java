package Lab_Selenium_Webdriver.learnSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Automation_Practice {
    public static void main(String[] args) {
        // Set up WebDriver
//        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("http://automationpractice.com/index.php");

            // Implicit wait
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            // Example of mouse hover
            Actions actions = new Actions(driver);
            WebElement componentsTab = driver.findElement(By.xpath("//a[text()='Components']"));
            actions.moveToElement(componentsTab).perform();

            // Click on Monitors
            driver.findElement(By.linkText("Monitors")).click();

            // Select from dropdown
            WebElement dropdown = driver.findElement(By.id("show"));
            dropdown.sendKeys("25");

            // Add first item to cart
            driver.findElement(By.xpath("//button[contains(text(),'Add to cart')][1]")).click();

            // Click on Specification tab
            driver.findElement(By.linkText("Specifications")).click();

            // Verify details on the page
            // Add your verification logic here

            // Add to wishlist
            driver.findElement(By.xpath("//button[text()='Add to Wish List']")).click();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".alert-success")));

            // Search for mobile
            driver.findElement(By.id("search")).sendKeys("Mobile");
            driver.findElement(By.id("search-button")).click();

            // Check the product and add to cart
            driver.findElement(By.linkText("HTC Touch HD")).click();
            WebElement qty = driver.findElement(By.name("qty"));
            qty.clear();
            qty.sendKeys("3");
            driver.findElement(By.xpath("//button[text()='Add to Cart']")).click();

            // Verify success message
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".alert-success")));

            // Checkout and logout
            // Add your logout and verification logic here

        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
