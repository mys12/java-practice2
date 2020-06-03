import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Frame03 extends Frame{
	public Frame03() {
		setLayout(new BorderLayout());//보더 레이아웃 배치 관리자 설정
		
		add(new Button("Button 01"),"North");//프레임 북쪽에 배치
		add(new Button("Button 02"),"West"); //프레임 서쪽에 버튼 배치 추가
		add(new Button("Button 03"),"Center");//중앙에 버튼 추가
		add(new Button("Button 04"), "East");//동쪽에 버튼 추가배치
		add(new Button("Button 05"), "South");//남쪽에 버튼 배치 추가
		
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
public class AwtSwing03 {

	public static void main(String[] args) {
		new Frame03();
	}

}
