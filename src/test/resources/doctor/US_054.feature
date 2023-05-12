Feature: I want to access a panel in the hospital system where I can conduct procedures related to my patients as a doctor.

  Scenario: Doctors should be able to log in to the doctor panel by entering their (previously registered) information on the login page.
    Given Start browser , go  to 'doctorLoginURL'
    And User fills  'doctorFurkan' and 'passwordFurkan' textBoxes
    And User clicks sign in  button
    Then Browser Closed