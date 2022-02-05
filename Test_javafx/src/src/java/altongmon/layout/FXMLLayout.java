package src.java.altongmon.layout;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class FXMLLayout extends Application {

	@FXML
	Button button;
	
	@FXML
	public void okClicked() {
		System.out.println(Thread.currentThread().getName() + ": OK button clicked");
		Platform.exit();
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println(Thread.currentThread().getName() + ": start method...");
		
		// Layout Container Parent 생성: FXML layout
		// Parent -> Node -> Object
		Parent root = FXMLLoader.load(getClass().getResource("textApp.fxml"));
		
		// Scene 생성: Root Container 으로 root 지정.
		Scene scene = new Scene(root);
		
		// Stage 속성 설정: Title, Scene, show
		primaryStage.setTitle("Text App of FXML layout");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
