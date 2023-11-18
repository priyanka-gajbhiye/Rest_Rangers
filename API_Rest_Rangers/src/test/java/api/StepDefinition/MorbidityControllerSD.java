
package api.StepDefinition;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

import api.CRUDrequest.MorbidityControllerRequst;
import api.utilities.RestUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MorbidityControllerSD extends RestUtils{
	
	@Given("User creates GET request for all morbidities")
	public void user_creates_GET_request_for_all_morbidities() {
		log.info("***Get request for all Morbidities***");
	
	}

	@When("User sends HTTPS request for all morbidities")
	public void user_sends_HTTPS_request_for_all_morbidities() {
		MorbidityControllerRequst.GetAllMorbidityRequest();
	}

	@Then("User receives {int} status code and response body for all morbidities")
	public void user_receives_status_code_and_response_body_for_all_morbidities(Integer statuscode) {
		if (statuscode == 200) {

			response.then().assertThat()
			.statusCode(statuscode)
			.body(matchesJsonSchema(morbidityControllerjson))
			.log().all();
			
				log.info("Get All Morbidity successful with status code " + response.getStatusCode()) ;
				log.info("Get All Morbidity Response body" +response.getBody().asString());


			} else {
			log.info("Request failed");
				log.error("400 bad Request");
			}
		}
		

	@Given("User creates GET request by morbidity Name")
	public void user_creates_GET_request_by_morbidity_Name() {
		log.info("***Get Resquest by Morbidity Name***");
	
	}

	@When("User sends HTTPS request and request body by morbidity name")
	public void user_sends_HTTPS_request_and_request_body_by_morbidity_name() {
		MorbidityControllerRequst.GetMorbidityNameRequest();
	
	}

	@Then("User receives {int} status code and response body by morbidity name")
	public void user_receives_status_code_and_response_body_by_morbidity_name(Integer statuscode) {
		if (statuscode == 200) {

			response.then().assertThat()
			.statusCode(statuscode)
			.body(matchesJsonSchema(morbidityControllerjson))
			.log().all();
			
				log.info("Get Morbidity by Name successful with status code " + response.getStatusCode()) ;
				log.info("Get Morbidity by Name Response body" +response.getBody().asString());


			} else {
			log.info("Request failed");
				log.error("400 bad Request");
			}
		}
	
	}



