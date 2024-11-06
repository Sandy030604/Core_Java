package youtube_selenium;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandlingInputs {
    public static void main(String[] args) {
        //launch browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //load the URL
        driver.get("https://letcode.in/edit");


        driver.findElement(By.id("fullName")).sendKeys("Santhosh Krishnan");

        driver.findElement(By.id("join")).sendKeys("person", Keys.TAB);
    }
}
