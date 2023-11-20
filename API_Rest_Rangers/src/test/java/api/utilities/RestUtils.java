package api.utilities;

import java.io.File;
import java.util.ResourceBundle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import api.payload.UserLoginPOJO;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestUtils {
	
	public static RequestSpecification request;
	public static Response response;

	public static ResourceBundle url_endpoints = ResourceBundle.getBundle("EndUrls");

	public static Logger log = LogManager.getLogger();
	
	//xcelsheet path
	public static ResourceBundle path = ResourceBundle.getBundle("path");
	public static XLUtils xlutils=new XLUtils(path.getString("Xlpath"));
	
	//Patient new and update
	public static ResourceBundle newPatient = ResourceBundle.getBundle("newPatient");
	public static ResourceBundle updatePatient = ResourceBundle.getBundle("updatePatient");
	
	
	//payload objects
		public static UserLoginPOJO UserLoginPOJO = new UserLoginPOJO();
	
	//User Login schema path
		public static File userLoginjson = xlutils.getJSONFile(path.getString("userLoginSchemajson"));
		
		public static File morbidityControllerjson = xlutils.getJSONFile(path.getString("morbiditycontrollerSchemajson"));
		
	// Patient schema path
		public static File Patientjson = xlutils.getJSONFile(path.getString("PatientSchemajson"));
		
		


}
