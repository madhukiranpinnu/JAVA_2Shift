package XpathsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PR4XpathConditions {
    @Test
    public void TestAnd(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.xpath("//input[@maxlength>=10 and @name=\"name\"]"));
        driver.quit();
    }
    @Test
    public void TestOR(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.xpath("//input[@maxlength>=10 or @name=\"name\"]"));
        driver.quit();
    }
    @Test
    public void TestNOT(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.xpath("//input[@maxlength>=10 or not(@name=\"name\"])"));
        driver.quit();
    }
}
