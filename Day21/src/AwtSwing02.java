import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Frame02 extends Frame{
	public Frame02() {
		setLayout(new FlowLayout());
		/*
		 * 플로우 레이아웃 배치 관리자는 컨테이너(레이아웃)안에 배치되는 UI컴포넌트(객체)를 위에서 아래로, 왼쪽에서 오른쪽으로 
		 * 물흐르듯 배치
		 */
		
		add(new Button("Button 01"));//프레임 윈도우에 첫번째 버튼 배치
		add(new Button("Button 02"));
		add(new Button("Button 03"));
		add(new Button("Button 04"));
		add(new Button("Button 05"));
		
		setSize(300,200);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
	}//생성자 
}
public class AwtSwing02 {

	public static void main(String[] args) {
		new Frame02();
	}

}
