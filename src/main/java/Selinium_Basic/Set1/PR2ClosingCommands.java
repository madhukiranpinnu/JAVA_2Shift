package Selinium_Basic.Set1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PR2ClosingCommands {
    @Test
    public void Test2() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.dummysoftware.com/popupdummy_testpage.html");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@value=\"Safe New Window\"]")).click();
        //close current single window
        driver.close();
        Thread.sleep(5000);
        //closes all open windows
        driver.quit();
    }
}
