import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SignIn {

    @FXML
    private TextField usernameTextField;

    @FXML
    private PasswordField passwordTextField;

    @FXML
    void login(ActionEvent event) {

    }

    @FXML
    void newUser(ActionEvent event) throws IOException {
		Parent seat_map_parent =
				FXMLLoader.load(getClass().getResource("NewGuest.fxml"));

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

    @FXML
    void proceedWithoutLogin(ActionEvent event) {

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
