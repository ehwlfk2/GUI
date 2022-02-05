package src.java.altongmon.layout;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class MarginPadding extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		// Inset 설정: top, right, bottom, left
		Insets inset = new Insets(50, 10, 10, 50);
		
		// HBox 생성 -> Pane -> Region -> Parent -> Node -> Object
		HBox hbox = new HBox();
		
		// button 생성
		Button button = new Button();

		// button의 size 설정: prefWidth, prefHeight
		button.setPrefSize(200, 100);
		
		/* Choice One */
		// 1. Padding 설정
		// hbox.setPadding(inset);
		// 2. Margin
		HBox.setMargin(button, inset);
		
		
		// button을 hbox안에 삽입
		hbox.getChildren().add(button);
		
		// Scene 생성
		Scene scene = new Scene(hbox);
		
		// Stage 설정
		primaryStage.setTitle("Margin_Padding");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
