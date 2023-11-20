package api.StepDefinition;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

import api.CRUDrequest.PatientControllerRequest;
import api.utilities.RestUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeletePatientSD extends RestUtils{
	
	@Given("User creates DELETE request for Patient")
	public void user_creates_DELETE_request_for_Patient() {
		log.info("***Delete request for Patient***");
		
	}

	@When("User sends HTTPS request for Patient")
	public void user_sends_HTTPS_request_for_Patient() {
		PatientControllerRequest.DeleteRequest();
	}

	@Then("User receives {int} status code for Patient")
	public void user_receives_status_code_for_Patient(Integer statuscode) {
		if (statuscode == 200) {

			response.then().assertThat()
			.statusCode(statuscode)
			.log().all();
			
				log.info(" Patient Deleted successfully with status code " + response.getStatusCode()) ;
				


			} else {
			log.info("Request failed");
				log.error("400 bad Request");
			}

	}


}
