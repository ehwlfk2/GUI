package swing.book.hanoi;

import java.awt.Graphics;

// The top of Hanoi's Rod
public class Rod {
	
	// field : centerX, centerY는 막대기의 위치 좌표를 정의하며 막대기 윗변의 중점을 기준으로 설정.
	int centerX, centerY, diskNum;
	// 막대기에 넣어져 있는 원판
	Disk[] disks;
	
	// Rod Construct : 위치 좌표를 초기화
	Rod(int x, int y, int n){
		centerX = x;
		centerY = y;
		disks = new Disk[n];
	}
	
	void init(int n) {
		diskNum = n;
		for(int i = 0 ; i < diskNum; i++)
			disks[i] = Disk.make(diskNum-i);
	}
	
	/**
	 * @method draw
	 * 1. fillRect method를 이용하여 막대기 사각형을 그린다.
	 * 2. g.fillRect(x, y, width, height)
	 */
	void draw(Graphics g) {
		g.fillRect(centerX-15, 50, 30, 320);
		for(int i = 0 ; i < diskNum;i++) {
			int y = centerY - 30 * (i + 1);
			disks[i].draw(g, centerX, y);
		}
	}
	
	/**
	 * 2단계. 키보드로 원판 이동시키기
	 */
	boolean isEmpty() {
		if(diskNum > 0)
			return false;
		else 
			return true;
	}
	
	Disk top() {
		if(!isEmpty()) 
			return disks[diskNum-1];
		else {
			Disk d = Disk.make(-1);
			return d;
		}
	}
	
	boolean add(Disk d) {
		if (isEmpty()) {
			disks[diskNum++] = d;
			return true;
		} else if (disks[diskNum - 1].level > d.level) {
			disks[diskNum++] = d;
			return true;
		} else
			return false;
	}
	
	boolean remove() {
		if (!isEmpty()) {
			disks[--diskNum] = null;
			return true;
		} else
			return false;

	}
}
