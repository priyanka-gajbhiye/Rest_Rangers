package api.StepDefinition;

import api.CRUDrequest.PatientControllerRequest;
import api.utilities.RestUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NegativeDeletePatientSD extends RestUtils{
	@Given("User creates DELETE request with Invalid Endpoint")
	public void user_creates_DELETE_request_with_Invalid_Endpoint() {
		log.info("***Delete request for Patient with Invalid Endpoint***");
		
	}

	@When("User sends request with Invalid Endpoint")
	public void user_sends_request_with_Invalid_Endpoint() {
		PatientControllerRequest.DeleteRequestInvalidEndpoint();
	}

	@Then("User receives {int} status code for Invalid Endpoint")
	public void user_receives_status_code_for_Invalid_Endpoint(Integer statuscode) {
		if (statuscode == 404) {

			response.then().assertThat()
			.statusCode(statuscode)
			.log().all();
			
				log.info(" Patient Delete Unsuccessfull with status code " + response.getStatusCode()) ;
				//log.info("Patient Deleted Response body" +response.getBody().asString());


			} else {
			log.info("Request failed");
			
			}

	}

	@Given("User creates DELETE request with Invalid pantientID")
	public void user_creates_DELETE_request_with_Invalid_pantientID() {
		log.info("***Delete request for Patient with Invalid patientID***");
		
	}

	@When("User sends HTTPS request with Invalid pantientID")
	public void user_sends_HTTPS_request_with_Invalid_pantientID() {
		PatientControllerRequest.DeleteRequestInvalidPatientID();
	}

	@Then("User receives {int} status code for Invalid pantientID")
	public void user_receives_status_code_for_Invalid_pantientID(Integer statuscode) {
		if (statuscode == 404) {

			response.then().assertThat()
			.statusCode(statuscode)
			.log().all();
			
				log.info(" Patient Delete Unsuccessful with status code " + response.getStatusCode()) ;
				//log.info("Patient Delete Response body" +response.getBody().asString());


			} else {
			log.info("Request failed");
			
			}

	}
	

@Given("User creates DELETE request without token")
public void user_creates_DELETE_request_without_token() {
	log.info("***Delete Patient without token***");
	
}

@When("User sends delete HTTPS request without token")
public void user_sends_delete_HTTPS_request_without_token() {
	PatientControllerRequest.DeleteRequestWithoutToken();
}

@Then("User receives {int} status code for without token")
public void user_receives_status_code_for_without_token(Integer statuscode) {
	if (statuscode == 401) {

		response.then().assertThat()
		.statusCode(statuscode)
		.log().all();
		
			log.info(" Patient Delete Unsuccessful with status code " + response.getStatusCode()) ;
			//log.info("Patient Delete Response body" +response.getBody().asString());


		} else {
		log.info("Request failed");
			
		}

   
}




	}





