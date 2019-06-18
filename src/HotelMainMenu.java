import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HotelMainMenu {

	@FXML	//closes HotelReservationSystem
	void exitProgram(ActionEvent event) {
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stage.close();	//terminates the window of the GUI
	}
	
	@FXML	//allows user to sign in
	void login(ActionEvent event) throws IOException {
		Parent seat_map_parent =
				FXMLLoader.load(getClass().getResource("SignIn.fxml"));

			Scene seat_map_scene = new Scene(seat_map_parent);
			Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();   	    
			stage.setTitle(" "); // displayed in window's title bar
			stage.setScene(seat_map_scene); // attach scene to stage
			stage.show(); // display the stage
			
		    stage.setOnCloseRequest(evt -> {
		        // prevent window from closing
		        evt.consume();
		    });
	}
}