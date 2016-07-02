package Window;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MainStage extends Stage {
	
	Scene currentScene;
	Scene loginScene;
	Scene mainScene;
	
	Pane loginPane;
	Pane mainPane;
	
	boolean onLogin;
	
	public MainStage() throws IOException{
		
		loginPane = FXMLLoader.load(getClass().getResource("LoginScene.fxml"));
		mainPane = FXMLLoader.load(getClass().getResource("MainScene.fxml"));
		
		loginScene = new Scene(loginPane);
		mainScene = new Scene(mainPane);
		
		onLogin = true;

		currentScene = loginScene;
		
		setMaxHeight(800);
		setMaxWidth(800);
		
		setScene(loginScene);

	}
public void changeScene(){
	
	if(onLogin){
		setScene(mainScene);
		onLogin = false;
	}
	else{
		setScene(loginScene);
		onLogin = true;
		
	}
}

	
}
