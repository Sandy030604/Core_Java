package Lab_Selenium_Webdriver.TestNg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Google2 {
    @Test
    void google()
    {
//    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();//this is to set the chromeDriver which we want to use
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        System.out.println("The title of the first page: "+driver.getTitle());

        WebElement sk= driver.findElement(By.name("q"));

        sk.sendKeys("Testing Methods");
        sk.submit();

        //driver.findElement(By.name("q")).sendKeys("Testing Methods"); we can also give like this

        driver.navigate().to("https://leetcode.com/");//it will help us to navigate from google.com to leetcode.com
        System.out.println(driver.getTitle()+"1");

        driver.navigate().back();
        System.out.println(driver.getTitle()+"2");

        driver.navigate().forward();
        System.out.println(driver.getTitle()+"3");

        driver.navigate().refresh();
        System.out.println(driver.getTitle()+"4");

        System.out.println(driver.getCurrentUrl()+"5");

        System.out.println(driver.getPageSource().contains("Premium"));

        System.out.println(driver.getPageSource());

        System.out.println("The title of the page"+driver.getTitle());
        driver.close();
    }
}
