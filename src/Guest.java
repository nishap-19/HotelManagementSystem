import java.util.Date;

public class Guest {

	private User guest;
	private int numberOfVisits = 0;
	
	Guest(String name, String username, String password, String email, int phone){	
		guest = new User("Guest", name, username, password, email, phone);	
	}
	
	public User getUserData() {
		return guest;
	}
	
	public void reserveRoom(int roomNum, Date reservationStart, Date reservationEnd) {
		
	}	
}
