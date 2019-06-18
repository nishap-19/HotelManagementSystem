import java.io.IOException;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SignIn {

	ArrayList<Guest> guests = HotelDataAccess.getGuestData();
	ArrayList<Employee> employees = HotelDataAccess.getEmployeeData();
	
    @FXML
    private TextField usernameTextField;

    @FXML
    private PasswordField passwordTextField;

    @FXML
    void login(ActionEvent event) throws IOException {
    	String username = usernameTextField.getText(), password = passwordTextField.getText();
    	boolean found = false;
    	User foundUser = new User();
    	
    	for(int x = 0; x < employees.size(); x++) {
    		Employee e = employees.get(x);
    		User u = e.getUserData();
    		if(username.equals(u.getUsername()))
    				if(password.equals(u.getPassword())) {
    					found = true;
    					foundUser = u;
    					break;
    				}
    	}
    	
    	if(found == false) {
    		for(int x = 0; x < guests.size(); x++) {
        		Guest g = guests.get(x);
        		User u = g.getUserData();
        		if(username.equals(u.getUsername()))
        				if(password.equals(u.getPassword())) {
        					found = true;
        					foundUser = u;
        					break;
        				}
        	}
    	}
    	
    	if(found) {
    		if(foundUser.getUserType().equals("Guest")) {
    			Parent seat_map_parent =
    					FXMLLoader.load(getClass().getResource("GuestMenu.fxml"));

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
    		else {
    			Parent seat_map_parent =
    					FXMLLoader.load(getClass().getResource("EmployeeMenu.fxml"));

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
    	else {
    		Alert confirm = new Alert(Alert.AlertType.ERROR);
			confirm.setTitle("Error");
			confirm.setContentText("Invalid Login Credentials!");
			confirm.setHeaderText(null);
			confirm.showAndWait();
			return;
    	}
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
