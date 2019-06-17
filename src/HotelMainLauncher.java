/* Name: Nisha Patel, Brandon Thompson, Colin Castlewitz
 * Project Due: April 19
 * Project Name: Hotel Management System
 * Instructor: Elish
 * Course: CEN4010.01
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Formatter;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HotelMainLauncher extends Application{
	
	@Override
	public void start(Stage stage) throws Exception {
		Parent root =
			FXMLLoader.load(getClass().getResource("HotelMainMenu.fxml"));

		Scene scene = new Scene(root);
		stage.setTitle("Hotel Management System"); // displayed in window's title bar
		stage.setScene(scene); // attach scene to stage
		stage.show(); // display the stage
		
	    stage.setOnCloseRequest(evt -> {
	        // prevent window from closing
	        evt.consume();
	    });
	}

	public static void main(String[] args) throws FileNotFoundException {
		createFiles();
		// create a HotelMainMenu object and call its start method
		launch(args);
	}
	
	static void createFiles() throws FileNotFoundException {
		File flightFile = new File(System.getProperty("user.dir") + "/ServiceLog.txt");
		
		// if file doesn't exists, then create it
		if (!flightFile.exists()) {
			try {
				flightFile.createNewFile();
				Formatter output = new Formatter(flightFile);
				output.format("%-10s %-10s %-10s %-10s %s", "DateAdd", "RoomNum", "RoomType", "Request", "DateCompleted");
				output.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		File reservationFile = new File(System.getProperty("user.dir") + "/CleaningLog.txt");
		
		// if file doesn't exists, then create it
		if (!reservationFile.exists()) {
			try {
				reservationFile.createNewFile();
				Formatter output = new Formatter(reservationFile);
				output.format("%-10s %-10s %-10s %s", "DateAdd", "RoomNum", "RoomType", "DateComplete");
				output.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		File guestFile = new File(System.getProperty("user.dir") + "/guests.txt");
		
		// if file doesn't exists, then create it
		if (!guestFile.exists()) {
			try {
				guestFile.createNewFile();
				Formatter output = new Formatter(guestFile);
				output.format("%-10s %-10s %-10s %-10s %s%n", "Name", "Username", "Password", "Email", "Phone");
				output.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		File employeeFile = new File(System.getProperty("user.dir") + "/employees.txt");
		
		// if file doesn't exists, then create it
		if (!employeeFile.exists()) {
			try {
				employeeFile.createNewFile();
				Formatter output = new Formatter(employeeFile);
				output.format("%-10s %-10s %-10s %-10s %-10s %s%n", "Name", "Role", "Username", "Password", "Email", "Phone");
				output.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
//		File folder = new File(System.getProperty("user.dir") + "/Reservations/");
//		
//		// if folder doesn't exists, then create it
//		if (!folder.exists()) {
//			folder.mkdirs();
//		}
	}
}