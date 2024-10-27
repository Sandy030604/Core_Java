package Lab_Selenium_Webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_SendKeys4 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();//this is to set the chromeDriver which we want to use
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.opencart.com/en-gb?route=account/register");

        driver.findElement(By.name("firstname")).sendKeys("Santhosh");//use key chords to make control to next field using tab
        driver.findElement(By.name("firstname")).sendKeys(Keys.TAB);
        driver.findElement(By.name("lastname")).sendKeys(Keys.NUMPAD7);
    }
}
