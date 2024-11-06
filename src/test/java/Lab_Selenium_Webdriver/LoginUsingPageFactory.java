package Lab_Selenium_Webdriver;





import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;


public class LoginUsingPageFactory {
    WebDriver drivers;
    //By username=By.id("input-email");
    @FindBy(id="input-email")
    WebElement username;





    //By password=By.id("input-password");
    @FindBy(id="input-password")
    WebElement password;

    //By loginbutton=By.xpath("//button[@type='submit']");

    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginbutton;

    /*public LoginUsingPageFactory(WebDriver driver)
    {
        drivers=driver;
    }*/

    public void enterusername(String email)
    {

        username.sendKeys(email);
    }
    public void enterpassword(String pword)
    {

        password.sendKeys(pword);
    }
    public void clickonloginbutton()
    {
         loginbutton.click();
    }
}

