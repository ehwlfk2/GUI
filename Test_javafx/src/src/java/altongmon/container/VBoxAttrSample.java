package src.java.altongmon.container;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBoxAttrSample extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println(Thread.currentThread().getName() + " : start method...");
		// root container 생성
		VBox root = (VBox) FXMLLoader.load(getClass().getResource("VBoxLayout.fxml"));
		System.out.println("FXML File Load Success!! : " + root);

		// scene 생성
		Scene scene = new Scene(root);
		
		// stage 솏덩
		primaryStage.setTitle("VBox Layout");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
