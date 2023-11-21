Feature: Patient Role Check

  Scenario: Check if Patient role
    Given User creates POST request for Parient role
    When User sends HTTPS request and request body for patient role
    Then User receives 200 created status for patient role

  Scenario: GET Request for Patient Role by patient ID
    Given User creates GET request for patient Role by patientID
    When user sends request for patient Role by patient ID
    Then user receives 200 status code and response body for patient Role

  Scenario: GET Request for patient Role by file ID
    Given User creates GET request for patient Role Get morbidity by fileID
    When user sends Https request for patient Role and request body by fileID
    Then User receives 200 status code and response body by fileID for patient Role
