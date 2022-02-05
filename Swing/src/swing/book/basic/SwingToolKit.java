package swing.book.basic;

import javax.swing.JFrame;

public class SwingToolKit {
	/**
	 * @Field
	 * setSize, setResizable, setLocation, setVisible, setDefaultCloseOperation
	 */
	public static void main(String[] args) {
		System.out.println("Example 3-1");
		
		// frame 생성
		JFrame frame1 = new JFrame("First frame");
		JFrame frame2 = new JFrame("Second frame");

		// frame size 결정 : 가로, 세로
		frame1.setSize(300, 100);
		frame2.setSize(300, 200);

		// frame 창 크기 변경 불가 : default is true.
		frame1.setResizable(false);		
		System.out.println("frame1 Resizable : " + frame1.isResizable());
		System.out.println("frame2 Resizable : " + frame2.isResizable() + " (default)");

		// frame 위치
		frame1.setLocation(600, 600);
		frame2.setLocation(400, 400);

		// frame 이 보여지는 여부 : default is false.
		frame1.setVisible(true);
		frame2.setVisible(true);
		
		// frame1 을 종료시킬 때 행동 : default is HIDE_ON_CLOSE.
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		System.out.println("frame1 DefaultCloseOperation : " + frame1.getDefaultCloseOperation());
		System.out.println("frame2 DefaultCloseOperation : " + frame2.getDefaultCloseOperation() + " (default)");
	}
}
