import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

public class HotelDataAccess {

	private static ArrayList<CleaningLog> cleaningRequests;
	private static ArrayList<ServiceLog> serviceRequests;
	private static ArrayList<Room> hotelRooms;
	private static ArrayList<Employee> employees;
	private static ArrayList<Guest> guests;
	
	HotelDataAccess(){}

	//returns an array of Room objects
	public static ArrayList<Room> getHotelRooms() {

		//initializes ArrayList of FlightData objects
		hotelRooms = new ArrayList<Room>();

		try {
			//finds the HotelRooms.txt file
			Scanner roomFile = new Scanner(new File(System.getProperty("user.dir") + "/HotelRooms.txt"));
			Scanner dataScan;	//Scanner object to scan each line of the file
			String data;	//Scanner object to scan each data item in the line given
			String roomType;
			int roomNumber, reserveStatus, cleanStatus;

			roomFile.nextLine();	//skips the header line of the file

			//runs the command to add rooms to the ArrayList until there is no more data
			while (roomFile.hasNext()) {

				data = roomFile.nextLine();	//reads in a line of text
				dataScan= new Scanner(data);	//reads each item in the line of text

				//scans in all data items and sets to variables
				roomNumber = dataScan.nextInt();
				roomType = dataScan.next();
				reserveStatus = dataScan.nextInt();
				cleanStatus = dataScan.nextInt();

				//Create Room object
				Room r = new Room(roomNumber, roomType);
				if(reserveStatus == 1)
					r.bookRoom();
				if(cleanStatus == 1)
					r.needCleaning();

				hotelRooms.add(r);	//adds new Room object to ArrayList
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return hotelRooms;
	}
	
	//updates HotelRooms.txt
	public static void updateRoomData(ArrayList<Room> rooms) {
		//finds the HotelRooms.txt file
		File roomFile = new File(System.getProperty("user.dir") + "/HotelRooms.txt");
		try {
			//creates Formatter object to use to write to file, will overwrite pre-existing contents
			Formatter output = new Formatter(roomFile);
			
			//writes header to file
			output.format("%-10s %-10s %-10s %-10s n", "Room##", "RoomType", "RoomReserved", "RoomCleaned");
			
			//writes all rooms from rooms array to file
			for(int i = 0; i < rooms.size(); i++) {
				Room r = rooms.get(i);	//gets individual Room objects from rooms array
				
				int x = (r.reservationStatus()) ? 0 : 1;
				int y = (r.getCleaningStatus()) ? 0 : 1;
				
				//prints contents of each Room object to file
				output.format("%-10s %-10s %-10s %-10s%n", r.getRoomNumber(), r.getRoomType(), x, y);
			}	
			//close output Formatter
			output.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//returns an ArrayList of Employee objects
	public static ArrayList<Employee> getEmployeeData(){

		//initializes array of Employee objects
		employees = new ArrayList<Employee>();

		try {
			//finds the reservations.txt file
			Scanner employeeFile = new Scanner(new File(System.getProperty("user.dir") + "/employees.txt"));
			Scanner dataScan;	//Scanner object to scan each line of the file
			String data;	//Scanner object to scan each data item in the line given
			String name, role, username, password, email;
			int phone;

			employeeFile.nextLine();	//skips the header line of the file

			//runs the command to add employees to the ArrayList until there is no more data
			while (employeeFile.hasNext()) {

				data = employeeFile.nextLine();	//reads in a line of text
				dataScan= new Scanner(data);	//reads each item in the line of text

				//scans in all data items and sets to variables
				name = dataScan.next() + " " + dataScan.next();
				role = dataScan.next();
				username = dataScan.next();
				password = dataScan.next();
				email = dataScan.next();
				phone = dataScan.nextInt();

				//Create Employee object
				Employee e = new Employee(role, name, username, password, email, phone);

				employees.add(e);	//adds new Employee object to ArrayList
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return employees;
	}
	
	public static void updateEmployeeData(ArrayList<Employee> employees) {
		//finds the employees.txt file
		File employeeFile = new File(System.getProperty("user.dir") + "/employees.txt");
		try {
			//creates Formatter object to use to write to file, will overwrite pre-existing contents
			Formatter output = new Formatter(employeeFile);
			
			//writes header to file
			output.format("%-10s %-10s %-10s %-10s %s%n", "Name", "Role", "Username", "Password", "Email", "Phone");
			
			//writes all employees from employees array to file
			for(int i = 0; i < employees.size(); i++) {
				Employee e = employees.get(i);	//gets individual Employee objects from employees array
				User u = e.getUserData();
				
				//prints contents of each Employee object to file
				output.format("%-10s %-10s %-10s %-10s %-10s %s%n", u.getName(), e.getJobTitle(), u.getUsername(), u.getPassword(), 
						u.getEmail(), u.getPhone());
			}	
			//close output Formatter
			output.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//returns an ArrayList of Guest objects
	public static ArrayList<Guest> getGuestData(){

		//initializes array of Employee objects
		guests = new ArrayList<Guest>();

		try {
			//finds the reservations.txt file
			Scanner guestFile = new Scanner(new File(System.getProperty("user.dir") + "/guests.txt"));
			Scanner dataScan;	//Scanner object to scan each line of the file
			String data;	//Scanner object to scan each data item in the line given
			String name, username, password, email;
			int phone;

			guestFile.nextLine();	//skips the header line of the file

			//runs the command to add guests to the ArrayList until there is no more data
			while (guestFile.hasNext()) {

				data = guestFile.nextLine();	//reads in a line of text
				dataScan= new Scanner(data);	//reads each item in the line of text

				//scans in all data items and sets to variables
				name = dataScan.next() + " " + dataScan.next();
				username = dataScan.next();
				password = dataScan.next();
				email = dataScan.next();
				phone = dataScan.nextInt();

				//Create Guest object
				Guest g = new Guest(name, username, password, email, phone);

				guests.add(g);	//adds new Employee object to ArrayList
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return guests;
	}
		
	public static void updateGuestData(ArrayList<Guest> guests) {
		//finds the guests.txt file
		File employeeFile = new File(System.getProperty("user.dir") + "/guests.txt");
		try {
			//creates Formatter object to use to write to file, will overwrite pre-existing contents
			Formatter output = new Formatter(employeeFile);
				
			//writes header to file
			output.format("%-10s %-10s %-10s %-10s %s%n", "Name", "Username", "Password", "Email", "Phone");
				
			//writes all employees from employees array to file
			for(int i = 0; i < guests.size(); i++) {
				Guest g = guests.get(i);	//gets individual Employee objects from employees array
				User u = g.getUserData();
					
				//prints contents of each Employee object to file
				output.format("%-10s %-10s %s%n", u.getName(), u.getUsername(), u.getPassword(), 
						u.getEmail(), u.getPhone());
				}	
			//close output Formatter
			output.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
