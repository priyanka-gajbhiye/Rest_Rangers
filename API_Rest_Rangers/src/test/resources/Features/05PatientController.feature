Feature: Patient Controller Check

  Scenario: Create Patient
    Given User creates POST request for New Patient
    When User sends HTTPS request for New Patient
    Then User receives 201 status code for New Patient

  Scenario: Update Patient
    Given User creates PUT request for update Patient
    When User sends HTTPS request for update Patient
    Then User receives 200 status code for update Patient
