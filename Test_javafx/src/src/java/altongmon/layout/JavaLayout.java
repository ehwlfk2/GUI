package src.java.altongmon.layout;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class JavaLayout extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		/**
		 * HBox Container 생성 
		 * HBox -> Pane -> Region -> Parent -> Node -> Object
		 */
		HBox hbox = new HBox();

		/** 
		 * HBox 속성 설정: Padding, Space
		 * @Class Insets: four offsets.
		 * Padding: 안쪽 여백 설정
		 * Spacing: Control 간의 수평 간격 설정 
		 */
		hbox.setPadding(new Insets(10, 10, 10, 10)); 
		hbox.setSpacing(10);
		hbox.setAlignment(Pos.CENTER_LEFT);
		
		/**
		 * TextField Control 생성
		 * TextField -> TextInputControl -> Control -> Region -> Parent -> Node -> Object
		 * textField Control 속성 설정: Width
		 */
		TextField textField = new TextField();
		textField.setPrefWidth(300);
		
		/**
		 * Button Control 생성
		 * Button -> ButtonBase -> Labeled -> Control -> Region -> Parent -> Node -> Object
		 * button control 속성 설정: Text
		 */
		Button button = new Button();
		button.setText("OK!");
		button.setOnMouseClicked(event -> Platform.exit());
		
		/**
		 * HBox의 ObservableList 얻기
		 * ObservableList implement List, Observable
		 */
		ObservableList<Node> list = hbox.getChildren();
		
		// list에  Control 배치: textField, button
		list.add(textField);
		list.add(button);
		
		// Scene 생성: Window의 Root Container 으로  hbox 지정
		Scene scene = new Scene(hbox);
		
		// Stage 속성 설정: Title, Scene, Show
		primaryStage.setTitle("Text App of Java layout");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
