package ExtentReportsDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class PR1 {
    public static void main(String[] args) throws IOException {
        ExtentReports extentReports=new ExtentReports();
        ExtentSparkReporter extentSparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"src/main/java/ExtentReportsDemo/Reports/Program1.html");
        extentReports.attachReporter(extentSparkReporter);
        extentReports.flush();
        Desktop.getDesktop().browse(new File(System.getProperty("user.dir")+"src/main/java/ExtentReportsDemo/Reports/Program1.html").toURI());
    }
}
