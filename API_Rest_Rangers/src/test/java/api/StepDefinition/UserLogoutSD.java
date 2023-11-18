package api.StepDefinition;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

import api.CRUDrequest.UserLogoutRequest;
import api.utilities.RestUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserLogoutSD extends RestUtils {


@Given("User creates GET request for logout with token and valid endpoint")
public void user_creates_GET_request_for_logout_with_token_and_valid_endpoint() {
	log.info("***Get request for for logout Invalid Endpoint***");
	
}

@When("User sends HTTPS request with token and valid endpoint")
public void user_sends_HTTPS_request_with_token_and_valid_endpoint() {
	UserLogoutRequest.getRequest();
}

@Then("User receives {int} statuscode for token and valid endpoint")
public void user_receives_statuscode_for_token_and_valid_endpoint(Integer statuscode) {
	if (statuscode == 200) {

		response.then().assertThat()
		.statusCode(statuscode)
		.log().all();
		
			log.info("User Login created successfully with status code " + response.getStatusCode()) ;
			log.info("User Login Response body" +response.getBody().asString());


		} else {
		log.info("Request failed");
			log.error("400 bad Request");
		}

}



}
