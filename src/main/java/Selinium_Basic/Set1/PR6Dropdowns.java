package Selinium_Basic.Set1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class PR6Dropdowns {
    @Test
    public void Test1(){
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        driver.manage().window().maximize();
        WebElement dropdown=driver.findElement(By.xpath("//select[@id=\"course\"]"));
        Select select=new Select(dropdown);
        List<WebElement> drop=select.getOptions();
        for (WebElement j:drop){
            System.out.println(j.getText());
        }
    }
}
