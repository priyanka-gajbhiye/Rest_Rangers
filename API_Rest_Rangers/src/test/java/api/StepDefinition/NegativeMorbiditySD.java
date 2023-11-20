package api.StepDefinition;

import api.CRUDrequest.MorbidityControllerRequst;
import api.utilities.RestUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NegativeMorbiditySD extends RestUtils{
	@Given("User creates GET request for all morbidty without token")
	public void user_creates_GET_request_for_all_morbidty_without_token() {
		log.info("***Get request for all Morbidities Without token***");
		
	}

	@When("User sends HTTPS request for all morbidty")
	public void user_sends_HTTPS_request_for_all_morbidty() {
		MorbidityControllerRequst.GetAllMorWithoutTokenRequest();
	}

	@Then("User receives {int} unauthorized status code for all morbidty")
	public void user_receives_unauthorized_status_code_for_all_morbidty(Integer statuscode) {
		if (statuscode == 401) {

			response.then().assertThat()
			.statusCode(statuscode)
			.log().all();
			
				log.info("User Login is not created " + response.getStatusCode()) ;


			} else {
			log.info("Request failed");
			}
	}

	@Given("User creates GET request for morbidity Name without token")
	public void user_creates_GET_request_for_morbidity_Name_without_token() {
		log.info("***Get request for all Morbidity Name Without token***");
	}

	@When("User sends HTTPS request for morbidity Name")
	public void user_sends_HTTPS_request_for_morbidity_Name() {
		MorbidityControllerRequst.GetMorbidityNameWithoutTokenRequest();
	}

	@Then("User receives {int} unauthorized status code for morbidity Name")
	public void user_receives_unauthorized_status_code_for_morbidity_Name(Integer statuscode ) {
		if (statuscode == 401) {

			response.then().assertThat()
			.statusCode(statuscode)
			.log().all();
			
				log.info("User Login is not created " + response.getStatusCode()) ;


			} else {
			log.info("Request failed");
			}
	}

	@Given("User creates GET request by partial morbidity Name")
	public void user_creates_GET_request_by_partial_morbidity_Name() {
		log.info("***GET request by partial morbidity Name***");
	
	}

	@When("User sends HTTPS request by partial morbidity Name")
	public void user_sends_HTTPS_request_by_partial_morbidity_Name() {
		MorbidityControllerRequst.GetMorbidityPartialNameRequest();
	}

	@Then("User receives {int} Not Found status code by partial morbidity Name")
	public void user_receives_Not_Found_status_code_by_partial_morbidity_Name(Integer statuscode) {
		if (statuscode == 404) {

			response.then().assertThat()
			.statusCode(statuscode)
			.log().all();
			
				log.info("User Login is not created " + response.getStatusCode()) ;


			} else {
			log.info("Request failed");
			}

	}

	@Given("User creates GET request by invalid morbidity Name")
	public void user_creates_GET_request_by_invalid_morbidity_Name() {
		log.info("***Get request by invalid morbidity Name***");
	
	}

	@When("User sends HTTPS request by invalid morbidity Name")
	public void user_sends_HTTPS_request_by_invalid_morbidity_Name() {
		MorbidityControllerRequst.GetMorbidityInvalidNameRequest();
	}

	@Then("User receives {int} Not Found status code by invalid morbidity name")
	public void user_receives_Not_Found_status_code_by_invalid_morbidity_name(Integer statuscode) {
		if (statuscode == 404) {

			response.then().assertThat()
			.statusCode(statuscode)
			.log().all();
			
				log.info("User Login is not created " + response.getStatusCode()) ;


			} else {
			log.info("Request failed");
			}

	}




}
