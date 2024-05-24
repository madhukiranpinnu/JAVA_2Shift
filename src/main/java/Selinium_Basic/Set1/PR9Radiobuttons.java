package Selinium_Basic.Set1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PR9Radiobuttons {
    @Test
    public void RadioButtons() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://omayo.blogspot.com/");
        driver.manage().window().maximize();
        WebElement radiobutton=driver.findElement(By.xpath("//input[@name=\"gender\" and @value=\"male\"]"));
        System.out.println(radiobutton.isSelected());
        radiobutton.click();
        System.out.println(radiobutton.isSelected());
        Thread.sleep(3000);
        driver.quit();
    }
}
