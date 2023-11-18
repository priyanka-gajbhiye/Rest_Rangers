package api.StepDefinition;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

import java.io.IOException;

import api.CRUDrequest.NegativeUserLoginRequest;
import api.CRUDrequest.UserLoginRequest;
import api.requestbodyActions.NegativeUserLoginBody;
import api.requestbodyActions.UserLoginBody;
import api.utilities.RestUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NegativeUserLoginSD extends RestUtils {
	
	@Given("User creates POST request for login with invalid URL")
	public void user_creates_POST_request_for_login_with_invalid_URL() {
		String InvalidBaseURI = url_endpoints.getString("InValidBaseUrl");
		baseURI = InvalidBaseURI;
		log.info("***User sends request with BaseURL***");	
	
	}

	@When("User sends HTTPS request with request body with invalid URL")
	public void user_sends_HTTPS_request_with_request_body_with_invalid_URL() throws IOException {
	
		NegativeUserLoginRequest.PostRequestInvalidEndPoint(NegativeUserLoginBody.PostBodyInvalidURL());
		//UserLoginPOJO.setToken(response.path("token"));

		log.info("****New user login is Not created ****");

	}

	@Then("User receives {int} Not Found status")
	public void user_receives_Not_Found_status(Integer statuscode) {
		if (statuscode == 404) {

			response.then().assertThat()
			.statusCode(statuscode)
			//.body(matchesJsonSchema(userLoginjson))
			.log().all();
			
				log.info("User Login is not created " + response.getStatusCode()) ;
				//log.info("User Login Response body" +response.getBody().asString());


			} else {
			log.info("Request failed");
				//log.error("400 bad Request");
			}
	}

	@Given("User creates POST request for login with incorrect endpoint")
	public void user_creates_POST_request_for_login_with_incorrect_endpoint() {
		String BaseURI = url_endpoints.getString("BaseUrl");
		baseURI = BaseURI;
		log.info("***User sends request with BaseURL***");	
	
	}

	@When("User sends HTTPS request with request body with incorrect endpoint")
	public void user_sends_HTTPS_request_with_request_body_with_incorrect_endpoint() {
	    
	}

	@Then("User receives {int} unauthorized status for invalid endpoint")
	public void user_receives_unauthorized_status_for_invalid_endpoint(Integer statuscode) {
		if (statuscode == 404) {

			response.then().assertThat()
			.statusCode(statuscode)
			//.body(matchesJsonSchema(userLoginjson))
			.log().all();
			
				log.info("User Login is not created " + response.getStatusCode()) ;
				//log.info("User Login Response body" +response.getBody().asString());


			} else {
			log.info("Request failed");
				//log.error("400 bad Request");
			}

	
	}

	@Given("User creates POST request for login with incorrect body")
	public void user_creates_POST_request_for_login_with_incorrect_body() {
		String BaseURI = url_endpoints.getString("BaseUrl");
		baseURI = BaseURI;
		log.info("***User sends request with BaseURL***");	
	
	}

	@When("User sends HTTPS request with incorrect request body")
	public void user_sends_HTTPS_request_with_incorrect_request_body() throws IOException {
		UserLoginRequest.PostRequest(NegativeUserLoginBody.PostBodyInvalidbody());
		//NegativeUserLoginRequest.PostRequestInvalidEndPoint(NegativeUserLoginBody.PostBodyInvalidURL());
		//UserLoginPOJO.setToken(response.path("token"));

		log.info("****New user login is Not created ****");
	}

	@Then("User receives {int} unauthorized status for incorrect body")
	public void user_receives_unauthorized_status_for_incorrect_body(Integer statuscode) {
		if (statuscode == 401) {

			response.then().assertThat()
			.statusCode(statuscode)
			//.body(matchesJsonSchema(userLoginjson))
			.log().all();
			
				log.info("User Login is not created " + response.getStatusCode()) ;
				//log.info("User Login Response body" +response.getBody().asString());


			} else {
			log.info("Request failed");
				//log.error("400 bad Request");
			}

	   
	}




}
