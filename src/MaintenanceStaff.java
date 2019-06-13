import java.util.ArrayList;

public class MaintenanceStaff {

	private Employee e = new Employee("Maintenance Staff");
	private String responsibilities = "Manage all maintenance service requests from guests and other employees";
	private ArrayList<ServiceLog> serviceRequests;
	
	MaintenanceStaff(){	
	}
	
	public String getResponsibilities() {
		return responsibilities;
	}
	
	public ArrayList<ServiceLog> getServiceRequests(){
		return serviceRequests;
	}
}
