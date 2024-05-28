package FrameworkConcepts.PageFactory.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    @FindBy(how = How.XPATH,using = "//input[@placeholder='Enter First Name']")
    private WebElement firstname;
    @FindBy(how = How.XPATH,using = "//input[@placeholder='Enter Last Name']")
    private WebElement lastname;
    public  void sendFirstname(String keys){
        firstname.sendKeys(keys);
    }
    public void setLastname(String last){
        lastname.sendKeys(last);
    }
}
