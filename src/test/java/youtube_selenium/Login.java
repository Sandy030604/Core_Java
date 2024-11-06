package youtube_selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static void main(String args[])
    {
        //launch browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //load the URL
        driver.get("https://letcode.in/");
        driver.findElement(By.linkText("Log in")).click();


        //If Id has numbers we should not use it as it will change dynamic
        //name also we should not use when it's dynamic
        //classname- if it's duplicate or has spaces we should not use it
        //linktext and partial link text also we should not use when its dynamic.

        //to find if its dynamic we should open the page in incognito mode and find the attributes that will change 

        driver.findElement(By.name("email")).sendKeys("santhoshs8483@gmail.com");

        driver.findElement(By.name("password")).sendKeys("password");

        driver.findElement(By.xpath("//button[.='LOGIN']")).click();
    }
}
