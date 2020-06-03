import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Frame04 extends Frame{
	Frame04(){
		setLayout(new GridLayout(3,2));//3행 *2열의 그리드 레이아웃
		
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
	}
}
public class AwtSwing04 {

	public static void main(String[] args) {
 
		new Frame04();
	}

}
