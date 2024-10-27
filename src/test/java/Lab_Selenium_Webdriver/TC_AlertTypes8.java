package Lab_Selenium_Webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_AlertTypes8 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();//this is to set the chromeDriver which we want to use
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/");
        driver.navigate().to("https://letcode.in/alert");

        JavascriptExecutor js=(JavascriptExecutor) driver;


        //simple alert
        driver.findElement(By.id("accept")).click();
        Alert simplealert=driver.switchTo().alert();
        System.out.println("Simple Alert"+simplealert.getText());
        simplealert.accept();

        js.executeScript("alert('no searching methods)");
        // Switch to the alert
        Alert alerts = driver.switchTo().alert();
        // Accept the alert (click "OK")
        alerts.accept();


        //Confirm alert
        driver.findElement(By.id("confirm")).click();
        Alert cnfrmalert=driver.switchTo().alert();
        System.out.println("Confirm alert: "+cnfrmalert.getText());
        cnfrmalert.dismiss();//it will get cancelled

        //Prompt alert
        driver.findElement(By.id("prompt")).click();
        Alert Promptalert=driver.switchTo().alert();
        System.out.println("Prompt alert: "+Promptalert.getText());
        Promptalert.sendKeys("santhosh");
        Thread.sleep(3000);
        Promptalert.accept();

        //Modern Alert
        driver.findElement(By.id("modern")).click();
        WebElement modernalert=driver.findElement(By.xpath("//div[@class='modal-background']"));
        System.out.println("Thank You");

        if(modernalert.isDisplayed())
        {
            System.out.println("Hiiiiiiiiiii");
            driver.findElement(By.xpath("/html/body/app-root/app-alert/section[1]/div/div/div[1]/div/div/div[5]/button")).click();
        }
        System.out.println("Well done");

        js.executeScript("alert('searching methods')");
    }
}
