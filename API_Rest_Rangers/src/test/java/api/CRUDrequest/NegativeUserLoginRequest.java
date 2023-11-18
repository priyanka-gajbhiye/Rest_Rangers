package api.CRUDrequest;

import api.payload.UserLoginPOJO;
import api.utilities.RestUtils;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class NegativeUserLoginRequest extends RestUtils{

	public static Response PostRequestInvalidURL(UserLoginPOJO payload) {		

		try {
			
			RequestSpecification request = RestAssured.given().body(payload);
			request.header("Content-Type", "application/json");
			
			request.then().log().all();
			
			response = request.when().post(url_endpoints.getString("postuserlogin"));
			
			response.then().log().all();
			
		}catch (Exception e) {
			e.printStackTrace();
		}

		return response;
	}
	
	public static Response PostRequestInvalidEndPoint(UserLoginPOJO payload) {		

		try {
			
			RequestSpecification request = RestAssured.given().body(payload);
			request.header("Content-Type", "application/json");
			
			request.then().log().all();
			
			response = request.when().post(url_endpoints.getString("InvalidPostUserLogin"));
			
			response.then().log().all();
			
		}catch (Exception e) {
			e.printStackTrace();
		}

		return response;
	}
}
