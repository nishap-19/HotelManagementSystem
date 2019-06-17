import java.util.ArrayList;

public class MaintenanceStaff {

	private Employee e;
	private String responsibilities = "Manage all maintenance service requests from guests and other employees";
	private ArrayList<ServiceLog> serviceRequests;
	
	MaintenanceStaff(String name, String username, String password, String email, String phone){	
		e = new Employee("Maintenance Staff", name, username, password, email, phone);
	}
	
	public String getResponsibilities() {
		return responsibilities;
	}
	
	public ArrayList<ServiceLog> getServiceRequests(){
		return serviceRequests;
	}
}
