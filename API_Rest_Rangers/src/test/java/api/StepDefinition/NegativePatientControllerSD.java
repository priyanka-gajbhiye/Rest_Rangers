package api.StepDefinition;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

import api.CRUDrequest.PatientControllerRequest;
import api.utilities.RestUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NegativePatientControllerSD extends RestUtils {
	
	@Given("User creates POST request with duplicate data")
	public void user_creates_POST_request_with_duplicate_data() {
		log.info("***User creates POST request with duplicate data***");	
	}

	@When("User sends HTTPS request with duplicate data")
	public void user_sends_HTTPS_request_with_duplicate_data() {
		PatientControllerRequest.PostRequest();
		//UserLoginPOJO.setPatientId(response.path("patientId"));
		//System.out.println("New PatientID"+UserLoginPOJO.getPatientId());
		
	}

	@Then("User receives {int} status code for duplicate data")
	public void user_receives_status_code_with_duplicate_data(Integer statuscode) {
		if (statuscode == 400) {

			response.then().assertThat()
			.statusCode(statuscode)
			//.body(matchesJsonSchema(Patientjson))
			.log().all();
			
				log.info("New Patient created successfully with status code " + response.getStatusCode()) ;


			} else {
			log.info("Request failed");
				
			}

	}


}
