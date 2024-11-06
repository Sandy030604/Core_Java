package Lab_Selenium_Webdriver.learnSelenium;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Scroll {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.myntra.com/");


        //JavascriptExecutor sk=(JavascriptExecutor) driver;


//        JavascriptExecutor sk=(JavascriptExecutor) driver;
//        sk.executeScript("window.scrollBy(0,1000)");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        JavascriptExecutor ks=(JavascriptExecutor) driver;
        ks.executeScript("window.scrollBy(0,1000)"); //(horizontal,vertical) (0 in horizontal,1000 in vertical)

        Thread.sleep(2000);
        ks.executeScript("window.scrollBy(1000,2000)"); //it will move 1000 pixel by horizontal right and 2000 pixel by vertical down

        //ks.executeScript("window.scrollTo(0,0)");//it will scroll to top of the page and will be right most

        ks.executeScript("windows.scrollBy(0,-500)");
        /*If you’re at position (0, 1000):

        scrollTo(0, 500):

    This will move the page to an absolute position of (0, 500).
    It will scroll up to the 500-pixel position on the page, regardless of the current scroll position.
    scrollBy(0, 500):

    This will move the page 500 pixels down from the current position.
    Since you’re at (0, 1000), adding 500 pixels will result in a new position of (0, 1500).
    So:

    scrollTo(0, 500) moves to a fixed position of (0, 500).
    scrollBy(0, 500) moves 500 pixels down from wherever you currently are, resulting in (0, 1500) in this case.




    Explanation of scrollBy(x, y)
x (1000): This represents horizontal scrolling. It will move the page 1000 pixels to the right.
y (2000): This represents vertical scrolling. It will move the page 2000 pixels down from the current position.
What Will Happen?
Starting from (0, 1500):

Horizontally: The page will scroll 1000 pixels to the right, so the new horizontal position becomes 1000.
Vertically: The page will scroll 2000 pixels down from 1500, resulting in a new vertical position of 1500 + 2000 = 3500.*/



    }
}
