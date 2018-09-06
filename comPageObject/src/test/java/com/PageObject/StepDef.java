package com.PageObject;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class StepDef extends DriverManager {

    LoginStepDef ls = new LoginStepDef();

    @Given("^User is in Home Page$")
    public void user_is_in_Home_Page() {

        ls.homePage();
    }

//    @When("^User select the Login link$")
//    public void user_select_the_Login_link() {
//
//        ls.loginLink();
//    }

    @When("^User enter email and password$")
    public void user_enter_email_and_password() {

        ls.userCredentials();

    }

    @When("^User click Login button$")
    public void user_click_Login_button() {

        ls.loginButton();

    }

    @Then("^User enter welcome screen$")
    public void user_enter_welcome_screen() {

        ls.welcomeScreen();
    }

    @Given("^User enter Invalid email and password$")
    public void user_enter_Invalid_email_and_password() {

        ls.invalidCredentials();
    }

    @Then("^User getting error message$")
    public void user_getting_error_message() {

        ls.errorMessage();
    }


}
