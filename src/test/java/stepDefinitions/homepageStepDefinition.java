package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.PageHomepage;
import utilities.Driver;

public class homepageStepDefinition {

    PageHomepage homepage= new PageHomepage();
    WebDriver driver= Driver.getDriver();

    @Given("Start browser, go to {string}")
    public void start_browser_go_to(String url) {
        homepage.goToUrl(url);
    }
    @Given("It is verified that the URL of the page the user went to contains {string}")
    public void ıt_is_verified_that_the_url_of_the_page_the_user_went_to_contains(String string) {
        homepage.urlQuery(string, driver.getCurrentUrl());
    }
    @Then("Browser closed")
    public void browser_closed() {

        driver.close();
    }

    @And("Verify that the Site logo is visible at the URL to go")
    public void verifyThatTheSiteLogoIsVisibleAtTheURLToGo() {
        homepage.elementIsDisplayed(homepage.logoHospitalSite);
    }



    @And("Verified that the Latest News heading at the top of the Homepage is visible")
    public void verifiedThatTheLatestNewsHeadingAtTheTopOfTheHomepageIsVisible() {
        homepage.elementIsDisplayed(homepage.sliderLastestNews);
    }

    @And("The visibility of the site logo and menu titles in the User Homepage top bar is verified")
    public void theVisibilityOfTheSiteLogoAndMenuTitlesInTheUserHomepageTopBarIsVerified() {
        homepage.elementIsDisplayed(homepage.buttonsNavbarElements);
    }

    @And("It should be correct that when you click on the homelink, it redirects to the homepage")
    public void itShouldBeCorrectThatWhenYouClickOnTheHomelinkItRedirectsToTheHomepage() {
        homepage.buttonHomeLink.click();
        homepage.urlQuery("heallifehospital", driver.getCurrentUrl());
    }

    @And("When the user clicks on the menu titles in the top bar of the site, it is verified that he or she is directed to the correct pages.")
    public void whenTheUserClicksOnTheMenuTitlesInTheTopBarOfTheSiteItIsVerifiedThatHeOrSheIsDirectedToTheCorrectPages() {

        homepage.clickAndUrlQuery(homepage.buttonHomeLink,"frontend",Driver.getDriver().getCurrentUrl());
        homepage.clickAndUrlQuery(homepage.linkAppointmentPage,"appointment",Driver.getDriver().getCurrentUrl());
        homepage.clickAndUrlQuery(homepage.linkGalleryPage,"gallery",Driver.getDriver().getCurrentUrl());
        homepage.clickAndUrlQuery(homepage.linkContactusPage,"contact-us",Driver.getDriver().getCurrentUrl());


    }
}
