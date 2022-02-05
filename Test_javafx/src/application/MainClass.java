package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class MainClass extends Application{
	
	public static void main(String[] args) {
		
		// 실행
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		// 창 제목 설정
		primaryStage.setTitle("아라비안 도적단");
		
		// 버튼 만들기
		Button button = new Button();
		button.setText("문");
		
		// 버튼 이벤트 처리
		button.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				Alert alert = new Alert(AlertType.INFORMATION);
				
				alert.setTitle("주문");
				alert.setContentText("열려라 참깨!!!");
				alert.setHeaderText(null);
				alert.show();
			}
		});
		
		// 판
		StackPane sp = new StackPane();
		sp.getChildren().addAll(button);
		
		// 창 설정
		primaryStage.setScene(new Scene(sp,500,300));
		primaryStage.show();
	}
	
}
