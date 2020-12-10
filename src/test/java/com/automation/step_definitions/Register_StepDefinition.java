package com.automation.step_definitions;

import com.automation.page.RegisterPage;
import com.automation.utilities.BrowserUtils;
import com.automation.utilities.ConfigurationReader;
import com.automation.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class Register_StepDefinition {

RegisterPage registerPage=new RegisterPage();

    @Given("User is on main page")
    public void user_is_on_main_page() {
        String URL = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(URL);
        System.out.println("Open " + URL);
    }

    @When("User clicks on  create account on the top right")
    public void user_clicks_on_create_account_on_the_top_right() {
        registerPage.clickToCreateAccount();
    }
    @When("Enters user information")
    public void enters_user_information() {

registerPage.setEmail("rux@gmail.com");
registerPage.setFirstName("Raksana");
registerPage.setLastName("Olimova");
registerPage.setPassword("Crowed87@");
registerPage.setPhone("3473456778");

registerPage.setAddress("rudaki 50");

registerPage.setCity("Houston");
BrowserUtils.wait(5);
registerPage.setState();

//registerPage.setZipcode("77099");
BrowserUtils.wait(5);


    }

}
