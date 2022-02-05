package swing.book.hanoi;

import java.awt.Color;
import java.awt.Graphics;

/**
 * @Class Disk
 * 1. 원판을 그리기 위한 클래스.
 * 2. 원판끼리 비교할 크기 값과 그림을 그릴 메소드 필요.
 * 
 * @Field
 * 3. 비교에 활용되는 필드 level.
 * 
 * @Method
 * 4. level에 맞게 사각형을 그릴 draw 메소드를 정의.
 */
public class Disk {
	int level;
	
	private Disk(int n){
		level = n;
	}
	
	public static Disk make(int n) {
		// 1 <= Range <= 5
		if(-1 <= n && n <= 5) 
			return new Disk(n);
		return null;
	}
	
	// 원판 중심 좌표 (x, y)
	void draw(Graphics g, int x, int y) {
		// 짝수 레벨이면 blue, 홀수 레벨이면 red.
		if(level % 2 == 0)
			g.setColor(Color.blue);
		else
			g.setColor(Color.red);
		
		// 원판 사이즈
		int width = level * 30 + 30;
		// 원판 그리기
		g.fillRect(x - width/2, y, width, 30);
		
		// 원판의 테두리, black
		g.setColor(Color.black);
		g.drawRect(x - width/2, y, width, 30);	
	}
}
