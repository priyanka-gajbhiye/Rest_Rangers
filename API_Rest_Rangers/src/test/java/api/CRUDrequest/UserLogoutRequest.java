package api.CRUDrequest;

import api.payload.UserLoginPOJO;
import api.utilities.RestUtils;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UserLogoutRequest extends RestUtils {
	
	public static Response getRequest() {		

		try {
			
			RequestSpecification request = RestAssured.given();
			request.header("Authorization", UserLoginPOJO.getToken());
			System.out.println("Logout Token"+ UserLoginPOJO.getToken());
			request.then().log().all();
			
			response = request.when().get(url_endpoints.getString("getLogout"));
			
			response.then().log().all();
			
		}catch (Exception e) {
			e.printStackTrace();
		}

		return response;
	}

}
