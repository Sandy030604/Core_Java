package Lab_Selenium_Webdriver.learnSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectz {
    public static void main(String[] args) {
        // Set up ChromeDriver (update the path to your local chromedriver)
       // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Step 1: Navigate to the Facebook sign-up page
        driver.get("https://www.facebook.com/r.php");

        // Step 2: Locate the dropdown elements for day, month, and year
        WebElement dayDropdown = driver.findElement(By.id("day"));
        WebElement monthDropdown = driver.findElement(By.id("month"));
        WebElement yearDropdown = driver.findElement(By.id("year"));



        dayDropdown.click();
        Select daySelectz=new Select(dayDropdown);
        daySelectz.selectByVisibleText("30"); //it will click it eventhough it is not visible and we want to scroll. it will automatically find it

        monthDropdown.click();
        Select monthselectz=new Select(monthDropdown);
        monthselectz.selectByValue("6"); //values start from 1. so it will choose "June"
        //monthselectz.selectByIndex(6);//o/p:july as it starts from 0


        yearDropdown.click();
        Select yearselect= new Select(yearDropdown);
        yearselect.selectByIndex(30);



        // Optional: Verify selected options
        System.out.println("Selected Day: " + daySelectz.getFirstSelectedOption().getText());
        System.out.println("Selected Month: " + monthselectz.getFirstSelectedOption().getText());
        System.out.println("Selected Year: " + yearselect.getFirstSelectedOption().getText());

        // Close the browser after the operation
       // driver.quit();



        /*
        <select id="month">
            <option value="1">January</option>
            <option value="2">February</option>
            <option value="3">March</option>
            <option value="4">April</option>
            <option value="5">May</option>
            <option value="6">June</option>
        </select>
    To select June:
        Using selectByValue:
            monthSelect.selectByValue("6"); // Selects June
        Using selectByIndex:
            monthSelect.selectByIndex(5); // Selects June (0-based index)*/
    }
}


