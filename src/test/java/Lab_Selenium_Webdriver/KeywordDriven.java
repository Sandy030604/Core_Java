package Lab_Selenium_Webdriver;


import org.testng.annotations.Test;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class KeywordDriven {
    @Test(dataProvider = "dp")
    public void f(Integer n, String s) {
    }
    @BeforeMethod
    public void beforeMethod() {
    }

    @AfterMethod
    public void afterMethod() {
    }


    @DataProvider
    public Object[][] dp() {
        return new Object[][] {
                new Object[] { 1, "a" },
                new Object[] { 2, "b" },
        };
    }
    @BeforeClass
    public void beforeClass() throws IOException {
        InputStream input=new FileInputStream("C:\\Users\\ashwin.murugan\\eclipse-workspace\\sample\\organizer.xlsx");
        XSSFWorkbook workbook=new XSSFWorkbook(input);

    }

    @AfterClass
    public void afterClass() {
    }

    @BeforeTest
    public void beforeTest() {
    }

    @AfterTest
    public void afterTest() {
    }

    @BeforeSuite
    public void beforeSuite() {
    }

    @AfterSuite
    public void afterSuite() {
    }

}

