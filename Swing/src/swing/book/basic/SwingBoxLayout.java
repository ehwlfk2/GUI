package swing.book.basic;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingBoxLayout {
	/**
	 * @Class Layout 1. BorderLayout 2. BoxLayout << 3. CardLayout 4. FlowLayout 5.
	 *        GridBagLayout 6. GridLayout 7. GroupLayout 8. SpringLayout Third Party
	 *        Library : 프로그래머가 레이아웃을 직접 정의하거나 다양한 레이아웃을 제공.
	 */
	public static void main(String[] args) {
		System.out.println("Example 3-3");

		// Frame 생성
		JFrame frame = new JFrame("Box Layout example");

		// Frame 속성
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLocation(1000, 500);
		
		// Container 생성 : 사용자 인터페이스에 관련된 기본적인 객체들을 표현하는 최상위 클래스.
		Container container = frame.getContentPane();
		/* BoxLayout.X_AXIS, BoxLayout.Y_AXIS : 
		 * 박스가 쌓이는 방식, 
		 * 		X_AXIS : 왼쪽부터 오른쪽으로
		 * 		Y_AXIS : 아래쪽부터 위쪽으로
		 */ 
		BoxLayout boxLayout = new BoxLayout(container, BoxLayout.Y_AXIS);
		container.setLayout(boxLayout);
		
		// JPanel 생성
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		
		// Container에 Panel 삽입
		container.add(panel1);
		container.add(panel2);
		container.add(panel3);
		container.add(panel4);
		
		/* Panel 크기 정의
		 * setSize : 레이아웃 관리자 없이 부모 내부에 구성 요소가 있는 경우 setSize()를 호출.
		 * 		-> 구성 요소의 부모가 레이아웃 관리자를 사용하는 경우 setSize()는 아무것도 하지 않을 것.
		 * 		-> 일반적으로, JFrames 및 JWindows 같은 최상위 구성 요소 및 scrolled panes 내부에 있는 항복에 영향을 미친다.
		 * setPreferredSize : 
		 * 		-> 일반적으로, 레이아웃 관리자가 있을 때, 올바른 일을 수행한다.
		 * 		-> 레이아웃 관리자는 구성 요소의 기본 (최소 및 최대 크기) 크기를 얻은 다음 setSize() 및 setLocation()를 사용하여 레이아웃 규칙에 따라 해당 구성 요소를 배치.
		 * 		-> 예를 들어, Border Layout는 "north" 영역의 경계를 북쪽 구성 요소의 preferred size와 동일하게 만들려고 시도한다.
		 * 			이때, jframe의 크기에 따라 그보다 더 크거나 작을 수 있다...
		 */
		panel1.setPreferredSize(new Dimension(50, 50));
		// panel1.setSize(new Dimension(50, 50)); // 제대로 동작하지 않는다.
		panel2.setPreferredSize(new Dimension(100, 100));
		panel3.setPreferredSize(new Dimension(150, 150));
		panel4.setPreferredSize(new Dimension(200, 200));
		
		// Panel 색상 정의
		panel1.setBackground(Color.red);
		panel2.setBackground(Color.green);
		panel3.setBackground(Color.blue);
		panel4.setBackground(Color.yellow);
	}
}
