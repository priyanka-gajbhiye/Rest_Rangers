Feature: Negative Patient Controller Check

  Scenario: Create Patient with duplicate data
    Given User creates POST request with duplicate data
    When User sends HTTPS request with duplicate data
    Then User receives 400 status code for duplicate data
    
    