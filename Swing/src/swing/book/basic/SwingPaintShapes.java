package swing.book.basic;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class SwingPaintShapes extends JFrame{
	
	/**
	 * Version. First Read Book
	 */
	private static final long serialVersionUID = 1632452383708951342L;

	public SwingPaintShapes(String title) {
		super(title);
	}
	
	public static void main(String[] args) {
		System.out.println("Example 3-5");
		
		// 상속 받은 Class를 통해 Frame 생성
		SwingPaintShapes frame = new SwingPaintShapes("Frame Paint Example");
		
		// frame 속성 : 크기, 위치, 창 보이기 옵션, 닫기옵션
		frame.setSize(250, 250); 
		frame.setLocation(500, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// paint() method를 직접 호출, 이 때 필요한 객체 인자를 JFrame의 getGraphics() method를 통해 객체를 호출할 수 있다.
		frame.paint(frame.getGraphics());
	}
	
	/**
	 * Component 클래스를 상속하거나 상속받은 클래스를 상속하는 경우
	 * - 'paint()' and 'repaint()' method 활용
	 * - Component 내부에 직선, 원, 사각형 등의 다른 구성 요소들을 그릴 수 있다.
	 * - draw 속을 비워서 그린다. fill 속을 채워서 그린다.
	 * - Rect : 사각형, Oval : 타원
	 */
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		g.setColor(Color.black);
		g.fillRect(0, 0, 250, 250);
		
		g.setColor(Color.white);
		g.drawRect(150, 50, 50, 50);
		
		g.setColor(Color.red);
		g.drawOval(50, 50, 50, 50);
		
		g.setColor(Color.yellow);
		g.fillRect(50, 150, 50, 50);
		
		g.setColor(Color.blue);
		g.fillOval(150, 150, 50, 50);
	}
}
