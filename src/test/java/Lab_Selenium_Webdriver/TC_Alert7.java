package Lab_Selenium_Webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Alert7 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();//this is to set the chromeDriver which we want to use
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.findElement(By.id("login1")).sendKeys("Sangfsakfj@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.name("proceed")).click();
        System.out.println("Hi");


        //first switch the driver to alert
        Alert simpleAlertsk=driver.switchTo().alert();
        System.out.println("Alert Message is "+simpleAlertsk.getText());

        simpleAlertsk.accept();

        System.out.println("Alert found");
    }
}
