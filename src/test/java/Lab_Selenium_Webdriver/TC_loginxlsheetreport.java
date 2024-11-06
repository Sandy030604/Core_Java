package Lab_Selenium_Webdriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class TC_loginxlsheetreport {
    @Test
    void login() throws InterruptedException, IOException, ParserConfigurationException, SAXException {

        WebDriver driver;
        ExtentReports extent=new ExtentReports();//
        ExtentSparkReporter spark = new ExtentSparkReporter("report.html");//to mention the file type
        extent.attachReporter(spark);//to attach the report.html to the extent
        ExtentTest test=extent.createTest("Verify your title");





        FileInputStream input=new FileInputStream(new File("C:\\Users\\santhosh.krishnan\\eclipse-workspace\\Demo_session_1\\loginnewss.xlsx"));
        XSSFWorkbook workbook=new XSSFWorkbook(input);//to convert to access as xl file
        XSSFSheet sheet=workbook.getSheet("Sheet1");//to get the particular sheet

        int noofrows=sheet.getPhysicalNumberOfRows();//to get only the rows having values
        System.out.println("rows: "+noofrows);

        for(int i=0;i<noofrows;i++) {
            WebDriverManager.chromedriver().setup();//this is to set the chromeDriver which we want to use
            driver = new ChromeDriver();
            String url = sheet.getRow(i).getCell(0).getStringCellValue();
            String uname = sheet.getRow(i).getCell(1).getStringCellValue();
            Boolean d;
            Integer p=0;
            String pword;
            driver.get(url);


            if(driver.getTitle().equals("Your tore"))
            {
                test.pass("Title is matched");
            }
            else
            {
                test.fail("Title is not matched");

                File ssfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(ssfile,new File("s2.jpg"));
            }
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


//            WebDriverManager.chromedriver().setup();//this is to set the chromeDriver which we want to use
//            driver = new ChromeDriver();

            driver.manage().window().maximize();
            //Login_pom1 obj=new Login_pom1(driver);
            LoginUsingPageFactory obj = PageFactory.initElements(driver, LoginUsingPageFactory.class);

            Thread.sleep(10000);

            obj.enterusername(uname);
            obj.enterpassword(pword);
            obj.clickonloginbutton();


            System.out.println("Hiiii");
            extent.flush();
        }
    }
}


