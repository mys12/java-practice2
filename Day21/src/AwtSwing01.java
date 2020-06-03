import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Frame01 extends Frame{
	//AWT Frame 윈도우를 상속받음.
	Frame01(){
		super("AWT Window");//윈도우 제목 설정
		setSize(300,200);//프레임 폭과 높이 지정
		setVisible(true);//프레임 윈도우를 항상 나오게 함
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {//현재 윈도우창 닫기 하면 호출됨
				System.exit(0);//윈도우 닫기
			}
			
		});//익명객체 문법으로 윈도우 이벤트 처리=>Frame01$1.class
	}//기본생성자
}
public class AwtSwing01 {

	public static void main(String[] args) {
		new Frame01();
	}

}
