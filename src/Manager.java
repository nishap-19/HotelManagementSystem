import java.util.ArrayList;

public class Manager {
	
	private Employee e;
	private ArrayList<Employee> employees;
	
	Manager(String name, String username, String password, String email, int phone){	
		e = new Employee("Manager", name, username, password, email, phone);
	}
	
	public ArrayList<Employee> getEmployeeRoster(){
		return employees;
	}
	
	public void addEmployee() {
		
	}
	
	public void removeEmployee() {
		
	}
	
	public void updateEmployee() {
		
	}
}
