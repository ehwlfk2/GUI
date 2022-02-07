package src.java.altongmon.eventHandler;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class EventHandlerSample extends Application{
	String threadName() {
		return Thread.currentThread().getName() + " >> ";
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		// HBox 생성: root
		HBox hbox = new HBox();
		// HBox 속성: Size(Width, Height), Alignment, Spacing
		hbox.setPrefSize(800, 400);
		hbox.setAlignment(Pos.CENTER);
		hbox.setSpacing(20);
		
		// Button 1, 생성 및 속성: Size(Width, Height), EventHandler
		Button btn1 = new Button("button 1");
		btn1.setPrefSize(100, 50);
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				System.out.println(threadName() + "button 1 process!! : " + event);
			}
		});
		
		// Button 2, 생성 및 속성 : Size, EventHandler
		Button btn2 = new Button("button 2");
		btn2.setPrefSize(50, 100);
		// lambda style...
		btn2.setOnAction(event -> System.out.println(threadName() + "button 2 process!! : " + event));
		
		// TableView 행을 클릭할 때 발생하는 MouseEvent를 처리하는 EventHandler<MouseEvent>를 등록
		TableView<String> tableView = new TableView<String>();
		tableView.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				System.out.println(threadName() + "TableView Click process!! : " + event);
			}
		});
		
		// hbox에 button 달기
		hbox.getChildren().addAll(btn1, btn2, tableView);
		
		// Scene 생성 및 Stage 솎성
		Scene scene = new Scene(hbox);
		primaryStage.setTitle("EventHandler Sample");
		primaryStage.setScene(scene);
		// Exit event handler!
		primaryStage.setOnCloseRequest(event -> System.out.println(threadName() + "program exit..."));
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
