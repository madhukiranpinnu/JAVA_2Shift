package FrameworkConcepts.PageFactory.Tests;

import FrameworkConcepts.PageFactory.DriverSetup.DriverSetupDemo;
import FrameworkConcepts.PageFactory.Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginTest {
    @Test
    public void LoginTest(){
        WebDriver driver= DriverSetupDemo.initialize();
        LoginPage loginPage= PageFactory.initElements(driver, LoginPage.class);
        driver.navigate().to("https://www.hyrtutorials.com/p/basic-controls.html");
        loginPage.sendFirstname("mkmk");
        loginPage.setLastname("pinnu");
        driver.quit();
    }
}
