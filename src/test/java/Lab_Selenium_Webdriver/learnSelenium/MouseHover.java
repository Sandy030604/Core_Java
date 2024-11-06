package Lab_Selenium_Webdriver.learnSelenium;




import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
    public static void main(String[] args) throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); // Update path as per your setup
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Step 1: Open Amazon’s website
        driver.get("https://www.amazon.com");

        Thread.sleep(10000);

        // Step 2: Create an Actions instance for mouse hover actions
        Actions actions = new Actions(driver);

        // Step 3: Locate the “Account & Lists” menu element
        WebElement accountsListsMenu = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]"));


        System.out.println("BYEEEEEEEEE");
        // Step 4: Hover over the “Account & Lists” menu
        actions.moveToElement(accountsListsMenu).perform();
        //it will help the selenium to notify that it should navigate to the mouse hovering place

        // Step 5 (Optional): Perform additional actions, like clicking a submenu item
        //to find the menu which is in the mousehovered place we can click in that and using force:hover we can find the path
        WebElement yourOrders = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]/span/span"));
        yourOrders.click();

        System.out.println("HIIII");

        // Close the browser after the operation
        //driver.quit();
    }
}
