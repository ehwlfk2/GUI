package swing.book.hanoi;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * 2단계. 키보드로 원판 이동시키기
 */
public class MyKeyListener implements KeyListener {

	Canvas canvas;

	public MyKeyListener(Canvas canvas) {
		this.canvas = canvas;
	}

	@Override
	public void keyTyped(KeyEvent e) {	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println(e.getKeyCode());	
	}

	@Override
	public void keyReleased(KeyEvent e) {	}

}
