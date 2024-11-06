package Lab_Selenium_Webdriver.TestNg;


import Lab_Selenium_Webdriver.PomObject.Amazon_pom2;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;

public class TestNg_AmazonXL {

    WebDriver driver;
    Amazon_pom2 objsk;
    Properties prob;
    String uname;//7550010537
    String pword;
    String projectpath;


    @Test(dataProvider = "dp",priority =1)
    public void f(String username1, String password1) throws InterruptedException {
        System.out.println(username1);
        System.out.println(password1);
        //Username
        objsk.clickByActionByXpath("//*[@id='ap_email']");
        objsk.sendKeyByXpath("//*[@id='ap_email']",username1);
//        objsk.enterusername("7550010537");

        objsk.clickByActionByXpath("//*[@id='continue']");

        objsk.clickByActionByXpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div[2]/div[1]/form/div/div/div/div[1]/input[1]");
        objsk.sendKeyByXpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div[2]/div[1]/form/div/div/div/div[1]/input[1]",password1);
        //objsk.enterpassword("aaradhana28");
        objsk.clickByActionByXpath("//*[@id='signInSubmit']");
        driver.manage().window().maximize();

        System.out.println("This is the test");

        objsk.clickByActionByXpath("//*[@id='twotabsearchtextbox']");
        objsk.sendKeyByXpath("//*[@id='twotabsearchtextbox']","Monitors of Lg brand");
        //driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Monitors of Lg brand");
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys(Keys.ENTER);



        objsk.clickByActionByXpath("//*[@id='a-autoid-0-announce']");

        //-----------------------------
       // driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]")).click();
        Thread.sleep(500);
        objsk.clickByActionByXpath("//*[@id='s-result-sort-select_5']");
        //driver.findElement(By.xpath("//*[@id=\"s-result-sort-select_5\"]")).click();
        Thread.sleep(5000);

        Thread.sleep(1000);
        objsk.clickByActionByXpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a");
        //driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a")).click();

        ArrayList<String> list=new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(list.get(1));

        Thread.sleep(5000);


        System.out.println("Scrolll happens");

        Thread.sleep(5000);

        // Resize the window to a small size
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,6000)");

        //driver.findElement(By.xpath("/html/body/div[2]/div/div[5]/div[3]/div[1]/div[4]/div/div[1]/div/div/div/form/div/div/div/div/div[4]/div/div[37]/div[1]/span/span/span/input")).click();
        objsk.clickByActionById("add-to-cart-button");
        //driver.findElement(By.id("add-to-cart-button")).click();
        System.out.println("Added to cart");

        Thread.sleep(5000);
        objsk.clickByActionByXpath("/html/body/div[8]/div[3]/div[3]/div/div[1]/a");
        //driver.findElement(By.xpath("/html/body/div[8]/div[3]/div[3]/div/div[1]/a")).click();

        System.out.println("Popupu clicked");



        objsk.clickByActionByXpath("/html/body/div[2]/div/div[5]/div[3]/div[1]/div[4]/div/div[1]/div/div/div/form/div/div/div/div/div[7]/div[3]/div[1]/span[1]/span");
        //driver.findElement(By.xpath("/html/body/div[2]/div/div[5]/div[3]/div[1]/div[4]/div/div[1]/div/div/div/form/div/div/div/div/div[7]/div[3]/div[1]/span[1]/span")).click();

        objsk.clickByActionByXpath("/html/body/div[9]/div/div/header/button");
        //driver.findElement(By.xpath("/html/body/div[9]/div/div/header/button")).click();

        System.out.println("HIIIIIIIIIIIIIIIIIIIIIIIIII");

        Thread.sleep(1000);
        objsk.clickByActionByXpath("//*[@id=\"a-popover-7\"]/div/header/button");


        //driver.findElement(By.xpath("//*[@id=\"a-popover-7\"]/div/header/button")).click();
        System.out.println("wishlist cross clicked");
        Thread.sleep(3000);
        System.out.println("Scoll to working");

        objsk.clickByActionByXpath("/html/body/div[2]/header/div/div[1]/div[3]/div/a[4]");
        //driver.findElement(By.xpath("/html/body/div[2]/header/div/div[1]/div[3]/div/a[4]")).click();
        System.out.println("Cart button clicked");

        //System.out.println(count);

        objsk.clickByActionByXpath("/html/body/div[1]/div[1]/div[4]/div[5]/div/div[2]/div[1]/div/form/div[2]/div[3]/div[4]/div/div[3]/div[1]/span[1]/span/span[1]/div/button[1]");
        //driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[4]/div[5]/div/div[2]/div[1]/div/form/div[2]/div[3]/div[4]/div/div[3]/div[1]/span[1]/span/span[1]/div/button[1]")).click();
    }



    @BeforeMethod()

    public void beforeMethod() throws IOException {
//        projectpath=System.getProperty("user.dir");
//       prob=new Properties();
//        InputStream input=new FileInputStream(projectpath+"\\Amazon.properties");
//        prob.load(input);
//        uname=prob.getProperty("username");
//        pword=prob.getProperty("password");
//        System.out.println("username:"+uname);
//        System.out.println("password:"+pword);
//        WebDriverManager.chromedriver().setup();//this is to set the chromeDriver which we want to use
//        driver = new ChromeDriver();
//        objsk=new Amazon_pom2(driver);
//        String amazon_url=prob.getProperty("url");
//      // driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
////        Amazon_pom2 objsk=new Amazon_pom2(driver);
//        driver.get(amazon_url);

    }

    @AfterMethod

    public void afterMethod() throws InterruptedException {

        System.out.println("This is @AfterMethod");

    }


    @DataProvider
    public Object[][] dp() {

        return new Object[][] {
               //new Object[]{prob.getProperty("username"),prob.getProperty("password")}
               // new String[]{prob.getProperty("password")}

                new Object[]{ uname , pword }

        };

    }

    @BeforeClass

    public void beforeClass() throws IOException {
//        projectpath=System.getProperty("user.dir");
//        prob=new Properties();
//        InputStream input=new FileInputStream(projectpath+"\\Amazon.properties");
//        prob.load(input);
//        uname=prob.getProperty("username");
//        pword=prob.getProperty("password");


        FileInputStream sk=new FileInputStream("C:\\Users\\santhosh.krishnan\\eclipse-workspace\\Demo_session_1\\AmazonnewXL1.xlsx");
        XSSFWorkbook workbooks=new XSSFWorkbook(sk);
        XSSFSheet sheet=workbooks.getSheet("Sheet1");


        int noofrows=sheet.getPhysicalNumberOfRows();
        System.out.println("No of rows:"+noofrows);

        for(int i=0;i<noofrows;i++)
        {
            WebDriverManager.chromedriver().setup();//this is to set the chromeDriver which we want to use
            driver = new ChromeDriver();
            objsk=new Amazon_pom2(driver);
            String url=sheet.getRow(i).getCell(0).getStringCellValue();
            // driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
            driver.get(url);
            int p=(int)sheet.getRow(i).getCell(1).getNumericCellValue();
            uname=(String) sheet.getRow(i).getCell(1).getStringCellValue();
            pword=sheet.getRow(i).getCell(2).getStringCellValue();
        }

        System.out.println("username:"+uname);
        System.out.println("password:"+pword);

        WebDriverManager.chromedriver().setup();//this is to set the chromeDriver which we want to use
        driver = new ChromeDriver();
        objsk=new Amazon_pom2(driver);
        //String amazon_url=prob.getProperty("url");
        // driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
//        Amazon_pom2 objsk=new Amazon_pom2(driver);
       // driver.get(amazon_url);

    }

    @AfterClass

    public void afterClass() throws InterruptedException {

        System.out.println("This is the @AfterClass");


//        driver.quit();

    }

    @BeforeTest

    public void beforeTest() {

        System.out.println("This is the @BeforeTest");

    }

    @AfterTest

    public void afterTest() {

        System.out.println("This is the @AfterTest");

    }

    @BeforeSuite

    public void beforeSuite() {

        System.out.println("This is the @BeforeSuite");

    }

    @AfterSuite

    public void afterSuite() {

        System.out.println("This is the @AfterSuite");

    }

}




