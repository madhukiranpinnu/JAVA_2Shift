package ExtentReportsDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class PR13 {
    static WebDriver driver;
    public static void main(String[] args) throws IOException {
        ExtentReports extentReports=new ExtentReports();
        ExtentSparkReporter extentSparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/src/main/java/ExtentReportsDemo/Reports/Program13.html");
        extentReports.attachReporter(extentSparkReporter);
        driver=new ChromeDriver();
        driver.navigate().to("https://www.google.com");
        ExtentTest extentTest=extentReports.createTest("Test 1");
        extentTest.assignAuthor("Madhukiran");
        extentTest.assignDevice("Desktop");
        extentTest.assignCategory("Smoke");
        String os=System.getProperty("os.name");
        String java=System.getProperty("java.version");
        String browser=((RemoteWebDriver)driver).getCapabilities().getBrowserName();
        String browserversion=((RemoteWebDriver)driver).getCapabilities().getBrowserVersion();
        extentReports.setSystemInfo("OS",os);
        extentReports.setSystemInfo("java",java);
        extentReports.setSystemInfo("browser",browser);
        extentReports.setSystemInfo("version",browserversion);
        extentReports.setSystemInfo("URL","https://www.google.com");
        extentTest.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromBase64String(getScreenshot()).build());
        ExtentTest extentTest1=extentReports.createTest("Test 2");
        extentTest1.assignCategory("klov")
                .assignDevice("Mobile")
                .assignAuthor("Neni");
        extentTest1.log(Status.FAIL,"Failed");
        extentReports.flush();
        driver.quit();
        Desktop.getDesktop().browse(new File(System.getProperty("user.dir")+"/src/main/java/ExtentReportsDemo/Reports/Program13.html").toURI());
    }
    public static String getScreenshot(){
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
    }
}
