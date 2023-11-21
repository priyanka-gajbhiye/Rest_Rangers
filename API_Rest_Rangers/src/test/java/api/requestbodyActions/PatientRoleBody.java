package api.requestbodyActions;

import java.io.IOException;

import api.payload.UserLoginPOJO;
import api.utilities.RestUtils;

public class PatientRoleBody extends RestUtils{
	
	//Pateint post body
			public static UserLoginPOJO PatientPostBody() throws IOException {
				
				UserLoginPOJO.setPatientpassword(xlutils.getCellData("PatientLogin", 1, 0));
				UserLoginPOJO.setPatinetEmail(xlutils.getCellData("PatientLogin", 1, 1));
			
				System.out.println("PatientLogin is successful");
				System.out.println("UserLoginPOJO :" + UserLoginPOJO);

				return UserLoginPOJO;

				
				
			}

}
