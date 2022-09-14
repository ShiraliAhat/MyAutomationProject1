package com.globalRelay.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {
    @Given("user is on the landing page")
    public void user_is_on_the_landing_page() {
        System.out.println("user on the landing page");
    }
    @When("user enters credentials")
    public void user_enters_credentials() {
        System.out.println("ser enters credentials");
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        System.out.println("user clicks on login button");
    }
    @Then("user should see welcome message")
    public void user_should_see_welcome_message() {
        System.out.println("user should see welcome message");
    }

}
