package api.utilities;

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
	
	
	//payload objects
		public static UserLoginPOJO UserLoginPOJO = new UserLoginPOJO();
		


}
