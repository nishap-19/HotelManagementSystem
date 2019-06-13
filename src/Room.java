
public class Room {

	private int roomNumber;
	private String roomType;
	private boolean roomReserved = false;
	private boolean roomClean = true;
	
	Room(int num, String type){
		roomNumber = num;
		roomType = type;
	}
	
	public void bookRoom() {
		roomReserved = true;
	}
	
	public void releaseRoom() {
		roomReserved = false;
	}
	
	public int getRoomNumber() {
		return roomNumber;
	}
	
	public String getRoomType() {
		return roomType;
	}
	
	public String getCleaningStatus() {
		if(roomClean)
			return "Room is clean";
		else
			return "Room needs to be cleaned";
	}
}
