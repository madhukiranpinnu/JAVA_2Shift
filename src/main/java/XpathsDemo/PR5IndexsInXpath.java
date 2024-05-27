package XpathsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PR5IndexsInXpath {
    @Test
    public void IndexEnd() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.xpath("//table[@id='contactList']/tbody/tr[3]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('style','border: 2px solid blue;background:yellow')",element);
        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public void IndexWhole() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.xpath("(//table[@id='contactList']/tbody/tr/td)[23]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('style','border: 2px solid blue;background:yellow')",element);
        Thread.sleep(3000);
        driver.quit();
    }
}
