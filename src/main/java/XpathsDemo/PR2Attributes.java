package XpathsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PR2Attributes {
    @Test
    public void Attribute() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.w3schools.com/");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.xpath("//a[@title='Login to your account' and contains(@class,'anonymous')]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('style', 'border:2px solid red;background:yellow')",element);
        Thread.sleep(4009);
        driver.quit();
    }
}
