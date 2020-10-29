package com.vytrack.step_definitions;

import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;
import org.junit.Assert;

public class LoginStepDefs {
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {   // HERE THIS IS ACTING LIKE BEFORE METHOD: SETTING TO THE URL

        // System.out.println("oppening the browser and navigate to login page");    // first classes actions
        //throw new io.cucumber.java.PendingException();
        String url = ConfigurationReader.get("url");
        //WebDriver driver= Driver.get();
        Driver.get().get(url);
    }

    @When("the user enters the driver information")
    public void the_user_enters_the_driver_information() {
        // System.out.println("entering ...");                                       // first classes actions
        //throw new io.cucumber.java.PendingException();

        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        //System.out.println("i yemin ederim entered");
        // throw new io.cucumber.java.PendingException();
        BrowserUtils.waitFor(2);
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Dashboard", actualTitle);
    }

    @When("the user enters the sales manager information")
    public void the_user_enters_the_sales_manager_information() {
        // Write code here that turns the phrase above into concrete actions
        // System.out.println("sales manager info  ------------------------------");
        //throw new io.cucumber.java.PendingException();

        new LoginPage().login(ConfigurationReader.get("sales_manager_username"), ConfigurationReader.get("sales_manager_password"));
    }

    @When("the user enters the store manager information")
    public void the_user_enters_the_store_manager_information() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        // System.out.println("store manager info  ++++++++++++++++++++++++++++++");
        String username = ConfigurationReader.get("store_manager_username");
        String password = ConfigurationReader.get("store_manager_password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);
    }

    @When("the user logs in using {string} and {string}")
    public void the_user_logs_in_using_and(String username, String password) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        LoginPage loginPage=new LoginPage();
        loginPage.login(username,password);
    }

    @Then("the title contains {string}")
    public void the_title_contains(String expectedTitle) {
        BrowserUtils.waitFor(5);
        System.out.println("expectedTitle = " + expectedTitle);
        Assert.assertTrue(Driver.get().getTitle().contains(expectedTitle));
    }


    @When("the user navigates to {string} {string}")
    public void the_user_navigates_to(String tab, String module) {

        new DashboardPage().navigateToModule(tab,module);
       // Assert.assertTrue();

    }

    @Then("default page number should be {int}")
    public void default_page_number_should_be(Integer pageNum) {
        ContactsPage contactsPage= new ContactsPage();
        BrowserUtils.waitFor(3);
        Integer actualNum = Integer.parseInt(contactsPage.pageNumber.getAttribute("value"));
        Assert.assertEquals(pageNum,actualNum);

    }
    @When("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {
        Driver.get().get(ConfigurationReader.get("url"));
       //homework staff
        String username=null;
        String password=null;

        switch (userType){
            case "driver":
            username=ConfigurationReader.get("driver_username");
            password=ConfigurationReader.get("driver_password");
                break;

            case "sales_manager":
            username=ConfigurationReader.get("sales_manager_username");
            password=ConfigurationReader.get("sales_manager_password");
                break;

            case "store_manager":
                username=ConfigurationReader.get("store_manager_username");
                password=ConfigurationReader.get("store_manager_password");
                break;
        }

        new LoginPage().login(username,password);
       // BrowserUtils.waitFor(2);
    }




}