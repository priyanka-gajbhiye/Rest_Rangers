Feature: Negative Patient Controller Delete Check

  Scenario: Delete Patient with Invalid Endpoint
    Given User creates DELETE request with Invalid Endpoint
    When User sends request with Invalid Endpoint
    Then User receives 404 status code for Invalid Endpoint

  Scenario: Delete Patient with Invalid patientID
    Given User creates DELETE request with Invalid pantientID
    When User sends HTTPS request with Invalid pantientID
    Then User receives 404 status code for Invalid pantientID

  Scenario: Delete Patient without token
    Given User creates DELETE request without token
    When User sends delete HTTPS request without token
    Then User receives 401 status code for without token
