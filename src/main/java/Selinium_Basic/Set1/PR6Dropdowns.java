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
    public void Test1() throws InterruptedException {
        //single Dropdown
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        driver.manage().window().maximize();
        WebElement dropdown=driver.findElement(By.xpath("//select[@id=\"course\"]"));
        Select select=new Select(dropdown);
        List<WebElement> dropvalues=select.getOptions();
        for (WebElement j:dropvalues){
            System.out.println(j.getText());
        }
        select.selectByIndex(1);
        select.selectByValue("python");
        select.selectByVisibleText("Javascript");
        Thread.sleep(4000);
        driver.quit();
    }
    @Test
    public void MultiselectDropdown() throws InterruptedException {
        //Multi select dropdown
      WebDriver driver=new ChromeDriver();
      driver.navigate().to("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
      driver.manage().window().maximize();
      WebElement multiselect=driver.findElement(By.id("ide"));
      Select select=new Select(multiselect);
      select.selectByIndex(0);
      select.selectByValue("ij");
      select.selectByVisibleText("Visual Studio");
      List<WebElement> list=select.getOptions();
        System.out.println("List of elements present on UI : ");
        for (WebElement ele:list){
            System.out.println(ele.getText());
        }
        List<WebElement> list2=select.getAllSelectedOptions();
        System.out.println("List of selected elements present on UI : ");
        for (WebElement ele:list2){
            System.out.println(ele.getText());
        }
        System.out.println(select.getFirstSelectedOption());
        select.deselectByIndex(0);
        select.deselectByValue("ij");
        select.deselectByVisibleText("Visual Studio");
        select.selectByIndex(0);
        select.selectByValue("ij");
        select.selectByVisibleText("Visual Studio");
        select.deselectAll();
        Thread.sleep(4000);
        driver.quit();
    }
}
