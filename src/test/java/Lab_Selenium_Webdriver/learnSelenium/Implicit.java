package Lab_Selenium_Webdriver.learnSelenium;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;



/*for eg: If there is a page containing email element. The actual time the Selenium waits for finding the element is 500seconds. What if the page takes more time to load. Till that Selenium will not wait*/
public class Implicit {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://letcode.in/");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        driver.findElement(By.xpath("/html/body/app-root/app-header/nav/div/div[2]/div[2]/div/div/a[1]")).click();


        //scenario when i dont give implicit wait
        //In the below I have given the xpath wrong. so when i run it will show error within a fraction of second even before the code gets fully executed
        driver.findElement(By.xpath("/html/body/app-root/app-si")).sendKeys("Santhosh");


        //scenario when i give implicit wait
        driver.findElement(By.xpath("/html/body/app-root/app-si")).sendKeys("Santhosh");
        //I have given implicit wait so it will wait for 10 second and check if the element is present or not. As there can also be chances of page loading issue due to internet.so after 10 seconds only it will show error.

        driver.quit();

    }
}

