package Lab_Selenium_Webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

public class Lab5_Q1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver sk=new ChromeDriver();

        sk.get("https://demo.opencart.com/en-gb?route=account/register");
        if(Objects.equals(sk.getTitle(), "Register Account")) {
            System.out.println("Continue");
        }
        else
        {
            System.out.println("Not displayed");
        }

        //sk.findElement(By.linkText("Continue")).click();
//        Thread.sleep(3000);
        JavascriptExecutor js=(JavascriptExecutor)sk;
        js.executeScript("window.scrollBy(320,document.body.scrollHeight)");
        Thread.sleep(3000);
       sk.findElement(By.cssSelector(".btn.btn-primary")).click();


        //assertThat(sk.switchTo().alert().getText(), is("Hey! Welcome to LetCode"));
        System.out.println("Hi");

//        if(sk.switchTo().alert().getText().equalsIgnoreCase("Warning: You must agree to the privacy policy!"))
//        {
//            System.out.println("Done");
//        }
//        String value=sk.findElement(By.cssSelector("#form-register > div > button")).getText();
//
//        System.out.print(value);
//        WebElement val=sk.findElement(By.cssSelector("#form-register > div > button"));
//        Thread.sleep(2000);
//        val.click();
//        String styleval=val.getAttribute("style");
//        if(styleval.length()>0){
//            System.out.print("Popup");
//            WebDriverWait wait = new WebDriverWait(sk, Duration.ofSeconds(10)); // Wait for a max of 10 seconds
//            WebElement alertDiv = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("alert alert-danger alert-dismissible"))); // Change the selector as needed
//
//            // Get the text from the 'div' tag when it appears
//            String alertText = alertDiv.getText();
//            System.out.println("Alert text: " + alertText);
//
//        }else{
//            System.out.print("NotPop");
//        }

        System.out.println("Warning: "+sk.findElement(By.id("alert")).isDisplayed());

        Thread.sleep(500);

        System.out.println(sk.findElement(By.xpath("//*[@id='alert']/dirv")).getText());



    }

}
