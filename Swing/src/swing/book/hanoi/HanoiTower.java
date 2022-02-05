package swing.book.hanoi;

import java.awt.Dimension;

import javax.swing.JFrame;

public class HanoiTower {

	
	public static void main(String[] args) {
		System.out.println("main method run.");
		
		// window 생성
		JFrame window = new JFrame();
		
		// windowSize 생성
		Dimension windowSize = new Dimension(800,400);

		// window 속성
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setTitle("Hanoi tower");
		// window.setSize(windowSize);
		
		/** @Class CanvasEjtd
		 *  1. 응용 프로그램이 그릴 수 있는 화면 영역.
		 *  2. 응용 프로그램이 사용자로부터 입력 이벤트를 걸다.
		 *  3. 사용자 지정 그래픽을 수행하기 위해 paint method를 반드시 Overriding 해야 한다.
		 */
		
		Canvas canvas = new Canvas();
		canvas.setPreferredSize(windowSize);
		
		
		// Frame과 Canvas 연결
		window.getContentPane().add(canvas);
		// pack method : window Size를 내부 Component의 크기로 맞춤.
		window.pack();
		
		window.setVisible(true);
	}
}
