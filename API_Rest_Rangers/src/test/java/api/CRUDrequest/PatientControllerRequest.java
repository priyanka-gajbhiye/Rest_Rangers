package api.CRUDrequest;

import java.io.File;

import org.json.JSONObject;

import com.fasterxml.jackson.core.util.RequestPayload;

import api.payload.UserLoginPOJO;
import api.utilities.RestUtils;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.config.EncoderConfig.encoderConfig;

public class PatientControllerRequest extends RestUtils{
	 
	   
	public static Response PostRequest() {	    
		String patientInfo = newPatient.getString("patientInfo");
		File file = new File("./src/test/resources/ReportsFiles/HypoThyroid-Report.pdf.pdf");
    
    System.out.println("formData Values" + patientInfo);

		try {
			
			RequestSpecification request = RestAssured.given();
			    request.multiPart("file", file);
				request.multiPart("patientInfo",patientInfo);
					//body(new JSONObject(formData));
                request.header("Accept","*/*");
		        request.config(RestAssured.config().encoderConfig(encoderConfig().
							encodeContentTypeAs("multipart/form-data", ContentType.TEXT)));
			    request.header("Authorization", UserLoginPOJO.getToken());
			    request.header("Content-Type", "multipart/form-data; boundary=<calculated when request is sent>");
			
			request.then().log().all();
			
			response = request.when().post(url_endpoints.getString("patientcontroller")).andReturn();
			
			response.then().log().all();
			
		}catch (Exception e) {
			e.printStackTrace();
		}

		return response;
	}
	
	
	public static Response PutRequest() {	    
		String patientInfo = updatePatient.getString("patientInfo");
		File file = new File("./src/test/resources/ReportsFiles/HypoThyroid-Report.pdf.pdf");
   
    
    System.out.println("formData Values" + patientInfo);
    
		try {
			
			RequestSpecification request = RestAssured.given();
			request.multiPart("file", file);
				request.multiPart("patientInfo",patientInfo);
					//body(new JSONObject(formData));
                request.header("Accept","*/*");
		        request.config(RestAssured.config().encoderConfig(encoderConfig().
							encodeContentTypeAs("multipart/form-data", ContentType.TEXT)));
			    request.header("Authorization", UserLoginPOJO.getToken());
			    request.header("Content-Type", "multipart/form-data; boundary=<calculated when request is sent>");
			
			request.then().log().all();
			System.out.println("PUT URL"+url_endpoints.getString("postpatientcontroller")+"/"+UserLoginPOJO.getPatientId());
			response = request.when().put(url_endpoints.getString("postpatientcontroller")+"/"+UserLoginPOJO.getPatientId()).andReturn();
			
			response.then().log().all();
			
		}catch (Exception e) {
			e.printStackTrace();
		}

		return response;
	}
	
	public static Response GetAllPatient() {	    
		   
	    
		   try {
					
					RequestSpecification request = RestAssured.given();
				    request.header("Authorization", UserLoginPOJO.getToken());
					request.then().log().all();
					response = request.when().get(url_endpoints.getString("patientcontroller"));
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

	public static Response DeleteRequest() {	    
		
		try {
			
			RequestSpecification request = RestAssured.given();
			
			    request.header("Authorization", UserLoginPOJO.getToken());
			
			request.then().log().all();
			
			response = request.when().delete(url_endpoints.getString("postpatientcontroller")+"/"+UserLoginPOJO.getPatientId()).andReturn();
			
			response.then().log().all();
			
		}catch (Exception e) {
			e.printStackTrace();
		}

		return response;
	}
	
public static Response DeleteRequestInvalidEndpoint() {	    
		
		try {
			
			RequestSpecification request = RestAssured.given();
			
			    request.header("Authorization", UserLoginPOJO.getToken());
			
			request.then().log().all();
			
			response = request.when().delete(url_endpoints.getString("InvalidDeleteEndpoint")+"/"+UserLoginPOJO.getPatientId()).andReturn();
			
			response.then().log().all();
			
		}catch (Exception e) {
			e.printStackTrace();
		}

		return response;
	}

public static Response DeleteRequestInvalidPatientID() {	    
	
	try {
		
		RequestSpecification request = RestAssured.given();
		
		    request.header("Authorization", UserLoginPOJO.getToken());
		
		request.then().log().all();
		
		response = request.when().delete(url_endpoints.getString("InvalidDeletepatientID")).andReturn();
		
		response.then().log().all();
		
	}catch (Exception e) {
		e.printStackTrace();
	}

	return response;
}

public static Response DeleteRequestWithoutToken() {	    
	
	try {
		
		RequestSpecification request = RestAssured.given();
		
		   // request.header("Authorization", UserLoginPOJO.getToken());
		
		request.then().log().all();
		
		response = request.when().delete(url_endpoints.getString("postpatientcontroller")).andReturn();
		
		response.then().log().all();
		
	}catch (Exception e) {
		e.printStackTrace();
	}

	return response;
}







}
