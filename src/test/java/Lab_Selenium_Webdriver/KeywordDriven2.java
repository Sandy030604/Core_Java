package Lab_Selenium_Webdriver;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class KeywordDriven2 {
    public static void main(String[] args) throws IOException, ParserConfigurationException, InterruptedException, SAXException {
        FileInputStream input = new FileInputStream("C:\\Users\\santhosh.krishnan\\eclipse-workspace\\Demo_session_1\\organizert.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(input);
        XSSFSheet sheet = workbook.getSheet("Module");

        int noofrows = sheet.getPhysicalNumberOfRows();//to get only the rows having values
        System.out.println("rows: " + noofrows);


        for (int i = 0; i < noofrows; i++)
        {
            String moduleexe=sheet.getRow(i).getCell(2).getStringCellValue();
            if(moduleexe.equals("Y")) {
                String moduleid = sheet.getRow(i).getCell(0).getStringCellValue();
                System.out.println(moduleid);

                XSSFSheet testcasesheet = workbook.getSheet("Testcase");

                int noofrows1 = testcasesheet.getPhysicalNumberOfRows();

                System.out.println(noofrows1);

                for (int j = 0; j < noofrows1; j++)
                {
                    String testcase_moduleid=testcasesheet.getRow(i).getCell(3).getStringCellValue();
                    String testexe=testcasesheet.getRow(j).getCell(2).getStringCellValue();
                    if(testcase_moduleid.equals(moduleid) && testexe.equals("Y"))
                    {
                        String testcaseid=testcasesheet.getRow(i).getCell(0).getStringCellValue();
                        System.out.println(testcaseid);

                        XSSFSheet teststepsheet=workbook.getSheet("Teststep");
                        int noofrows2=testcasesheet.getPhysicalNumberOfRows();
                        System.out.println("Rows of 2:"+noofrows2);

                        for(int k=0;k<noofrows2;k++)
                        {
                            String teststep_testcaseid=teststepsheet.getRow(k).getCell(4).getStringCellValue();
                            String keyword=teststepsheet.getRow(k).getCell(3).getStringCellValue();

                            if(teststep_testcaseid.equals(testcaseid))
                            {
                                switch(keyword)
                                {
                                    case "ln":
                                        System.out.println("This is the final output");
                                        login2();
                                    case "ca":
                                        close();

                                        System.out.println(teststep_testcaseid);
                                }
                            }
                        }


                    }
                }
            }
        }
    }

    private static void login2() throws IOException, ParserConfigurationException, InterruptedException, SAXException {
        System.out.println("This is login");
        TC_loginxlsheet sk=new TC_loginxlsheet();
        sk.login();

    }
    private static void close()
    {
        System.out.println("This is close");
    }
}
