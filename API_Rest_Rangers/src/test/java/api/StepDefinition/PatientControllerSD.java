package api.StepDefinition;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

import java.io.IOException;

import api.CRUDrequest.PatientControllerRequest;

import api.utilities.RestUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PatientControllerSD extends RestUtils{

	@Given("User creates POST request for New Patient")
	public void user_creates_POST_request_for_New_Patient() {
		log.info("***User  sends POST request for New Patient***");	
	
	}

	@When("User sends HTTPS request for New Patient")
	public void user_sends_HTTPS_request_for_New_Patient() throws IOException {
		PatientControllerRequest.PostRequest();
		UserLoginPOJO.setPatientId(response.path("patientId"));
		System.out.println("New PatientID"+UserLoginPOJO.getPatientId());
		
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
	//UserLoginPOJO.setPatientId(response.path("patientId"));
	//System.out.println("New PatientID"+UserLoginPOJO.getPatientId());
	
   
}

@Then("User receives {int} status code for update Patient")
public void user_receives_status_code_for_update_Patient(Integer statuscode) {
	if (statuscode == 200) {

		response.then().assertThat()
		.statusCode(statuscode)
		.body(matchesJsonSchema(Patientjson))
		.log().all();
		
			log.info("Patient updated successfully with status code " + response.getStatusCode()) ;
			log.info("Patient updated Response body" +response.getBody().asString());


		} else {
		log.info("Request failed");
			log.error("400 bad Request");
		}
    
}



}
