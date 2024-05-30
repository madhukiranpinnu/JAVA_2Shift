package ExtentReportsDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class PR9 {
    static WebDriver driver;
    public static void main(String[] args) throws IOException {
        ExtentReports extentReports=new ExtentReports();
        ExtentSparkReporter extentSparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/src/main/java/ExtentReportsDemo/Reports/Program9.html");
        extentReports.attachReporter(extentSparkReporter);
        driver=new ChromeDriver();
        driver.navigate().to("https://www.google.com");
        ExtentTest test= extentReports.createTest("Test 1");
        String base64=getScreenshot();
        test.info("Info to pass").addScreenCaptureFromBase64String(base64);
        test.log(Status.FAIL,"GHgh");
        extentReports.flush();
        Desktop.getDesktop().browse(new File(System.getProperty("user.dir")+"/src/main/java/ExtentReportsDemo/Reports/Program9.html").toURI());
    }
    public static String getScreenshot(){
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
    }
}
