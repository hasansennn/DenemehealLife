Feature: US_036 As an administrator (admin), I want to have a navbar in the admin panel to manage the admin panel more easily.

    Background:
    Given Start browser  go to 'adminLoginURL'
    And User fill 'adminHasan' and 'passwordHasan' textBoxes
    And User click sign in button

  @navbar1
  Scenario: TC_001 There should be a site logo in the navbar of the admin panel and when clicked,
            the admin panel should refresh its home page.

    When Visibility of site log is tested in navbar
    And  Site logo clicked
    And  It is tested that the admin panel page is renewed
    Then Browser   closed

  @navbar2
  Scenario:TC_002 There should be a menu icon in the navbar and when you click it,
           the dashboard menu should open and close.

    When The visibility of the menu icon in the navbar is tested
    And  Menu icon is clicked
    Then Heallife image clicked
    And  It is tested whether the Dashboard menu is opened and closed.
    Then Browser   closed

  @navbar3
Scenario: TC_003 There should be the text "Heal Life Hospital & Research Center" in the navbar.

    When Visibility of text Heal Life Hospital & Research Center is tested in Navbar
    And Browser Closed

 @navbar4
 Scenario: TC_004 In order to easily access patient information within the panel,
            there should be a "Search By Patient Name" search box in the navbar.

    Then The visibility of the Search By Patient Name search box is tested
    And  Browser Closed




