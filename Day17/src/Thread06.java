import java.awt.Toolkit;

class BeepThread extends Thread{
	// 문제)이클립스 메뉴로 Thread조상클래스의 run()메서드를 오버라이딩
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=1;i<=5;i++) {
			toolkit.beep();//비프음 발생
			try {Thread.sleep(500);}catch(Exception e) {} //0.5초 간격으로 비프음을 발생
		}
	}
}
public class Thread06 {
	public static void main(String[] args) {
		Thread th = new BeepThread();//조상 타입으로 업캐스팅하면서 스레드 객체 생성
		th.start();//스레드 시작
		for(int i =1; i<=5;i++) {
			System.out.println("띵");
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}

}
