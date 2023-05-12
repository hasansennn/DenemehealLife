package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.PageAdminDashboard;
import pages.PageDoctorDashboard;
import pages.PageHomepage;
import pages.PageLogin;
import utilities.Driver;

public class adminDashboardStepDefinition {
    PageLogin pageLogin=new PageLogin();
    PageHomepage homepage=new PageHomepage();

    PageAdminDashboard pageAdminDashboard=new PageAdminDashboard();
    WebDriver driver= Driver.getDriver();

    @Given("Start browser , go  to {string}")
    public void start_browser_go_to(String string) {
        homepage.goToUrl(string);
    }
    @Given("User fills  {string} and {string} textBoxes")
    public void user_fills_and_text_boxes(String string, String string2) {
        pageLogin.adminLoginMethod(string,string2);
    }
    @Given("User clicks sign in  button")
    public void user_clicks_sign_in_button() {
        homepage.clickAndUrlQuery(pageLogin.buttonSignInAdminLoginPage,"admin/dashboard",Driver.getDriver().getCurrentUrl());
    }
    @When("Visibility of site log is tested in navbar")
    public void visibility_of_site_log_is_tested_in_navbar() {
        homepage.elementIsDisplayed(pageAdminDashboard.logoHealLife);
    }
    @When("Site logo clicked")
    public void site_logo_clicked() {
        pageAdminDashboard.logoHealLife.click();
    }
    @When("It is tested that the admin panel page is renewed")
    public void it_is_tested_that_the_admin_panel_page_is_renewed() {
        homepage.elementIsEnabled(pageAdminDashboard.logoHealLife);
    }
    @Then("Browser Closed")
    public void browser_closed() {
        driver.close();
    }
    @When("The visibility of the menu icon in the navbar is tested")
    public void theVisibilityOfTheMenuIconInTheNavbarIsTested() {
        homepage.elementIsEnabled(pageAdminDashboard.buttonMenu);
    }
    @And("Menu icon is clicked")
    public void menuIconIsClicked() {
        pageAdminDashboard.buttonMenu.click();
    }
    @Then("Heallife image clicked")
    public void heallifeImageClicked() {
      pageAdminDashboard.imageMenu.click();
    }
    @And("It is tested whether the Dashboard menu is opened and closed.")
    public void itIsTestedWhetherTheDashboardMenuIsOpenedAndClosed() {
        homepage.elementIsEnabled(pageAdminDashboard.imageMenu);

    }

    @When("Visibility of text Heal Life Hospital & Research Center is tested in Navbar")
    public void visibilityOfTextHealLifeHospitalResearchCenterIsTestedInNavbar() {
        String expectedText="Heal Life Hospital & Research Center";
        String actualText=pageAdminDashboard.textBoxHeallife.getText();
        Assert.assertEquals(actualText,expectedText);
    }
    @Given("The visibility of the Search By Patient Name search box is tested")
    public void the_visibility_of_the_search_by_patient_name_search_box_is_tested() {
        homepage.elementIsEnabled(pageAdminDashboard.iconSearch);
    }

    }


