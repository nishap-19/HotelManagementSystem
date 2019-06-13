
public class User {
	
	private String name;
	private String address;
	private int phoneNumber;
	private String username;
	private String password;
	private String typeOfUser;
	
	User(String type){	
		typeOfUser = type;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
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
	
	public void updateAddress(String s) {
		address = s;
	}
	
	public void updatePhone(int n) {
		phoneNumber = n;
	}
	
	public void updatePassword(String p) {
		password = p;
	}
}
