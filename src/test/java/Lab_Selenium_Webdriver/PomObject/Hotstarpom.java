package Lab_Selenium_Webdriver.PomObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Hotstarpom {
    WebDriver driverhotstar;
    public Hotstarpom(WebDriver driver)
    {
        driverhotstar=driver;
    }

    public void xpathfindclick(String str)
    {
        driverhotstar.findElement(By.xpath(str)).click();
    }

    public void sendkeypath(String str,String key)
    {
        driverhotstar.findElement(By.xpath(str)).sendKeys(key);
    }

}
