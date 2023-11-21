package api.StepDefinition;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

import java.io.IOException;

import api.CRUDrequest.PatientRoleRequest;
import api.CRUDrequest.UserLoginRequest;
import api.requestbodyActions.PatientRoleBody;
import api.requestbodyActions.UserLoginBody;
import api.utilities.RestUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PatientRoleSD extends RestUtils{
	
	@Given("User creates POST request for Parient role")
	public void user_creates_POST_request_for_Parient_role() {
		String BaseURI = url_endpoints.getString("BaseUrl");
		baseURI = BaseURI;
		log.info("***User sends request with BaseURL***");	
	}

	@When("User sends HTTPS request and request body for patient role")
	public void user_sends_HTTPS_request_and_request_body_for_patient_role() throws IOException {
		PatientRoleRequest.PatientPostRequest(PatientRoleBody.PatientPostBody());
	
		UserLoginPOJO.setPatienttoken(response.path("patienttoken"));
		System.out.println("Login Token"+ UserLoginPOJO.getPatienttoken());

		log.info("****Patient Role login is created with Bearer Token****");
	}

	@Then("User receives {int} created status for patient role")
	public void user_receives_created_status_for_patient_role(Integer statuscode) {
		if (statuscode == 200) {

			response.then().assertThat()
			.statusCode(statuscode)
			.body(matchesJsonSchema(userLoginjson))
			.log().all();
			
				log.info("User Login created successfully with status code " + response.getStatusCode()) ;
				log.info("User Login Response body" +response.getBody().asString());


			} else {
			log.info("Request failed");
				log.error("400 bad Request");
			}
	}

	@Given("User creates GET request for patient Role by patientID")
	public void user_creates_GET_request_for_patient_Role_by_patientID() {
		log.info("***GET request for Patient Role***");
		
	}

	@When("user sends request for patient Role by patient ID")
	public void user_sends_request_for_patient_Role_by_patient_ID() {
		PatientRoleRequest.GetRequest();
	}

	@Then("user receives {int} status code and response body for patient Role")
	public void user_receives_status_code_and_response_body_for_patient_Role(Integer statuscode) {
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

	@Given("User creates GET request for patient Role Get morbidity by fileID")
	public void user_creates_GET_request_for_patient_Role_Get_morbidity_by_fileID() {
		log.info("***GET request for Patient Role by fileID***");
		
	}

	@When("user sends Https request for patient Role and request body by fileID")
	public void user_sends_Https_request_for_patient_Role_and_request_body_by_fileID() {
		PatientRoleRequest.GetRequestfileID();
	}

	@Then("User receives {int} status code and response body by fileID for patient Role")
	public void user_receives_status_code_and_response_body_by_fileID_for_patient_Role(Integer statuscode) {
		
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
