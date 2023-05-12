Feature: As a user (patient), I want to have a dashboard that belongs to me so that I can view my own information.

  Scenario: It should be possible to login to the dashboard by entering the information on the User Login page (previously registered to the system).
    Given Start browser , go to 'userLoginURL'
    And User fills 'patientFurkan' and 'passwordFurkan' textBoxes
    And User clicks sign in button
    Then Browser  closed