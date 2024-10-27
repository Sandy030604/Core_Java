package Lab_Selenium_Webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TC_IsSelected5 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();//this is to set the chromeDriver which we want to use
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/en-gb?route=account/register");


        WebElement subscribe = driver.findElement(By.id("input-newsletter"));


        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");


        //Thread.sleep(8000);
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("input-newsletter"))).click();
//        System.out.print(dk.getAttribute("value"));
//        dk.click();
        System.out.print("Hello");

//        if (dk.isSelected())
//        {
//            System.out.println("Subscribed");
//        }
//        else
//        {
//            System.out.println("Not subscribed");
//        }
    }
}
