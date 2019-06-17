import java.util.ArrayList;

public class CleaningStaff {
	
	private Employee e;
	private String responsibilities = "Manage all room cleaning requests";
	private ArrayList<CleaningLog> cleaningRequests;
	
	CleaningStaff(String name, String username, String password, String email, int phone){	
		e = new Employee("Cleaning Staff", name, username, password, email, phone);	
	}
	
	public String getResponsibilities() {
		return responsibilities;
	}
	
	public ArrayList<CleaningLog> getServiceRequests(){
		
		
		return cleaningRequests;
	}
	
	public void cleanRoom(int roomNum) {
		
	}
}
