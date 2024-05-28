package ExtentReportsDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class PR2 {
    public static void main(String[] args) throws IOException {
        ExtentReports extentReports=new ExtentReports();
        ExtentSparkReporter extentSparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/src/main/java/ExtentReportsDemo/Reports/Program2.html");
        extentReports.attachReporter(extentSparkReporter);
        ExtentTest test1=extentReports.createTest("Test 1");
        ExtentTest test2=extentReports.createTest("Test2");
        test2.pass("Test 2 has passed");
        ExtentTest test3=extentReports.createTest("Test 3");
        test3.log(Status.FAIL,"Test 3 has failed");
        ExtentTest test4=extentReports.createTest("Test 4");
        test4.log(Status.SKIP,"Test has been skipped");
        extentReports.flush();
        Desktop.getDesktop().browse(new File(System.getProperty("user.dir")+"/src/main/java/ExtentReportsDemo/Reports/Program2.html").toURI());
    }
}
