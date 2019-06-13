import java.util.ArrayList;

public class DeskClerk {
	
	private Employee e = new Employee("Desk Clef");
	private String responsibilities = "Manage all guest services at front desk. Give information and reserve rooms.";
	private ArrayList<Reservation> reservations;
	
	DeskClerk(){	
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
