package Selinium_Basic.Set1;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class PR5Actionclass {
    @Test
    public void Test1(){
        //To Hover on the element
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.sliderrevolution.com/documentation/mouse-hover-settings/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Actions actions=new Actions(driver);
        WebElement element= driver.findElement(By.xpath("//ul[@id=\"primary-menu\"]/li/a[text()='Features' and contains(@href,\"sliderrevolution\")]"));
        actions.moveToElement(element).perform();
        driver.quit();
    }
    @Test
    public void Test2() throws InterruptedException {
        //Right click
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions actions=new Actions(driver);
        actions.contextClick(element).perform();
        Thread.sleep(4000);
        driver.quit();
    }
    @Test
    public void Test3() throws InterruptedException {
        //double click
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().window().maximize();
        WebElement element= driver.findElement(By.xpath("//button[text()=\"Double-Click Me To See Alert\"]"));
        Actions actions=new Actions(driver);
        actions.doubleClick(element).perform();
        Thread.sleep(4000);
        driver.quit();
    }
    @Test
    public void Test4() throws InterruptedException {
        //drag and drop
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        WebElement element1= driver.findElement(By.xpath("//div[text()='Oslo' and @class='dragableBox' and @dragableelement and contains(@style,'position')]"));
        WebElement element2= driver.findElement(By.xpath("//div[@class=\"dragableBoxRight\" and contains(text(),'Norway') and @id=\"box101\"]"));
        Actions actions=new Actions(driver);
        Thread.sleep(6000);
        actions.moveToElement(element1).clickAndHold(element1).moveToElement(element2).release().build().perform();
        Thread.sleep(5000);
        driver.quit();
    }
    @Test
    public void Test5() throws InterruptedException {
        //drag and drop
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        WebElement element1= driver.findElement(By.xpath("//div[text()='Oslo' and @class='dragableBox' and @dragableelement and contains(@style,'position')]"));
        WebElement element2= driver.findElement(By.xpath("//div[@class=\"dragableBoxRight\" and contains(text(),'Norway') and @id=\"box101\"]"));
        Actions actions=new Actions(driver);
        Thread.sleep(6000);
        actions.dragAndDrop(element1,element2).perform();
        Thread.sleep(5000);
        driver.quit();
    }
    @Test
    public void Test6() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebElement element=driver.findElement(By.xpath("//input[@name=\"username\"]"));
        Actions actions=new Actions(driver);
        Thread.sleep(5000);
        element.click();
        actions.keyDown(Keys.SHIFT).sendKeys("a").build().perform();
        Thread.sleep(4000);
        driver.quit();
    }
}
