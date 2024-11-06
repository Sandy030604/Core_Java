package Lab_Selenium_Webdriver.learnSelenium;

import Lab_Selenium_Webdriver.PomObject.Hotstarpom;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hotstar_normal {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driverz=new ChromeDriver();
        Hotstarpom objectskr;
        objectskr=new Hotstarpom(driverz);
        driverz.get("https://www.hotstar.com/in/home");
        System.out.println("BBBBBBBBBBBBBBBBBBBB");
        //objectskr.xpathfindclick("/html/body/div[1]/div[4]/div/div[2]/aside/nav/div[2]/a/button/span[1]");
        System.out.println("Hiiiiiiiiiiii");

//        Actions actions = new Actions(driverz);
//        WebElement searchInput = driverz.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[3]/div/div[1]/div/div/div/input")); // Use the appropriate selector
//        actions.moveToElement(searchInput).click().perform();
        Thread.sleep(2000);


        objectskr.xpathfindclick("/html[1]/body[1]/div[1]/div[4]/div[1]/div[2]/aside[1]/nav[1]/div[2]/a[1]");

        Thread.sleep(3000);
        objectskr.xpathfindclick("/html[1]/body[1]/div[1]/div[4]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]");

        objectskr.sendkeypath("/html[1]/body[1]/div[1]/div[4]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]","Sophia the first");

//        Actions actions = new Actions(driverz);
//        WebElement overlay=driverz.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[3]/div/div[1]/div/div/div/input"));
//        actions.moveToElement(overlay).perform();
//
//        objectskr.xpathfindclick("//a[@aria-label='Search']");
//
//        objectskr.sendkeypath("/html/body/div[1]/div[4]/div/div[3]/div/div[1]/div/div/div/input","Sophia the first");
//        objectskr.xpathfindclick("/html/body/div[1]/div[4]/div/div[3]/div/div[4]/div/div/div/div/div[1]");
    }
}



//package Lab_Selenium_Webdriver;
//
//import Lab_Selenium_Webdriver.PomObject.Hotstarpom;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//
//public class Hotstar_normal {
//    public static void main(String[] args) {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        Hotstarpom objectskr = new Hotstarpom(driver);
//
//        driver.get("https://www.hotstar.com/in/home");
//
//        Duration tenSeconds = Duration.ofSeconds(10);
//
//        // Wait for the search icon to be clickable
//        WebElement searchIcon = new WebDriverWait(driver, tenSeconds)
//                .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@aria-label='Search']")));
//
//        // Hover over the search icon to trigger the input field
//        Actions actions = new Actions(driver);
//        actions.moveToElement(searchIcon).perform();
//
//        // Wait for the search input field to be visible
//        WebElement searchInput = new WebDriverWait(driver, tenSeconds)
//                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search']")));
//
//        // Enter the search query
//        searchInput.sendKeys("Sophia the first");
//
//        // Click the first search result (adjust the xpath as needed)
//        WebElement firstResult = new WebDriverWait(driver, tenSeconds)
//                .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@data-testid, 'searchResultItem')][1]")));
//        firstResult.click();
//    }
//}