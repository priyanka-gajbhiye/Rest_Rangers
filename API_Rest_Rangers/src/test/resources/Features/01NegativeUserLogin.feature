Feature: Negative Scenario User Login Check

  Scenario: Check if user is able to Login with invalid URL, valid endpoints and correct body
    Given User creates POST request for login with invalid URL
    When User sends HTTPS request with request body with invalid URL
    Then User receives 404 Not Found status

  Scenario: Check if user is able to Login with Valid URL, invalid endpoints and correct body
    Given User creates POST request for login with incorrect endpoint
    When User sends HTTPS request with request body with incorrect endpoint
    Then User receives 404 unauthorized status for invalid endpoint

  Scenario: Check if user is able to Login with Valid URL, valid endpoints and incorrect body
    Given User creates POST request for login with incorrect body
    When User sends HTTPS request with incorrect request body
    Then User receives 401 unauthorized status for incorrect body
