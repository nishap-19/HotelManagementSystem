import java.util.Date;

public class Reservation {
	
	private int roomNumber;
	private String nameOfReservation;
	private int occupantNumber;
	private Date reservationStart;
	private Date reservationEnd;
	
	Reservation(){
	}
	
	public String viewReservation(int roomNumber){
		return "Room: " + roomNumber + "\nName: " + nameOfReservation;
	}
}
