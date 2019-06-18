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

public class NewGuest {

    @FXML
    private TextField firstNameTextField;

    @FXML
    private TextField lastNameTestField;

    @FXML
    private TextField phoneTextField;

    @FXML
    private TextField emailTextField;

    @FXML
    private TextField usernameTextField;

    @FXML
    private PasswordField passwordTextField;

    @FXML
    void createAccount(ActionEvent event) {

    }

    @FXML
    void returnToHome(ActionEvent event) throws IOException {
		Parent parent =
				FXMLLoader.load(getClass().getResource("HotelMainMenu.fxml"));

			Scene scene = new Scene(parent);
			Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();   	    
			stage.setTitle(" "); // displayed in window's title bar
			stage.setScene(scene); // attach scene to stage
			stage.show(); // display the stage
			
		    stage.setOnCloseRequest(evt -> {
		        // prevent window from closing
		        evt.consume();
		    });
    }

}
