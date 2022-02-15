package src.java.altongmon.container;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ArchorPaneAttrSample extends Application{

	@FXML
	Button cancel;
	
	// Button Click Event
	@FXML
	public void cancelClicked() {
		System.out.println(Thread.currentThread().getName() + " : cancel button clicked");
		Platform.exit();
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// fxml 파일 로드
		Parent root = FXMLLoader.load(getClass().getResource("AnchorPaneLayout.fxml"));
		
		// Scene 생성
		Scene scene = new Scene(root);
		
		// stage 속성
		primaryStage.setTitle("AnchorPane Layout");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		// AnchorPane로 control 좌표를 배치하면 Window의 사이즈가 변해도 control의 좌표가 변하지 않는다. -> default is true.
		primaryStage.setResizable(false);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
