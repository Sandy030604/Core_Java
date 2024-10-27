package Lab_Selenium_Webdriver;

import Lab_Selenium_Webdriver.PomObject.Login_pom1;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Login1 {
    @Test
    void login() throws InterruptedException {

        WebDriverManager.chromedriver().setup();//this is to set the chromeDriver which we want to use
        WebDriver driver=new ChromeDriver();

        Login_pom1 obj=new Login_pom1(driver);
        driver.get("https://demo.opencart.com/en-gb?route=account/login");
        driver.manage().window().maximize();
        Thread.sleep(10000);

        obj.enterusername("santhoshs8483@gmail.com");
        obj.enterpassword("aaradhana28");
        obj.clickonloginbutton();
        //driver.findElement(By.id("input-email")).sendKeys();

        //driver.findElement(By.linkText("Login")).click();

        System.out.println("Hiiii");


    }
}
