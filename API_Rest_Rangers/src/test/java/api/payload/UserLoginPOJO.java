package api.payload;

public class UserLoginPOJO {
	
	String password;
	String userLoginEmail;
	String token;
	String Bearer;
	public String getToken() {
		Bearer  = "Bearer "+token;
		return Bearer;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserLoginEmail() {
		return userLoginEmail;
	}
	public void setUserLoginEmail(String userLoginEmail) {
		this.userLoginEmail = userLoginEmail;
	}
	
	


}
