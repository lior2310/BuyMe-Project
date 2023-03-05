package Tests;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {

public static WebDriver;
public static WebDriverWait wait;

private static ExtentReports extent;
private static ExtentTest myTests;

@BeforeClass
public static void setUp(){
    extent = new ExtentReports(reportFillPath);
  //  myTests = extent.startTest(@Test);

}

    private static String reportFillPath ="C:/Users/User/Desktop/AutomationCourse.BuyMe-project.html";

String lior;

    //driver
    //file path
    //object for each page class except basePage

    //@before class
    //@after class
    //read from file
    //screenshot













@AfterClass
public void trardown(){
//    driver.close();
//    driver.quit();
}







}
