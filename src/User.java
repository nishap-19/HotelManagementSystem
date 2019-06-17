
public class User {
	
	private String name;
	private String email;
	private int phoneNumber;
	private String username;
	private String password;
	private String typeOfUser;
	
	User(String type, String inputName, String inputUsername, String inputPassword, String inputEmail, int inputPhone){	
		typeOfUser = type;
		name = inputName;
		username = inputUsername;
		password = inputPassword;
		email = inputEmail;
		phoneNumber = inputPhone;
		
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public int getPhone() {
		return phoneNumber;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getUserType() {
		return typeOfUser;
	}
	
	public void updateName(String n) {
		name = n;
	}
	
	public void updateEmail(String e) {
		email = e;
	}
	
	public void updatePhone(int n) {
		phoneNumber = n;
	}
	
	public void updatePassword(String p) {
		password = p;
	}
}
