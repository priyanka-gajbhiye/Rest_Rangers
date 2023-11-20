package api.requestbodyActions;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;

import api.utilities.RestUtils;
import api.utilities.XLUtils;
import api.payload.UserLoginPOJO;

public class UserLoginBody extends RestUtils{
	
	//post body
		public static UserLoginPOJO PostBody() throws IOException {
			
			UserLoginPOJO.setPassword(xlutils.getCellData("UserLogin", 1, 0));
			UserLoginPOJO.setUserLoginEmail(xlutils.getCellData("UserLogin", 1, 1));
		
			System.out.println("UserLogin is successful");
			System.out.println("UserLoginPOJO :" + UserLoginPOJO);

			return UserLoginPOJO;

			
			
		}


}
