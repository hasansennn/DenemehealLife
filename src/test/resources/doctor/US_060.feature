Feature: As a doctor, I want to list and manage IPD patients' data from the IPD page on the Dashboard Sidebar.

  Scenario: Doctors should be able to log in to the doctor panel by entering their (previously registered) information on the login page.
    Given Start browser , go to "doctorLoginURL"
    Then User fill "doctorAhmet" and "passwordAhmet" textBoxes
    And User click sign in button
    Then Browser  closed
