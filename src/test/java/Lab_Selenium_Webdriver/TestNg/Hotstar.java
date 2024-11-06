//package Lab_Selenium_Webdriver.TestNg;
//
//import Lab_Selenium_Webdriver.PomObject.Hotstarpom;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.AfterSuite;
//
//import java.time.Duration;
//
//public class Hotstar {
//
//    WebDriver driver;
//    //step 1:
//    Hotstarpom objectsk;
//
//    @Test(dataProvider = "sk",enabled = true,priority = 1)
//    public void f(String login) throws InterruptedException{
//
//
//        System.out.println("This is the test");
//        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[3]/div[1]/div/div[3]/div/button")).click();
//        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[2]/div[3]/div[1]/div/div/form/div[2]/div/div[1]/div[1]/div/div[2]/div/input")).sendKeys(login);
//        //driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/aside/nav/div[1]/a/button/span[1]")).click();
//
//    }
//
//
//
//
//    @BeforeMethod
//    public void beforeMethod() {
//
//        System.out.println("This is @BeforeMethod");
//
//    }
//
//    @AfterMethod
//
//    public void afterMethod() throws InterruptedException {
//
//        System.out.println("This is @AfterMethod");
//
//        driver.quit();
//    }
//
//
//    @DataProvider(name = "sk")
//    public Object[][] dp() {
//
//        return new Object[][] {
//            new Object[] {"7550010537"}
//        };
//
//    }
//
//    @BeforeClass
//    public void beforeClass() {
//
//        System.out.println("This is the @BeforeClass");
//        WebDriverManager.chromedriver().setup();
//        driver=new ChromeDriver();
//        driver.get("https://www.hotstar.com/in/mypage#mp-login");
//        //driver.manage().window().maximize();
//        objectsk=new Hotstarpom(driver);
//
//    }
//
//    @AfterClass
//
//    public void afterClass() throws InterruptedException {
//
//        System.out.println("This is the @AfterClass");
//
//        //driver.quit();
//        //driver.quit();
//
//    }
//
//    @BeforeTest
//    public void beforeTest() {
//
//        System.out.println("This is the @BeforeTest");
//
//    }
//
//    @AfterTest
//    public void afterTest() {
//
//        System.out.println("This is the @AfterTest");
//
//    }
//
//    @BeforeSuite
//    public void beforeSuite() {
//
//        System.out.println("This is the @BeforeSuite");
//
//    }
//
//    @AfterSuite
//    public void afterSuite() {
//
//        System.out.println("This is the @AfterSuite");
//
//    }
//
//}
//
