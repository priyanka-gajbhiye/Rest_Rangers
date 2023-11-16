package api.StepDefinition;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static org.junit.Assert.assertEquals;

import java.io.IOException;
import api.requestbodyActions.UserLoginBody;
import api.CRUDrequest.UserLoginRequest;
import api.payload.UserLoginPOJO;
import api.utilities.RestUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserLoginSD extends RestUtils{
	
	@Given("User creates POST request for login")
	public void User_creates_POST_request_for_login() throws IOException {

		String BaseURI = url_endpoints.getString("BaseUrl");
		baseURI = BaseURI;
		log.info("***User sends request with BaseURL***");	
	}


	@When("User sends HTTPS request and request body with mandatory additional fields")
	public void user_sends_HTTPS_request_and_request_body_with_mandatory_additional_fields() throws IOException {
		
				UserLoginRequest.PostRequest(UserLoginBody.PostBody());
		UserLoginPOJO.setToken(response.path("token"));
		System.out.println("Bearer Token"+ UserLoginPOJO.getToken());
		log.info("****New user login is created with Bearer Token****");

	}

	@Then("User receives {int} created status with token in response body")
	public void user_receives_created_status_with_token_in_response_body(Integer int1) {
	 
//		if (statuscode == 200) {
//
//			response.then().assertThat()
//			.statusCode(statuscode)
//			.body(matchesJsonSchema(programPutjson))
//			.log().all();
//
//			assertEquals(ProgramPayload.getProgramName(), response.jsonPath().getString("programName"));
//			assertEquals(ProgramPayload.getProgramStatus(), response.jsonPath().getString("programStatus"));
//			assertEquals(ProgramPayload.getProgramDescription(), response.jsonPath().getString("programDescription"));
//
//			log.info("Program updated successfully with status code " + response.getStatusCode()) ;
//			log.info("Program Respose body" +response.getBody().asString());
//
//
//		} else {
//			log.info("Request failed");
//			log.error("400 bad Request");
//		}
	}
	


}
