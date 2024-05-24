package Selinium_Basic.Set1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class PR13Headless {
    @Test
    public void Test1(){
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver=new ChromeDriver(options);
        driver.navigate().to("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();
        driver.quit();
    }
}
