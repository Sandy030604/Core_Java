package Lab_Selenium_Webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TC_Select6 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();//this is to set the chromeDriver which we want to use
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();//it will maximize the window screen to full

        driver.findElement(By.linkText("Desktops")).click();
        Thread.sleep(10000);
        driver.findElement(By.linkText("Desktops")).click();


        driver.findElement(By.linkText("Mac (1)")).click();

        Select sk=new Select(driver.findElement(By.id("input-sort")));
        sk.selectByIndex(5);//Rating-highest is in the index 5.

        sk.selectByVisibleText("Rating (Lowest)");

        List<WebElement> count=sk.getOptions();
        for(WebElement l:count)
        {
            System.out.println(l+"\n");
        }




    }
}
