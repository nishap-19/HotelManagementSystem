
public class Room {

	private int roomNumber;
	private String roomType;
	private boolean roomAvailable = true;
	private boolean roomClean = true;
	
	Room(int num, String type){
		roomNumber = num;
		roomType = type;
	}
	
	public void bookRoom() {
		roomAvailable = false;
	}
	
	public void releaseRoom() {
		roomAvailable = true;
	}
	
	public void needCleaning() {
		roomClean = false;
	}
	
	public void roomCleaned() {
		roomClean = true;
	}
	
	public int getRoomNumber() {
		return roomNumber;
	}
	
	public String getRoomType() {
		return roomType;
	}
	
	public boolean getCleaningStatus() {
		return roomClean;
	}
	
	public boolean reservationStatus() {
		return roomAvailable;
	}
}
