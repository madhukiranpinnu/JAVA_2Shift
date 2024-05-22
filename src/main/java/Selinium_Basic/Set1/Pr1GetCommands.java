package Selinium_Basic.Set1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Pr1GetCommands {
    @Test
    public void Test1() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        //Get method will navigate to the URL specified
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        //to get the current URL
        System.out.println(driver.getCurrentUrl());
        //to fetch the title of the page
        System.out.println(driver.getTitle());
        //to get the text of the element
        Thread.sleep(5000);
        System.out.println(driver.findElement(By.xpath("//h5[contains(@class,\"orangehrm-login-title\")]")).getText());
    }
}
