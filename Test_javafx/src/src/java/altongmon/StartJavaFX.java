package src.java.altongmon;


import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class StartJavaFX extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Parent의 하위 객체인 VBox 생성
		VBox root = new VBox();
		
		// VBox 속성 설정: Width, Height, Align, Space
		root.setPrefWidth(600);
		root.setPrefHeight(300);
		// Control을 중앙으로 정렬
		root.setAlignment(Pos.CENTER);
		// Control의 수직 간격
		root.setSpacing(20);
		
		// Label Control 생성
		Label label = new Label();
		// Label 속성 설정: text, font
		label.setText("start JavaFX");

		// Button Control 생성
		Button button = new Button();
		
		// Button 속성 설정: Text, ClickEvent
		button.setText("OK");
		button.setOnMouseClicked(event -> Platform.exit());
		button.setPrefWidth(50);
		button.setPrefHeight(50);
		
		// VBox에 Control 추가: Label, Button
		root.getChildren().add(button);
		root.getChildren().add(label);
		
		// VBox를 root Container로 해서 Scene 생성
		Scene scene = new Scene(root);
		
		// primaryStage 속성 설정: Title, Scene, show
		primaryStage.setTitle("Hello JavaFX");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
