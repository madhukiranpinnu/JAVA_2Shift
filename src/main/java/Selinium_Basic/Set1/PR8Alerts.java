package Selinium_Basic.Set1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PR8Alerts {
    @Test
    public void SimpleAlert() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://omayo.blogspot.com/");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.xpath("//input[@id='alert1']"));
        element.click();
        Alert alert=driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public void confirmationAlert() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://omayo.blogspot.com/");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.xpath("//input[@id='prompt']"));
        element.click();
        Alert alert=driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.sendKeys("MKMK");
        alert.accept();
        element.click();
        System.out.println(alert.getText());
        alert.sendKeys("MKMK");
        alert.dismiss();
        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public void Promptalert() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://omayo.blogspot.com/");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.xpath("//input[@id='confirm']"));
        element.click();
        Alert alert=driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        Thread.sleep(3000);
        driver.quit();
    }
}
