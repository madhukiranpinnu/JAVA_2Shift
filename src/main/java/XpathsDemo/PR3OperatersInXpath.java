package XpathsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PR3OperatersInXpath {
    //=
    //!= For Strings
    //<=
    //<
    //>=
    //> For Numericals
    @Test
    public void AttributesEqual(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.xpath("//div[@id =\"post-body-9023929218208337252\"]"));
        driver.quit();
    }
    @Test
    public void AttributesNotEqual(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.xpath("//div[@id !=\"post-body-9023929218208337252\"]"));
        driver.quit();
    }
    @Test
    public void AttributesLessthanEqual(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.xpath("//input[@maxlength<=10]"));
        driver.quit();
    }
    @Test
    public void AttributesLessthan(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.xpath("//input[@maxlength<15]"));
        driver.quit();
    }
    @Test
    public void AttributesGreaterthan(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.xpath("//input[@maxlength>14]"));
        driver.quit();
    }
    @Test
    public void AttributesGreaterthanEqual(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.xpath("//input[@maxlength>=10]"));
        driver.quit();
    }
}
