package src.java.altongmon.layout;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FXMLLoaderSample extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// FXML 파일 로딩
		Parent root = (Parent) FXMLLoader.load(getClass().getResource("textApp.fxml"));
		
		// Scene 생성
		Scene scene = new Scene(root);
		
		// Stage <- Scene
		primaryStage.setTitle("TextApp where FXMLLoader is used");
		primaryStage.setScene(scene);
		primaryStage.show();		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
