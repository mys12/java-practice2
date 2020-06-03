import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Frame06 extends JFrame{
	JButton btn;
	JLabel label;
	
	public Frame06() {
		setTitle("두번째 이벤트 실습");
		setSize(250,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		btn = new JButton("버튼을 누르시오");
		label = new JLabel("아직 버튼이 눌러지지 않았습니다.");
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) { //버튼을 클릭했을때 호출
				if(e.getSource() == btn) {
					label.setText("버튼이 클릭되었습니다.");
				}
			}
		});//버튼 이벤트 처리를 익명객체문법으로 한다.
		panel.add(btn);
		panel.add(label);
		
		add(panel);
		setVisible(true);
	}
}
public class AwtSwing06 {

	public static void main(String[] args) {
		new Frame06();
	}

}
