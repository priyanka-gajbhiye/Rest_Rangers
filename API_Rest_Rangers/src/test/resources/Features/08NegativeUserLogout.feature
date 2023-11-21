Feature: Negative Scenario User LogOut Check

  Scenario: Check if user is able to Logout with Invalid Endpoint
    Given User creates GET request for logout with Invalid Endpoint
    When User sends HTTPS request with Invalid Endpoint
    Then User receives 401 statuscode with Method Not Allowed

  Scenario: Check if user is able to Logout without token
    Given User creates GET request for logout without token
    When User sends HTTPS request without token
    Then User receives 401 statuscode for without token
