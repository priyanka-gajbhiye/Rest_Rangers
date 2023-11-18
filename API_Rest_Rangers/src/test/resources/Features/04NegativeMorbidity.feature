Feature: Negative Scenario Morbidity Check

  Scenario: Check if user is able to get all Morbidity without token
    Given User creates GET request for all morbidty without token
    When User sends HTTPS request for all morbidty
    Then User receives 401 unauthorized status code for all morbidty

  Scenario: Check if user is able to get Morbidity Name without token
    Given User creates GET request for morbidity Name without token
    When User sends HTTPS request for morbidity Name
    Then User receives 401 unauthorized status code for morbidity Name

  Scenario: Get morbidity condition by partial morbidity Name
    Given User creates GET request by partial morbidity Name
    When User sends HTTPS request by partial morbidity Name
    Then User receives 200 Not Found status code by partial morbidity Name

  Scenario: Get morbidity condition by invalid morbidity name
    Given User creates GET request by invalid morbidity Name
    When User sends HTTPS request by invalid morbidity Name
    Then User receives 404 Not Found status code by invalid morbidity name
