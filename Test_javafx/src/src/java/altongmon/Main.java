package src.java.altongmon;

public class Main {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + ": main method...");
		ParamJavaFX.start(new String[] {"--ip=192.168.0.1", "--port=55501"});
	}
}
