package FrameworkConcepts.PageFactory.DriverSetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetupDemo {
    public static WebDriver initialize(){
        WebDriver driver=new ChromeDriver();
        return driver;
    }
}
