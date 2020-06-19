import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Frame07 extends JFrame{
	JButton btn;
	JLabel label;
	
	Frame07(){
		super("이벤트 발생3");
		this.setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		btn = new JButton("버튼 클릭");
		label = new JLabel("아직 버튼 클릭 안함.");
		btn.addActionListener(e->{
			label.setText("람다식을 통한 이벤트 처리");
		});
		panel.add(btn);
		panel.add(label);
		add(panel);
		setVisible(true);
	}
}
public class AwtSwing07 {

	public static void main(String[] args) {
		new Frame07();
	}

}
