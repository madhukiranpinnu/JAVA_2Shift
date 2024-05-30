package ExtentReportsDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class PR10 {
    static WebDriver driver;
    public static void main(String[] args) throws IOException {
        ExtentReports extentReports=new ExtentReports();
        ExtentSparkReporter extentSparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/src/main/java/ExtentReportsDemo/Reports/Program9.html");
        extentReports.attachReporter(extentSparkReporter);
        driver=new ChromeDriver();
        driver.navigate().to("https://www.google.com");
        ExtentTest extentTest=extentReports.createTest("Test 1");
        extentTest.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromBase64String(getScreenshot()).build());
        extentReports.flush();
        Desktop.getDesktop().browse(new File(System.getProperty("user.dir")+"/src/main/java/ExtentReportsDemo/Reports/Program9.html").toURI());
    }
    public static String getScreenshot(){
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
    }
}
