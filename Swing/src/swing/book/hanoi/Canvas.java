package swing.book.hanoi;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JComponent;

public class Canvas extends JComponent{

	/**
	 * Version. Book First Read
	 */
	private static final long serialVersionUID = -651345107450780010L;
	
	/**
	 *  @Field 
	 *  1. steps : 원판을 움직인 횟수
	 *  2. rods : 막대기들 
	 */
	int steps;
	Rod[] rods;
	
	// Construct
	Canvas(){
		steps = 0;
		
		// Rod 배열 생성
		rods = new Rod[3];
		
		// Rod 배열안에 원소 생성
		rods[0] = new Rod(115, 370, 5);
		rods[1] = new Rod(395, 370, 0);
		rods[2] = new Rod(675, 370, 0);
		
		// 원판 생성
		rods[0].init(5);
	}

	// method
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		// Graphics Font 설정, new Font(name, style, size)
		g.setFont(new Font("Consolas", Font.PLAIN, 20));
		
		// Graphics 상단에 글 입력, 좌표(30, 30)
		g.drawString("Steps: " + Integer.toString(steps), 30, 30);
		
		// Graphics Color 설정
		g.setColor(Color.black);
		
		// Graphics에 색이 채워진 사각형 생성
		g.fillRect(20, 370, 760, 30);

		// 막대기를 위해 색 변경
		g.setColor(Color.DARK_GRAY);
		
		// 막대기 그리기
		rods[0].draw(g);
		rods[1].draw(g);
		rods[2].draw(g);
	}

	
	/**
	 * 2단계. 키보드로 원판 이동시키기
	 */
	void moveDisks(int src, int dst) {
		if(!rods[src].isEmpty()) {
			Disk temp = rods[src].top();
			if(rods[dst].add(temp)) {
				rods[src].remove();
				steps++;
			}
		}
	}
}
