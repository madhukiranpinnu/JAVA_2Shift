package Selinium_Basic.Set1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PR7IFrames {
    @Test
    public  void Tst1() {
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://demoqa.com/frames");
        driver.manage().window().maximize();
        int frames=driver.findElements(By.tagName("iframe")).size();
        System.out.println(frames);
        driver.switchTo().frame(4);
        System.out.println(driver.findElement(By.xpath("//*[text()='This is a sample page'][1]")).isDisplayed());
        driver.switchTo().defaultContent();
        //Fails as element is not present in frames
        //System.out.println(driver.findElement(By.xpath("//*[text()='This is a sample page'][1]")).isDisplayed());
        driver.quit();
    }
}
