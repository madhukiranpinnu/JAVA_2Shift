package Selinium_Basic.Set1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PR11Textbox {
    @Test
    public void Test1(){
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://omayo.blogspot.com/");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.xpath("//*[contains(text(),'Username:')]/input"));
        element.sendKeys("Madhukiran");
        element.clear();
        element.sendKeys("Pinnu");
        System.out.println(element.getAttribute("value"));
        driver.quit();
    }
}
