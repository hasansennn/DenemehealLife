Feature: US_002 As a user, I would like to have menu titles at the top of the Home Page to facilitate access to the site.

  Scenario: TC_001 Verify that Latest News information is visible as a scrolling text on the home page top bar.
    Given Start browser, go to 'homepageURL'
    And Verified that the Latest News heading at the top of the Homepage is visible
    Then Browser closed

  Scenario: TC_002 It should be verified that the site logo and menu titles (Home, Appointment, Events. About Us, Gallery, Contact Us) are visible on the main page top bar.
      Given Start browser, go to 'homepageURL'
      And The visibility of the site logo and menu titles in the User Homepage top bar is verified
      Then Browser closed

  Scenario: TC_003 When the site logo is clicked on the top bar of the home page, it should be verified that it refreshes the home page.
        Given Start browser, go to 'homepageURL'
        And It should be correct that when you click on the homelink, it redirects to the homepage
        Then Browser closed

  Scenario: TC_004 When the menu titles (Home, Appointment, Events. About Us, Gallery, Contact Us) are clicked on the main page top bar,
  it should be verified that they redirect to the relevant pages.
        Given Start browser, go to 'homepageURL'
        And When the user clicks on the menu titles in the top bar of the site, it is verified that he or she is directed to the correct pages.
        Then  Browser closed







