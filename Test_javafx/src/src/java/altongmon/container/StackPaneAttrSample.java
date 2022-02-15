package src.java.altongmon.container;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StackPaneAttrSample extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// FXML FILE LOAD
		Parent root = FXMLLoader.load(getClass().getResource("StackPaneLayout.fxml"));
		
		// Scene 생성
		Scene scene = new Scene(root);

		// Stage 속성
		primaryStage.setTitle("StackPane Layout");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
