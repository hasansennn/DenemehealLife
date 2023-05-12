Feature: US_001 As a user, I must be able to access the website in order to use the site.

  Scenario: TC_001 The website must be accessible from the browser by the user (the given URL)
    Given Start browser, go to "homepageURL"
    And It is verified that the URL of the page the user went to contains 'heallifehospital'
    Then Browser closed

  Scenario: TC_002  The home page must be visible when accessing the website
    Given Start browser, go to "homepageURL"
    And Verify that the Site logo is visible at the URL to go
    Then Browser closed
