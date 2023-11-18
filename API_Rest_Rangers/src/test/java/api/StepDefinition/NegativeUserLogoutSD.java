package api.StepDefinition;

import api.CRUDrequest.NegativeUserLogoutRequest;
import api.utilities.RestUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NegativeUserLogoutSD extends RestUtils{
	@Given("User creates GET request for logout with Invalid Endpoint")
	public void user_creates_GET_request_for_logout_with_Invalid_Endpoint() {
		log.info("***Get request for for logout Invalid Endpoint***");
		
	}

	@When("User sends HTTPS request with Invalid Endpoint")
	public void user_sends_HTTPS_request_with_Invalid_Endpoint() {
		NegativeUserLogoutRequest.getLogOutInvalidEndpoint();
	}

	@Then("User receives {int} statuscode with Method Not Allowed")
	public void user_receives_statuscode_with_Method_Not_Allowed(Integer statuscode) {
		if (statuscode == 405) {

			response.then().assertThat()
			.statusCode(statuscode)
			.log().all();
			
				log.info("User Login is not created " + response.getStatusCode()) ;


			} else {
			log.info("Request failed");
			}
	}

	@Given("User creates GET request for logout without token")
	public void user_creates_GET_request_for_logout_without_token() {
		log.info("***Get request for for logout Invalid Endpoint***");
		
	}

	@When("User sends HTTPS request without token")
	public void user_sends_HTTPS_request_without_token() {
		NegativeUserLogoutRequest.getLogOutWithoutToken();
	}

	@Then("User receives {int} statuscode for without token")
	public void user_receives_statuscode_for_without_token(Integer statuscode) {
		if (statuscode == 401) {

			response.then().assertThat()
			.statusCode(statuscode)
			.log().all();
			
				log.info("User Login is not created " + response.getStatusCode()) ;


			} else {
			log.info("Request failed");
			}
	}




}
