Feature: Patient Controller Check

  Scenario: GET all Patients
    Given User creates GET request for all patient
    When User sends request for all Patient
    Then User receives 200 status code for all Patient

  Scenario: Create Patient
    Given User creates POST request for New Patient
    When User sends HTTPS request for New Patient
    Then User receives 201 status code for New Patient

  Scenario: Update Patient
    Given User creates PUT request for update Patient
    When User sends HTTPS request for update Patient
    Then User receives 200 status code for update Patient

  Scenario: GET Request for Morbidity by patient ID
    Given User creates GET request for patient morbidity by patientID
    When user sends request for patient morbidity and request body by patient ID
    Then User receives 200 status code and response body for morbidity for patient

  Scenario: GET Request for patient by file ID
    Given User creates GET request for patient Get morbidity by fileID
    When user sends Https request for patient and request body by fileID
    Then User receives 200 status code and response body by fileID
