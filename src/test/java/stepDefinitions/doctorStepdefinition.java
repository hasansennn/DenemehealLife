package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.PageHomepage;
import pages.PageLogin;
import utilities.Driver;

public class doctorStepdefinition {
    WebDriver driver= Driver.getDriver();
    PageHomepage homepage=new PageHomepage();
    PageLogin pageLogin=new PageLogin();


    @Given("Start browser  go to {string}")
    public void start_browser_go_to(String string) {
        homepage.goToUrl(string);

    }
    @Given("User fill {string} and {string} textBoxes")
    public void user_fill_and_text_boxes(String username, String password) {
        pageLogin.doctorLoginMethod(username,password);
    }
    @Given("User click sign in button")
    public void user_click_sign_in_button() {

        homepage.clickAndUrlQuery(pageLogin.buttonSignInDoctorLoginPage,"admin/dashboard",Driver.getDriver().getCurrentUrl());
    }
    @Then("Browser   closed")
    public void browser_closed() {
        driver.close();


    }
}
