package TestNG_Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationExmples {
    @Test(invocationCount = 4)
    public void Test1() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.guru99.com/cucumber-tutorials.html");
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        driver.quit();
    }
    @Test(invocationTimeOut = 200000)
    public void Test2() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.guru99.com/cucumber-tutorials.html");
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        driver.quit();
    }
    @Test(invocationCount = 6,threadPoolSize = 3)
    public void Test4() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.guru99.com/cucumber-tutorials.html");
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        driver.quit();
    }
}
