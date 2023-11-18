package api.CRUDrequest;

import api.utilities.RestUtils;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class NegativeMorbidityControllerRequest extends RestUtils {
	
public static Response GetAllMorWithoutTokenRequest() {

		
		try {
			
			RequestSpecification request = RestAssured.given();
			//request.header("Authorization", UserLoginPOJO.getToken());
			//System.out.println("Get ALL Request"+ request.header("Authorization",UserLoginPOJO.getToken()));
			request.then().log().all();
			
			response = request.when().get(url_endpoints.getString("getallmorbidity"));
			
			response.then().log().all();
			

		}catch (Exception e) {
			e.printStackTrace();
		}

		return response;

	}
     public static Response GetMorbidityNameWithoutTokenRequest() {

	try {
		RequestSpecification request = RestAssured.given();
		//request.header("Authorization", UserLoginPOJO.getToken());
		//System.out.println("Get ALL Request"+ request.header("Authorization",UserLoginPOJO.getToken()));
		request.then().log().all();
		
		response = request.when().get(url_endpoints.getString("getbyMorbidityName"));
		
		response.then().log().all();
	

	}catch (Exception e) {
		e.printStackTrace();
	}

	return response;

}
     public static Response GetMorbidityPartialNameRequest() {

 		try {
 			RequestSpecification request = RestAssured.given();
 			request.header("Authorization", UserLoginPOJO.getToken());
 			//System.out.println("Get ALL Request"+ request.header("Authorization",UserLoginPOJO.getToken()));
 			request.then().log().all();
 			
 			response = request.when().get(url_endpoints.getString("getbyMorbidityPartialName"));
 			
 			response.then().log().all();
 		

 		}catch (Exception e) {
 			e.printStackTrace();
 		}

 		return response;

}
     public static Response GetMorbidityInvalidNameRequest() {

    		try {
    			RequestSpecification request = RestAssured.given();
    			request.header("Authorization", UserLoginPOJO.getToken());
    			//System.out.println("Get ALL Request"+ request.header("Authorization",UserLoginPOJO.getToken()));
    			request.then().log().all();
    			
    			response = request.when().get(url_endpoints.getString("getbyMorbidityInvalidName"));
    			
    			response.then().log().all();
    		

    		}catch (Exception e) {
    			e.printStackTrace();
    		}

    		return response;

}
}