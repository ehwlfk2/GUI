package swing.book.basic;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class SwingFramePaint extends JFrame {
	
	/**
	 * Version. First Read Book
	 */
	private static final long serialVersionUID = 459745296914229287L;
	private static int xval = 0;
	
	SwingFramePaint(String title) {
		super(title);
	}
	
	public static void main(String[] args) {
		System.out.println("Example 3-6");
		
		// frame 생성
		SwingFramePaint frame = new SwingFramePaint("Frame paint example");
		
		// frame 속성
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		while(true) {
			xval += 2;
			
			if(xval == 250) {
				xval = 0;
			}
			
			frame.repaint();
			
			try {
				Thread.sleep(100);
			}catch(Exception e) {
				// do noting
			}
		}
	} // main
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		// 배경
		g.setColor(Color.white);
		g.fillRect(0, 0, 500, 500);
		
		// 박스
		g.setColor(Color.red);
		g.fillRect(xval, 50, 50,50);
	}
}
