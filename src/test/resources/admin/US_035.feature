Feature: As a user (patient), I want to have a dashboard that belongs to me so that I can view my own information.

  Scenario: It should be possible to login to the dashboard by entering the information on the User Login page (previously registered to the system).
    Given Start browser  go to 'adminLoginURL'
    And User fill 'adminFurkan' and 'passwordFurkan' textBoxes
    And User click sign in button
    Then Browser   closed