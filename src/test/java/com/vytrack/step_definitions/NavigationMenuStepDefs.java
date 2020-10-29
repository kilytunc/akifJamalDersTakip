package com.vytrack.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationMenuStepDefs {
    @Given("User is loged to the system in any page")
    public void user_is_loged_to_the_system_in_any_page() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("User is loged to the system in any page");
    }

    @When("User hover to ° Fleet ° Menu")
    public void user_hover_to_Fleet_Menu() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("User hover to ° Fleet ° Menu");
    }

    @When("press to Vehicles selection")
    public void press_to_Vehicles_selection() {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
        System.out.println("press to Vehicles selection");
    }

    @Then("The new pages title should be    Vehicles  <--")
    public void the_new_pages_title_should_be_Vehicles() {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
        System.out.println("The new pages title should be    Vehicles  <--");
    }

    @When("User hover to ** Marketing ** Menu")
    public void user_hover_to_Marketing_Menu() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("User hover to ** Marketing ** Menu");
    }

    @When("press to Campaigns selection")
    public void press_to_Campaigns_selection() {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
        System.out.println("press to Campaigns selection");
    }

    @Then("The new pages title should be    Campaigns  <--")
    public void the_new_pages_title_should_be_Campaigns() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("The new pages title should be    Campaigns  <--");
    }

    @When("User hover to ** Activities ** Menu  ANNNDD press to Calendar Events...")
    public void user_hover_to_Activities_Menu_ANNNDD_press_to_Calendar_Events() {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
        System.out.println("User hover to ** Activities ** Menu  ANNNDD press to Calendar Events...");
    }

    @Then("The new pages title should be    Calendars  <--")
    public void the_new_pages_title_should_be_Calendars() {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
        System.out.println("The new pages title should be    Calendars  <--");
    }

}
