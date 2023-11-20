Feature: User LogOut Check

  Scenario: Check if user is able to Logout with token and valid endpoint
    Given User creates GET request for logout with token and valid endpoint
    When User sends HTTPS request with token and valid endpoint
    Then User receives 200 statuscode for token and valid endpoint
