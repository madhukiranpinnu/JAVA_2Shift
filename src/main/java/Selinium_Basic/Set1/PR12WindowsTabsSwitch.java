package Selinium_Basic.Set1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class PR12WindowsTabsSwitch {
    @Test
    public void Test1() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement nTab= driver.findElement(By.xpath("//*[text()='New Tab']"));
        String original=driver.getWindowHandle();
        nTab.click();
        Set<String> tabs=driver.getWindowHandles();
        for (String s:tabs){
           if(original !=s){
               driver.switchTo().window(s);
           }
        }
        System.out.println(driver.findElement(By.id("sampleHeading")).getText());
        driver.switchTo().defaultContent();
        Thread.sleep(4000);
        driver.quit();
    }
    @Test
    public void Test2() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement nWindow= driver.findElement(By.xpath("//*[text()='New Window']"));
        String original=driver.getWindowHandle();
        nWindow.click();
        Set<String> tabs=driver.getWindowHandles();
        for (String s:tabs){
            if(original !=s){
                driver.switchTo().window(s);
            }
        }
        System.out.println(driver.findElement(By.id("sampleHeading")).getText());
        driver.switchTo().defaultContent();
        Thread.sleep(4000);
        driver.quit();
    }
    @Test
    public void Test3() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement nWindow= driver.findElement(By.xpath("//*[text()='New Window Message']"));
        String original=driver.getWindowHandle();
        nWindow.click();
        Set<String> tabs=driver.getWindowHandles();
        for (String s:tabs){
            if(original !=s){
                driver.switchTo().window(s);
            }
        }
        System.out.println(driver.findElement(By.tagName("body")).getText());
        driver.switchTo().defaultContent();
        Thread.sleep(4000);
        driver.quit();
    }
}
