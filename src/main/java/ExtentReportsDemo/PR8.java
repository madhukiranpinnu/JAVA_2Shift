package ExtentReportsDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class PR8 {
    public static void main(String[] args) throws IOException {
        ExtentReports extentReports=new ExtentReports();
        ExtentSparkReporter extentSparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/src/main/java/ExtentReportsDemo/Reports/Program8.html");
        extentReports.attachReporter(extentSparkReporter);
        ExtentTest test=extentReports.createTest("Test 1");
        test.log(Status.FAIL,"failed");
        try{
            int i=10/0;
        }
        catch (Exception e){
            test.log(Status.FAIL,e);
        }
        extentReports.flush();
        Desktop.getDesktop().browse(new File(System.getProperty("user.dir")+"/src/main/java/ExtentReportsDemo/Reports/Program8.html").toURI());
    }
}
