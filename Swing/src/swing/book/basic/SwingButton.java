package swing.book.basic;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingButton {

	/**
	 * @Class JButton
	 * JButton(String), setText(String), addActionListener(ActionListener)
	 */
	public static void main(String[] args) {
		System.out.println("Example 3-7");
		
		// Frame 생성
		JFrame frame = new JFrame("Button example");
		
		// Frame 속성
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Container 설정
		Container container = frame.getContentPane();
		
		// setLayout(LayoutManager), Container의 Layout 설정
		container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
		
		// container에 넣을 Panel 생성
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		// 상단 패널, panel1 색상 설정
		panel1.setBackground(Color.white);
		
		// container에 panel 입력
		container.add(panel1);
		container.add(panel2);
		
		// button 생성
		JButton button1 = new JButton("button 1");
		JButton button2 = new JButton("button 2");
		
		// 하단 패널, panel2에 버튼 입력
		panel2.add(button1);
		panel2.add(button2);
		
		/**
		 * Paints each of the components in this container.
		 * 이 컨테이너의 각 구성 요소를 그립니다.
		 * @param     g   the graphics context.
		 * @see       Component#paint
		 * @see       Component#paintAll
		 */
		frame.paintComponents(frame.getGraphics());
		
		// button의 타이틀 설정
		button1.setText("Red");
		button2.setText("Green");
		
		SwingButton.addActionListener(button1, panel1, Color.red);
		SwingButton.addActionListener(button2, panel1, Color.green);
	}
	
	static void addActionListener(JButton button, JPanel panel, Color color){
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent event) {
				System.out.println("event : " + event);
				
				panel.setBackground(color);
			}
		});
	}
}
