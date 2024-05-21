package CucumberPractice.BasicFolder;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Pragram1 {

    @Given("On the Testing home page")
    public void on_the_testing_home_page() {
        System.out.println("On home page");
    }
    @When("I had entered userID")
    public void i_had_entered_user_id() {
        System.out.println("Entered UserID");
    }
    @When("I had entered password")
    public void i_had_entered_password() {
        System.out.println("Entered Password");
    }
    @When("I clicked on button")
    public void i_clicked_on_button() {
        System.out.println("Clicked on button");
    }
    @Then("I check logged in successfully")
    public void i_check_logged_in_successfully() {
        System.out.println("Logged in successfully");
    }

    @Then("I check logged in Failed")
    public void i_check_logged_in_failed() {
        System.out.println("I check logged in failed");
    }

    @Then("I check blank page")
    public void i_check_blank_page() {
        System.out.println("It's Blank page");
    }
    @Given("I had on login page")
    public void i_had_on_login_page() {
        System.out.println("On Logged in page ");
    }
    @When("^I had enter the userid (.+)$")
    public void i_had_enter_the_userid(String user) {
        System.out.println(user);
    }
    @When("^I had enter the password (.+)$")
    public void i_had_enter_the_password(String pass) {
        System.out.println(pass);
    }

}
