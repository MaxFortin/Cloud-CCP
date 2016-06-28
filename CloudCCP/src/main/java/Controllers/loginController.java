package Controllers;

import Server.LoginConnection;
import Window.MainStage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class loginController {
	@FXML
	private Button submit;
	@FXML
	private TextField usernameField;
	@FXML
	private PasswordField passwordField;

	public void handle() {
		submit.setOnAction(new EventHandler<ActionEvent>() {
			
            @Override
            public void handle(ActionEvent event) {
            	LoginConnection login = new LoginConnection("Max","maxiscool"); 
            	System.out.println(login.login());
            }
        });
		
	}
	public void flip(){
		MainStage stage = (MainStage) submit.getScene().getWindow();
		stage.changeScene();
	}
}
