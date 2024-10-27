package Lab_Selenium_Webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab5_Q2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();//this is to set the chromeDriver which we want to use
        WebDriver driver=new ChromeDriver();

        driver.get("https://demo.opencart.com/en-gb?route=account/register");
        WebElement sk= driver.findElement(By.name("firstname"));

        sk.sendKeys("santhoshkrishnarajaharrishviayashwinmuruganafiafljhjfdsahjhkjdahlkhfdajafdshkjfahkjhfdsakjhaskjhkjhfdsajhfdsakj");
        System.out.println("hi");


        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(320,document.body.scrollHeight)");
        Thread.sleep(3000);


        driver.findElement(By.cssSelector(".btn.btn-primary")).click();


//        if(driver.findElement(By.id("error-firstname")){
//            System.out.println("Error found in first name");
//        }

//        if(driver.findElement(By.id("error-firstname")))
//        {
//            System.out.println("Error found in the first name");
//        }
        //WebElement dk= driver.findElement(By.id("error-firstname"));
//        if(driver.findElement(By.id("error-firstname")).isDisplayed())
//        {
//            System.out.println("Enter a valid name");
//        }
        Thread.sleep(1000);
        if(driver.findElement(By.id("error-firstname")).getText().length()>0)
        {
            System.out.println("Enter a valid name 1");
        }


        Thread.sleep(2000);
        WebElement pk= driver.findElement(By.name("lastname"));
        pk.sendKeys("akfdjlkjfdsajfsajkjfdsakjkfdsajkjfdsakfdsakjkdsakasfkfdsakfdsakjjfdsakfdsajjfdskjfdsaafsjkjfsakjafs");

        System.out.println("Bye");
        JavascriptExecutor js1=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(320,document.body.scrollHeight)");
        Thread.sleep(3000);

        driver.findElement(By.cssSelector(".btn.btn-primary")).click();

        Thread.sleep(1000);
        if(driver.findElement(By.id("error-lastname")).isDisplayed())
        {
            System.out.println("Enter a valid last name");
        }

        Thread.sleep(1000);

        WebElement dk=driver.findElement(By.id("input-email"));
        dk.sendKeys("santhoshkrishnan@gmail");

        Thread.sleep(1000);
        if(driver.findElement(By.id("error-email")).isDisplayed())
        {
            System.out.println("Enter a valid email");
        }




        sk.submit();
    }
}
