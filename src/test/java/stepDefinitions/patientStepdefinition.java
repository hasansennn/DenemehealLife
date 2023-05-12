package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.PageHomepage;
import pages.PageLogin;
import utilities.Driver;

public class patientStepdefinition {
    PageLogin pageLogin=new PageLogin();
    PageHomepage homepage=new PageHomepage();

    @Given("Start browser , go to {string}")
    public void start_browser_go_to(String string) {
        homepage.goToUrl(string);
    }
    @Given("User fills {string} and {string} textBoxes")
    public void user_fills_and_text_boxes(String string, String string2) {
        pageLogin.userLoginMethod(string,string2);
    }
    @Given("User clicks sign in button")
    public void user_clicks_sign_in_button() {
        homepage.clickAndUrlQuery(pageLogin.buttonSignIn,"patient", Driver.getDriver().getCurrentUrl());

    }
    @Then("Browser  closed")
    public void browser_closed() {
        Driver.closeDriver();

    }
}
