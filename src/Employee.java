
public class Employee {
	
	private String jobTitle;
	private User employee = new User("employee");
	
	Employee(String e){
		jobTitle = e;
	}
	
	public String getJobTitle() {
		return jobTitle;
	}
}
