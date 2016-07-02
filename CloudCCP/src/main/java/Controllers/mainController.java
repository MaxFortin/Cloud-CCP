package Controllers;

import Window.MainStage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class mainController {
	@FXML
	private Button testButton;
	
	public void handle() {
		testButton.setOnAction(new EventHandler<ActionEvent>() {
			
            @Override
            public void handle(ActionEvent event) {
            	
            }
        });
		
	}
public void flip(){
		MainStage stage = (MainStage) testButton.getScene().getWindow();
		stage.changeScene();
}	

}
