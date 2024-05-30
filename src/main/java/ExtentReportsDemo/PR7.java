package ExtentReportsDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class PR7 {
    public static void main(String[] args) throws IOException {
        ExtentReports extentReports=new ExtentReports();
        ExtentSparkReporter extentSparkReporter=new ExtentSparkReporter(new File(System.getProperty("user.dir")+"/src/main/java/ExtentReportsDemo/Reports/Program7.html"));
        extentReports.attachReporter(extentSparkReporter);
        ExtentTest test=extentReports.createTest("Test 1");
        test.log(Status.FAIL, MarkupHelper.createLabel("failed", ExtentColor.RED));
        extentReports.flush();
        Desktop.getDesktop().browse(new File(System.getProperty("user.dir")+"/src/main/java/ExtentReportsDemo/Reports/Program7.html").toURI());
    }
}
