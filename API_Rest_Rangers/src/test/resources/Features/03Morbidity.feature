Feature: Morbidity Controller

  Scenario: Get all morbidities
    Given User creates GET request for all morbidities
    When User sends HTTPS request for all morbidities
    Then User receives 200 status code and response body for all morbidities

  Scenario: Get morbidity condition by morbidity name
    Given User creates GET request by morbidity Name
    When User sends HTTPS request and request body by morbidity name
    Then User receives 200 status code and response body by morbidity name
