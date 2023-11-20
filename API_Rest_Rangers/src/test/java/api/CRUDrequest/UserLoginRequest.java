package api.CRUDrequest;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import api.payload.UserLoginPOJO;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import api.utilities.RestUtils;
import io.restassured.response.Response;


public class UserLoginRequest extends RestUtils {

	
	public static Response PostRequest(UserLoginPOJO payload) {		

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
