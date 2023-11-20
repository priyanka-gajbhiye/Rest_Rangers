Feature: Patient Controller Delete Check

  Scenario: Delete Patient
    Given User creates DELETE request for Patient
    When User sends HTTPS request for Patient
    Then User receives 200 status code for Patient
