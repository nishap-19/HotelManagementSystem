
public class Employee {
	
	private String jobTitle;
	private User employee;
	
	Employee(String e, String name, String username, String password, String email, String phone){
		jobTitle = e;
		employee = new User("employee", name, username, password, email, phone);
	}
	
	public String getJobTitle() {
		return jobTitle;
	}
	
	public User getUserData() {
		return employee;
	}
}
