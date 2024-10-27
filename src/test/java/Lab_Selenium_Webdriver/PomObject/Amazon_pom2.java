package Lab_Selenium_Webdriver.PomObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Amazon_pom2 {
    WebDriver driverssk;

    public Amazon_pom2(WebDriver driver)
    {
        driverssk=driver;
    }
    By amazonuser=By.xpath("//*[@id='ap_email']");
    By amazonpassword=By.xpath("//*[@id='ap_password']");


    public void enterusername(String email)
    {
        driverssk.findElement(amazonuser).sendKeys(email);
    }

    public void enterpassword(String pword)
    {
        driverssk.findElement(amazonpassword).sendKeys(pword);
    }


    public void clickByActionById(String val)
    {
        driverssk.findElement(By.id(val)).click();
    }

    public void clickByActionByXpath(String val)
    {
        driverssk.findElement(By.xpath(val)).click();
    }


    public void sendkeyById(String valsend,String ip)
    {
        driverssk.findElement(By.id(valsend)).sendKeys(ip);
    }

    public void sendKeyByXpath(String valsend,String ip)
    {
        driverssk.findElement(By.xpath(valsend)).sendKeys(ip);
    }

}
