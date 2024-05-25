package Selinium_Basic.Set1;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class PR14Screenshot {
    @Test
    public void FileTest() throws IOException {
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://omayo.blogspot.com/");
        driver.manage().window().maximize();
        File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot,new File(System.getProperty("user.dir")+"/src/main/java/Selinium_Basic/Set1/Screenshots/Screenshot1.png"));
        driver.quit();
    }
    @Test
    public void screenshotAsBAse64(){
       WebDriver driver=new ChromeDriver();
       driver.navigate().to("https://omayo.blogspot.com/");
       driver.manage().window().maximize();
       String base64=((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
        System.out.println(base64);
        driver.quit();
    }
    @Test
    public void screenshotAsbytes(){
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://omayo.blogspot.com/");
        driver.manage().window().maximize();
        byte[] bytes=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        System.out.println(bytes);
        driver.quit();
    }
    @Test
    public void ElementScreenshot() throws IOException {
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://omayo.blogspot.com/");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.xpath("//div[@class='widget-content' and contains(text(),' This is a sample Text on this page.')]"));
        File screenshot=element.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot,new File(System.getProperty("user.dir")+"/src/main/java/Selinium_Basic/Set1/Screenshots/Screenshot2.png"));
        driver.quit();
    }
}
