import java.util.ArrayList;

public class CleaningStaff {
	
	private Employee e = new Employee("Cleaning Staff");
	private String responsibilities = "Manage all room cleaning requests";
	private ArrayList<CleaningLog> cleaningRequests;
	
	CleaningStaff(){	
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
