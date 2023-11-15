package api.requestbodyActions;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;

import api.utilities.RestUtils;
import api.utilities.XLUtils;
import api.payload.UserLoginPOJO;

public class UserLoginBody extends RestUtils{
	
	//post body
		public static UserLoginPOJO PostBody() throws IOException {
			System.out.println("PATH"+ path);
			System.out.println("PATH"+ xlutils);
			UserLoginPOJO.setPassword(xlutils.getCellData("UserLogin", 1, 1));
			UserLoginPOJO.setUserLoginEmail(xlutils.getCellData("UserLogin", 1, 2));
		
			System.out.println("UserLogin is successful");

			return UserLoginPOJO;

			
			
		}


}
