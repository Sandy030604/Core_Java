package Lab_Selenium_Webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class TC_loginxlsheet {
    @Test
    void login() throws InterruptedException, IOException, ParserConfigurationException, SAXException {


        FileInputStream input=new FileInputStream(new File("C:\\Users\\santhosh.krishnan\\eclipse-workspace\\Demo_session_1\\loginnewss.xlsx"));
        XSSFWorkbook workbook=new XSSFWorkbook(input);//to convert to access as xl file
        XSSFSheet sheet=workbook.getSheet("Sheet1");//to get the particular sheet

        int noofrows=sheet.getPhysicalNumberOfRows();//to get only the rows having values
        System.out.println("rows: "+noofrows);

        for(int i=0;i<noofrows;i++) {
            String url = sheet.getRow(i).getCell(0).getStringCellValue();
            String uname = sheet.getRow(i).getCell(1).getStringCellValue();
            Boolean d;
            Integer p=0;
            String pword;
            try{
                p=(int) sheet.getRow(i).getCell(2).getNumericCellValue();
                d=true;
            }catch(Exception e){
                d=false;
            }
            if(d==true){
                 pword=Integer.toString(p);
            }else{
                 pword=sheet.getRow(i).getCell(2).getStringCellValue();
            }

            //String pword = sheet.getRow(i).getCell(2).getStringCellValue();
            System.out.println("username: " + uname);
            System.out.println("password: " + pword);


            WebDriverManager.chromedriver().setup();//this is to set the chromeDriver which we want to use
            WebDriver driver = new ChromeDriver();

            driver.get(url);
            driver.manage().window().maximize();
            //Login_pom1 obj=new Login_pom1(driver);
            LoginUsingPageFactory obj = PageFactory.initElements(driver, LoginUsingPageFactory.class);

            Thread.sleep(10000);

            obj.enterusername(uname);
            obj.enterpassword(pword);
            obj.clickonloginbutton();


            System.out.println("Hiiii");

        }
    }
}


