package api.requestbodyActions;

import java.io.IOException;

import api.payload.UserLoginPOJO;
import api.utilities.RestUtils;

public class NegativeUserLoginBody extends RestUtils{

	public static UserLoginPOJO PostBodyInvalidURL() throws IOException {
		
		UserLoginPOJO.setPassword(xlutils.getCellData("UserLogin", 1, 0));
		UserLoginPOJO.setUserLoginEmail(xlutils.getCellData("UserLogin", 1, 1));
	
		System.out.println("UserLogin is Not successful");
		System.out.println("UserLoginPOJO :" + UserLoginPOJO);

		return UserLoginPOJO;

		
	}
public static UserLoginPOJO PostBodyInvalidbody() throws IOException {
		
		UserLoginPOJO.setPassword(xlutils.getCellData("UserLogin", 2, 0));
		UserLoginPOJO.setUserLoginEmail(xlutils.getCellData("UserLogin", 2, 1));
	
		System.out.println("UserLogin is Not successful");
		System.out.println("UserLoginPOJO :" + UserLoginPOJO);

		return UserLoginPOJO;

		
	}

}
