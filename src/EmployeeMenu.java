import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EmployeeMenu {
    
    @FXML
    void reserveConferenceRoom(ActionEvent event) {

    }


    @FXML
    void roomReservation(ActionEvent event) {

    }

    @FXML
    void viewEmployeeData(ActionEvent event) {

    }

    @FXML
    void viewReservations(ActionEvent event) {

    }

    @FXML
    void viewCleaningLog(ActionEvent event) {

    }
    
    @FXML
    void cleaningHelp(ActionEvent event) {

    }

    @FXML
    void viewServiceLog(ActionEvent event) {

    }
    
    @FXML
    void maintenanceHelp(ActionEvent event) {

    }
	
	@FXML
    void returnToHome(ActionEvent event) throws IOException {
		Parent parent =
				FXMLLoader.load(getClass().getResource("HotelMainMenu.fxml"));

			Scene scene = new Scene(parent);
			Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();   	    
			stage.setTitle("Airline Reservation System"); // displayed in window's title bar
			stage.setScene(scene); // attach scene to stage
			stage.show(); // display the stage
			
		    stage.setOnCloseRequest(evt -> {
		        // prevent window from closing
		        evt.consume();
		    });
    }
}
