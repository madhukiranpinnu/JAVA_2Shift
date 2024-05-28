package ExtentReportsDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class PR3 {
    public static void main(String[] args) throws IOException {
        ExtentReports reports=new ExtentReports();
        ExtentSparkReporter extentSparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/src/main/java/ExtentReportsDemo/Reports/Program3.html");
        reports.attachReporter(extentSparkReporter);
        ExtentTest test= reports.createTest("Test 1");
        test.log(Status.INFO,"Info level for the Test");
        test.log(Status.PASS,"Test has paased");
        test.log(Status.FAIL,"Test has failed");
        test.log(Status.SKIP,"Test has skipped");
        test.log(Status.WARNING,"Warning has started");
        reports.flush();
        Desktop.getDesktop().browse(new File(System.getProperty("user.dir")+"/src/main/java/ExtentReportsDemo/Reports/Program3.html").toURI());
    }
}
