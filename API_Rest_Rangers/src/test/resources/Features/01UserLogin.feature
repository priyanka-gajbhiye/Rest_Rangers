Feature: User Login Check

  Scenario: Check if user is able to Login with valid endpoints and request body
    Given: User creates POST request for login
    When User sends HTTPS request and request body with mandatory additional fields
    Then User receives 200 created status with token in response body 

    