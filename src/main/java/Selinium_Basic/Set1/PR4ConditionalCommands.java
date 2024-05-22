package Selinium_Basic.Set1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PR4ConditionalCommands {
    @Test
    public void Test4(){
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://omayo.blogspot.com/");
        WebElement button=driver.findElement(By.xpath("//button[text()='Button2']"));
        System.out.println(button.isEnabled());
        WebElement radiobutton=driver.findElement(By.id("radio1"));
        System.out.println(radiobutton.isSelected());
        System.out.println(button.isDisplayed());
        driver.quit();
    }
}
