import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class JFrame05 extends JFrame implements ActionListener{
	//ActionListener 인터페이스는 이벤트를 처리해 준다.
	
	private JButton button;//스윙 버튼은 AWT Button 이름 앞에 접두어 J를 붙인다.
	private JLabel label;//JLabel은 설명을 덧붙일때 사용하는 컴포넌트
	
	public JFrame05() {
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//스윙 프레임 윈도우 닫기
		setTitle("스윙 이벤트 실습 01");//스윙 프레임 윈도우 제목 설정
		
		JPanel panel = new JPanel();//스윙 JPanel()은 각 UI 객체를 그룹화 시켜 배치시키는 레이아웃
		//결국은 윈도우 안에 패널기준으로 배치 시켜야 한다.
		button = new JButton("버튼을 클릭하세요.");
		label = new JLabel("아직 버튼이 클릭되지 않았습니다.");
		button.addActionListener(this);//버튼 이벤트 등록
		panel.add(button); panel.add(label);//패널에 각 컴포넌트 추가
		
		add(panel);//윈도우에 패널 추가
		setVisible(true);//스윙 윈도우를 항상 보이게 함
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {//발생한 이벤트 소스 객체가 버튼 객체와 같다면
			label.setText("버튼이 클릭됨");
		}
	}//버튼을 클릭 했을때 호출
	
}
public class AwtSwing05 {

	public static void main(String[] args) {
		new JFrame05();
	}

}
