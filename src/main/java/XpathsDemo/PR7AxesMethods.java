package XpathsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PR7AxesMethods {
    @Test
    public void Preceedingsibling() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.xpath("//td[starts-with(text(),'Maria')]/preceding-sibling::td/input"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('style','border : 3px solid green; background: red')",element);
        Thread.sleep(4000);
        driver.quit();
    }
    @Test
    public void Followingsibling() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[@type='text']]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('style','border : 3px solid green; background: red')",element);
        Thread.sleep(4000);
        driver.quit();
    }
    @Test
    public void Parent() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath("//td[normalize-space(text())='Yoshi Tannamuri']/parent::tr"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('style','border : 3px solid green; background: red')", element);
        Thread.sleep(4000);
        driver.quit();
    }
    @Test
    public void Child() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.xpath("//td[starts-with(text(),'Maria')]/preceding-sibling::td/input"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('style','border : 3px solid green; background: red')",element);
        Thread.sleep(4000);
        driver.quit();
    }
    @Test
    public void Ancestor() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.xpath("//td[normalize-space(text())='Yoshi Tannamuri']/ancestor::*"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('style','border : 3px solid green; background: red')",element);
        Thread.sleep(4000);
        driver.quit();
    }
    @Test
    public void Descendant() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.xpath("//td[normalize-space(text())='Yoshi Tannamuri']/descendant::*"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('style','border : 3px solid green; background: red')",element);
        Thread.sleep(4000);
        driver.quit();
    }
    @Test
    public void Ancestororself() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.xpath("//td[normalize-space(text())='Yoshi Tannamuri']/ancestor-or-self::*"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('style','border : 3px solid green; background: red')",element);
        Thread.sleep(4000);
        driver.quit();
    }
    @Test
    public void Descendantorself() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.xpath("//table[@id='contactList']/descendant-or-self::*"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('style','border : 3px solid green; background: red')",element);
        Thread.sleep(4000);
        driver.quit();
    }
}
