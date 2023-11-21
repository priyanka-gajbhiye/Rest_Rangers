package api.CRUDrequest;

import api.payload.UserLoginPOJO;
import api.utilities.RestUtils;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PatientRoleRequest extends RestUtils{
	public static Response PatientPostRequest(UserLoginPOJO payload) {		

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
	public static Response GetRequest() {	    
		   
	    
		   try {
					
					RequestSpecification request = RestAssured.given();
				    request.header("Authorization", UserLoginPOJO.getToken());
					request.then().log().all();
					response = request.when().get(url_endpoints.getString("getpatientcontroller")+"/"+UserLoginPOJO.getPatientId()).andReturn();
					response.then().log().all();
					
				}catch (Exception e) {
					e.printStackTrace();
				}

				return response;
			}
			public static Response GetRequestfileID() {	    
			    
				   try {
							
							RequestSpecification request = RestAssured.given();
						        request.header("Authorization", UserLoginPOJO.getToken());
							    
							request.then().log().all();
							response = request.when().get(url_endpoints.getString("getbyfileID")+"/"+UserLoginPOJO.getFileId()).andReturn();
							
							response.then().log().all();
							
						}catch (Exception e) {
							e.printStackTrace();
						}

						return response;
					}

}
