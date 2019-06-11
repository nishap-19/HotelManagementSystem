/* Name: Nisha Patel
 * Project Due: April 19
 * Project Name: Airline Reservation System Assignment
 * Instructor: Topsakal
 * Course: COP3330C.03
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
		// create a AirlineReservation object and call its start method
		launch(args);
	}
}