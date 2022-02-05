package src.java.altongmon;

import java.util.List;
import java.util.Map;

import javafx.application.Application;
import javafx.stage.Stage;

public class ParamJavaFX extends Application{
	public ParamJavaFX() {
		super();
		System.out.println(Thread.currentThread().getName() + ": App Contruct...");
	}

	@Override
	public void init() throws Exception {
		super.init();
		System.out.println(Thread.currentThread().getName() + ": init method...");
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println(Thread.currentThread().getName() + ": start method...");
		
		Parameters param = getParameters();
		List<String> list = param.getRaw();
		Map<String, String> map = param.getNamed();
		
		System.out.println("list is : " + list);
		System.out.println("map is : " + map);
		
		primaryStage.close();
	}
	
	String mapToString(Map<String, String> map) {
		
		return null;
	}
	
	@Override
	public void stop() throws Exception {
		super.stop();
		System.out.println(Thread.currentThread().getName() + ": stop method...");
	}
	
	public static void start(String[] args){
		System.out.println(Thread.currentThread().getName() + ": start method...");
		launch(args);
	}
}
