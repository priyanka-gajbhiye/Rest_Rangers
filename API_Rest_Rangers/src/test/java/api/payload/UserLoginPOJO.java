package api.payload;

public class UserLoginPOJO {
	
	String fileId;
	String fileName;
	String password;
	String userLoginEmail;
	String token;
	String Bearer;
	int patientId;
	String patientInfo;
    String patientRoleEmail;
	String patientpassword;
	String patinetEmail;
	String patienttoken;
	public String getPatienttoken() {
		Bearer="Bearer"+patienttoken;
		return patienttoken;
	}
	public void setPatienttoken(String patienttoken) {
		this.patienttoken = patienttoken;
	}
	String FirstName;
	String LastName;
	String ContactNumber;
	String Email;
	String Allergy;
	String FoodCategory;
	String DateOfBirth;
	
	
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
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientInfo() {
		 patientInfo = " {\"FirstName\": \"John\",\r\n"
		    		+ "	\"LastName\": \"Dough\",\r\n"
		    		+ "	\"ContactNumber\": \"9192526655\",\r\n"
		    		+ "	\"Email\": \"testpatientInfo@test.com\",\r\n"
		    		+ "	\"Allergy\": \"patientInfoAllergyEdit\",\r\n"
		    		+ "	\"FoodCategory\": \"EGGETARIAN\",\r\n"
		    		+ "	\"DateOfBirth\": \"2010-01-01\"}";
		   
		return patientInfo;
	}
	public void setPatientInfo(String patientInfo) {
		this.patientInfo = patientInfo;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getContactNumber() {
		return ContactNumber;
	}
	public void setContactNumber(String contactNumber) {
		ContactNumber = contactNumber;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getAllergy() {
		return Allergy;
	}
	public void setAllergy(String allergy) {
		Allergy = allergy;
	}
	public String getFoodCategory() {
		return FoodCategory;
	}
	public void setFoodCategory(String foodCategory) {
		FoodCategory = foodCategory;
	}
	public String getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	
	public String getFileId() {
		return fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getPatientRoleEmail() {
		return patientRoleEmail;
	}
	public void setPatientRoleEmail(String patientRoleEmail) {
		this.patientRoleEmail = patientRoleEmail;
	}
	public String getPatientpassword() {
		return patientpassword;
	}
	public void setPatientpassword(String patientpassword) {
		this.patientpassword = patientpassword;
	}
	public String getPatinetEmail() {
		return patinetEmail;
	}
	public void setPatinetEmail(String patinetEmail) {
		this.patinetEmail = patinetEmail;
	}
	

}
