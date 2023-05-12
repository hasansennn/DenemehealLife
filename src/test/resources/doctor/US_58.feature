Feature: US_058 As a doctor, I want to view my patients' appointments from the Appointment page on the Dashboard Sidebar.



  Scenario: TC_001 Clicking on the Appointment link in the Dashboard Sidebar should redirect to the relevant page.

    Given Start browser  go to "string"
    Then User fill "string" and "string" textBoxes
    Then Click the Appointment link in the Dashboard Sidebar
