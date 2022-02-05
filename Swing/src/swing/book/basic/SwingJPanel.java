 package swing.book.basic;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingJPanel {
	/**
	 * @Class JPanel
	 * panel, setSize, setBackground, add
	 */
	public static void main(String[] args) {
		System.out.println("Example 3-2");

		// Frame 생성
		JFrame frame = new JFrame("Example 3-2");
		Dimen d = new Dimen(300, 300);
		frame.setSize(d);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		
		d.setSize(50, 50);
		panel1.setSize(d);
		panel2.setSize(d.mul(2));
		panel3.setSize(d.mul(3));
		panel4.setSize(d.mul(4));
		
		panel1.setBackground(Color.RED);
		panel2.setBackground(Color.GREEN);
		panel3.setBackground(Color.BLUE);
		panel4.setBackground(Color.YELLOW);
		
		frame.add(panel1);
		frame.add(panel2);
		frame.add(panel3);
		frame.add(panel4);
	}
}

class Dimen extends Dimension {
	/* 
	 * Serializable을 상속하는 Class의 경우 Class의 versioning 용도로 serialVersionUID 변수를 사용한다.
	 * 이때, serialVersionUID 값을 명시적으로 지정하지 않으면 Compiler가 계산한 값을 부여하는데 Serializable Class 또는 Outer Class에 변경이 있으면 serialVersionUID 값이 바뀌게 된다.
	 * 잠재적인 문제는 Serialize 할 때와 Deserialize 할 때의 serialVersionUID 값이 다르면 InvalidClassExceptions이 발생하여 저장된 값을 객체로 Restore 할 수 없다.
	 * 
	 * 1. serialVersionUID를 지정하지 않으면 컴파일러가 계산한 값을 부여한다. 그렇다면 컴파일러에 따라 할당되는 값이 다를 수 있다는 뜻.
	 * 2. 컴파일러는 Serializable Class 혹은 Outer Class를 참고하여 만들기 때문에 만약 클래스에 변경이 있으면 serialVersionUID로 변경이 있을 수 있다.
	 * 
	 * 직렬화
	 * 1. Java에서 Serialization란 Java의 객체를 바이트의 배열로 변환을 해서 파일이나, 메모리, 데이터 베이스등이 저장을 하는 관정을 말한다.
	 * 2. 직렬화를 할 때에는 serialVersionUID 를 저장하게 되며, 객체로 다시 불러들일때는 그 값을 체크하는 용도로 사용한다.
	 * 		Object -> serialVersionUID 저장 -> Byte Array 바이트 배열
	 * 		Byte Array 바이트 배열 -> serialVersionUID 체크, 다를 경우 exception 발생! -> Object
	 * 3. serialVersionUID 값을 파일 등으로 저장할 때, 해당하는 클래스의 버전이 맞는지를 확인하는 중요한 장치.
	 * 		ex. Client가 Windows, Server가 Linux일 경우, Java VM이 다르므로 Serialization을 지정하지 않으면 VM마다 값이 다르게 설정되므로, 역직렬화를 할때 exception이 발생할 수 있다.
	 * 역직렬화
	 * 저장된 것을 다시 객체로 변화하는 과정을 역직렬화(Deserialization)라고 한다.
	 * 
	 * 결론
	 * 따라서 무족건 serialVersionUID 값을 설정하기를 권장한다.
	 */
	private static final long serialVersionUID = 1708865153352415343L;

	Dimen(int width, int height) {
		super(width, height);
	}

	public Dimension mul(int value) {
		return new Dimension((int)this.getWidth() * value, (int)this.getHeight() * value);
	}
}
