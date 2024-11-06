package Lab_Selenium_Webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
//import org.w3c.dom.Node;
import org.w3c.dom.*;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

//import javax.swing.text.Document;
//import javax.swing.text.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

//public class TC_loginxml {
//}


//package Lab_Selenium_Webdriver;
//import Lab_Selenium_Webdriver.LoginUsingPageFactory.*;
////import Lab_Selenium_Webdriver.PomObject.Login_pom1;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.Test;
//
//public class TC_Login1 {
//    @Test
//    void login() throws InterruptedException {
//
//        WebDriverManager.chromedriver().setup();//this is to set the chromeDriver which we want to use
//        WebDriver driver=new ChromeDriver();
//
//        driver.get("https://demo.opencart.com/en-gb?route=account/login");
//        driver.manage().window().maximize();
//        //Login_pom1 obj=new Login_pom1(driver);
//        LoginUsingPageFactory obj= PageFactory.initElements(driver,LoginUsingPageFactory.class);
//
//        Thread.sleep(10000);
//
//        obj.enterusername("santhoshs8483@gmail.com");
//        obj.enterpassword("aaradhana28");
//        obj.clickonloginbutton();
//        //driver.findElement(By.id("input-email")).sendKeys();
//
//        //driver.findElement(By.linkText("Login")).click();
//
//        System.out.println("Hiiii");
//
//
//    }
//}



//package Lab_Selenium_Webdriver;
//import Lab_Selenium_Webdriver.LoginUsingPageFactory.*;
////import Lab_Selenium_Webdriver.PomObject.Login_pom1;
//        import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.Test;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.Properties;

public class TC_loginxml{
    @Test
    void login() throws InterruptedException, IOException, ParserConfigurationException, SAXException {

//        String projectpath=System.getProperty("user.dir");
//
//        Properties prob=new Properties();
//        InputStream input=new FileInputStream(projectpath+"\\login.properties");
//
//        //InputStream input=new FileInputStream("C:\\Users\\santhosh.krishnan\\eclipse-workspace\\Demo_session_1\\src\\test\\java\\Lab_Selenium_Webdriver\\login.properties");
//        prob.load(input);
//        String opencart_url=prob.getProperty("url");
//        String uname=prob.getProperty("username");
//        String pword=prob.getProperty("password");

        File xmlfile=new File("C:\\Users\\santhosh.krishnan\\eclipse-workspace\\Demo_session_1\\login.xml");

        DocumentBuilderFactory DBFactory=DocumentBuilderFactory.newInstance(); //to create a new object DBFactory
        DocumentBuilder DBBuilder=DBFactory.newDocumentBuilder();//to create it as a dom structure
        Document DBDoc=(Document) DBBuilder.parse(xmlfile);//pass the xml file to the document

        NodeList NL=((Node) DBDoc).getChildNodes();
        Node n=NL.item(0);
        Element ele=(Element)n;

        String opencart_url=ele.getElementsByTagName("url").item(0).getTextContent();
        String uname=ele.getElementsByTagName("username").item(0).getTextContent();
        String pword=ele.getElementsByTagName("password").item(0).getTextContent();


        WebDriverManager.chromedriver().setup();//this is to set the chromeDriver which we want to use
        WebDriver driver=new ChromeDriver();

        driver.get(opencart_url);
        driver.manage().window().maximize();
        //Login_pom1 obj=new Login_pom1(driver);
        LoginUsingPageFactory obj= PageFactory.initElements(driver,LoginUsingPageFactory.class);

        Thread.sleep(10000);

        obj.enterusername(uname);
        obj.enterpassword(pword);
        obj.clickonloginbutton();
        //driver.findElement(By.id("input-email")).sendKeys();

        //driver.findElement(By.linkText("Login")).click();

        System.out.println("Hiiii");


    }
}


