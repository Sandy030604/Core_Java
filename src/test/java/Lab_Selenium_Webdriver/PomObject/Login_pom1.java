package Lab_Selenium_Webdriver.PomObject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Login_pom1 {
    WebDriver drivers;
    By username=By.id("input-email");
    By password=By.id("input-password");
    By loginbutton=By.xpath("//button[@type='submit']");

    public Login_pom1(WebDriver driver)
    {
        drivers=driver;
    }

    public void enterusername(String email)
    {
        drivers.findElement(username).sendKeys(email);
    }
    public void enterpassword(String pword)
    {
        drivers.findElement(password).sendKeys(pword);
    }
    public void clickonloginbutton()
    {
        drivers.findElement(loginbutton).click();
    }
}
