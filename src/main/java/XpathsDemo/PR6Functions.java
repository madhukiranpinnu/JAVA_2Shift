package XpathsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PR6Functions {
    @Test
    public void Text() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.xpath("//a[text()='Sign in']"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('style','border : 3px solid green; background: red')",element);
        Thread.sleep(4000);
        driver.quit();
    }
    @Test
    public void ContainsText() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('style','border : 3px solid green; background: red')",element);
        Thread.sleep(4000);
        driver.quit();
    }
    @Test
    public void ContainsAttribute() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.xpath("//*[contains(@for,'psw')]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('style','border : 3px solid green; background: red')",element);
        Thread.sleep(4000);
        driver.quit();
    }
    @Test
    public void StartswithAttribute() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.xpath("//*[starts-with(@for,'psw')]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('style','border : 3px solid green; background: red')",element);
        Thread.sleep(4000);
        driver.quit();
    }
    @Test
    public void StartswithText() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.xpath("//a[starts-with(text(),'Sign in into')]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('style','border : 3px solid green; background: red')",element);
        Thread.sleep(4000);
        driver.quit();
    }
    @Test
    public void NormalizeSpaceText() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.xpath("//*[normalize-space(text())='First Name']"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('style','border : 3px solid green; background: red')",element);
        Thread.sleep(4000);
        driver.quit();
    }
    @Test
    public void NormalizeSpaceattribute() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.xpath("//*[normalize-space(@type)='submit']"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('style','border : 3px solid green; background: red')",element);
        Thread.sleep(4000);
        driver.quit();
    }
    @Test
    public void Last() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.xpath("//table[@id='contactList']/tbody/tr[last()]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('style','border : 3px solid green; background: red')",element);
        Thread.sleep(4000);
        driver.quit();
    }
    @Test
    public void Positions() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.xpath("//table[@id='contactList']/tbody/tr[position()>2]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('style','border : 3px solid green; background: red')",element);
        Thread.sleep(4000);
        driver.quit();
    }
}
