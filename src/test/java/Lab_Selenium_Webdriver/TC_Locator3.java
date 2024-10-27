package Lab_Selenium_Webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TC_Locator3 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();//this is to set the chromeDriver which we want to use
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.opencart.com/en-gb?route=account/register");

        List<WebElement> ele=driver.findElements(By.xpath("//input[@class='form-control']"));

        for(WebElement elementsk:ele)
        {
            System.out.println("Webelement:"+elementsk.getLocation());
        }



    }
}
