package Selinium_Basic.Set1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PR10Checkbox {
    @Test
    public void Checkbox(){
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://omayo.blogspot.com/");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.xpath("//input[@value=\"orange\"]"));
        System.out.println(element.isSelected());
        element.click();
        System.out.println(element.isSelected());
        driver.quit();
    }
}
