package XpathsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PR1TypesOfXpaths {
    @Test
    public void AbsoluteXpath() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.w3schools.com/");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.xpath("/html/body/div/div/nav/a[3]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
        Thread.sleep(4000);
        driver.quit();
    }
    @Test
    public void RelativeXpath() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.w3schools.com/");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.xpath("//a[contains(text(),'Certificates')]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('style','border: 2px solid red; background:blue')",element);
        Thread.sleep(3000);
        driver.quit();
    }
}
