import java.util.ArrayList;

public class DeskClerk {
	
	private Employee e;
	private String responsibilities = "Manage all guest services at front desk. Give information and reserve rooms.";
	private ArrayList<Reservation> reservations;
	
	DeskClerk(String name, String username, String password, String email, String phone){	
		e = new Employee("Desk Clerk", name, username, password, email, phone);
	}
	
	public String getResponsibilities() {
		return responsibilities;
	}
	
	public ArrayList<Reservation> getReservations(){
		return reservations;
	}
	
	public void bookRoom(int roomNum) {
		
	}
}
