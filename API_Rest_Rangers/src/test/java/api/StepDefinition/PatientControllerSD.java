package api.StepDefinition;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

import java.io.IOException;

import api.CRUDrequest.PatientControllerRequest;

import api.utilities.RestUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PatientControllerSD extends RestUtils{
	
	@Given("User creates GET request for all patient")
	public void user_creates_GET_request_for_all_patient() {
		log.info("***User  sends GET request for all Patient***");	
		
	}

	@When("User sends request for all Patient")
	public void user_sends_request_for_all_Patient() {
		PatientControllerRequest.GetAllPatient();
	}

	@Then("User receives {int} status code for all Patient")
	public void user_receives_status_code_for_all_Patient(Integer statuscode) {
		
		if (statuscode == 200) {

			response.then().assertThat()
			.statusCode(statuscode)
			//.body(matchesJsonSchema(Patientjson))
			.log().all();
			
				log.info("Patient updated successfully with status code " + response.getStatusCode()) ;
				//log.info("Patient updated Response body" +response.getBody().asString());


			} else {
			log.info("Request failed");
				log.error("400 bad Request");
			} 
	    
	}


	@Given("User creates POST request for New Patient")
	public void user_creates_POST_request_for_New_Patient() {
		log.info("***User  sends POST request for New Patient***");	
	
	}

	@When("User sends HTTPS request for New Patient")
	public void user_sends_HTTPS_request_for_New_Patient() throws IOException {
		PatientControllerRequest.PostRequest();
		UserLoginPOJO.setPatientId(response.path("patientId"));
		UserLoginPOJO.setFileId(response.path("fileId"));
	
		System.out.println("New PatientID"+UserLoginPOJO.getPatientId());
		System.out.println("New FileID"+UserLoginPOJO.getFileId());
		
	}

	@Then("User receives {int} status code for New Patient")
	public void user_receives_status_code_for_New_Patient(Integer statuscode) {
		if (statuscode == 201) {

			response.then().assertThat()
			.statusCode(statuscode)
			.body(matchesJsonSchema(Patientjson))
			.log().all();
			
				log.info("New Patient created successfully with status code " + response.getStatusCode()) ;
				log.info("New Patient Response body" +response.getBody().asString());


			} else {
			log.info("Request failed");
				log.error("400 bad Request");
			}
		}
	

@Given("User creates PUT request for update Patient")
public void user_creates_PUT_request_for_update_Patient() {
	log.info("***User sends PUT request for update Patient***");	
	
}

@When("User sends HTTPS request for update Patient")
public void user_sends_HTTPS_request_for_update_Patient() {
	PatientControllerRequest.PutRequest();
	
	
   
}

@Then("User receives {int} status code for update Patient")
public void user_receives_status_code_for_update_Patient(Integer statuscode) {
	if (statuscode == 200) {

		response.then().assertThat()
		.statusCode(statuscode)
		.body(matchesJsonSchema(Patientjson))
		.log().all();
		
			log.info("Patient updated successfully with status code " + response.getStatusCode()) ;
			//log.info("Patient updated Response body" +response.getBody().asString());


		} else {
		log.info("Request failed");
			log.error("400 bad Request");
		} 
}
@Given("User creates GET request for patient morbidity by patientID")
public void user_creates_GET_request_for_patient_morbidity_by_patientID() {
	log.info("***User  sends GET request for patient by patientID***");	
	
}

@When("user sends request for patient morbidity and request body by patient ID")
public void user_sends_request_for_patient_morbidity_and_request_body_by_patient_ID() {
	PatientControllerRequest.GetRequest();
	
}

@Then("User receives {int} status code and response body for morbidity for patient")
public void user_receives_status_code_and_response_body_for_morbidity_for_patient(Integer statuscode) {
	if (statuscode == 200) {

		response.then().assertThat()
		.statusCode(statuscode)
		.body(matchesJsonSchema(MorbiditySchema))
		.log().all();
		
			log.info("Patient response for Morbidity by patientID " + response.getStatusCode()) ;
			//log.info("Patient Response for Morbidity" +response.getBody().asString());


		} else {
		log.info("Request failed");
			log.error("400 bad Request");
		} 
}


@Given("User creates GET request for patient Get morbidity by fileID")
public void user_creates_GET_request_for_patient_Get_morbidity_by_fileID() {
	log.info("***User sends GET request by fileID***");	
	
}

@When("user sends Https request for patient and request body by fileID")
public void user_sends_Https_request_for_patient_and_request_body_by_fileID() {
	PatientControllerRequest.GetRequestfileID();
	
}

@Then("User receives {int} status code and response body by fileID")
public void user_receives_status_code_and_response_body_by_fileID(Integer statuscode) {
	if (statuscode == 200) {

		response.then().assertThat()
		.statusCode(statuscode)
		//.body(matchesJsonSchema(MorbiditySchema))
		.log().all();
		
			log.info("Patient response for Morbidity by patientID " + response.getStatusCode()) ;
			//log.info("Patient Response for Morbidity" +response.getBody().asString());


		} else {
		log.info("Request failed");
			log.error("400 bad Request");
		} 

}




}
