package Lab_Selenium_Webdriver.learnSelenium;



import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {
    public static void main(String[] args) {
        // Set up ChromeDriver (update the path to your local chromedriver)
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Step 1: Navigate to the W3Schools Tryit Editor page
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_button");

        // Step 2: Switch to the iframe where the result is displayed
        driver.switchTo().frame("iframeResult");

        // Step 3: Interact with an element inside the iframe (e.g., clicking the "Click Me!" button)
        WebElement button = driver.findElement(By.tagName("button"));
        button.click();

        // (Optional) Verify the output after clicking the button
        WebElement result = driver.findElement(By.id("demo"));
        System.out.println("Button clicked, resulting text: " + result.getText());

        // Step 4: Switch back to the main content after interacting with the iframe
        driver.switchTo().defaultContent();

        // Now you can interact with elements in the main page if needed
        WebElement homeLink = driver.findElement(By.linkText("HTML HOME"));
        homeLink.click();

        // Close the browser after the operation
        driver.quit();
    }
}

