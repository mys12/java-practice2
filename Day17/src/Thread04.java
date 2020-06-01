import java.awt.Toolkit;

class BeepTask implements Runnable{

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		/*
		 * 1.java.awt 패키지는 AWT 자바 GUI를 그리는 API 클래스 묶음이 저장되어있다.
		 * 2.로컬 경로의 이미지 객체를 생성할 수 있다. 여기서는 비프음이 발생한다.(컴퓨터가 사운드가 되어야 효과를 확인)
		 * 
		 */
		for(int i=1; i<=5;i++) {
			toolkit.beep();//비프음 발생
			try {Thread.sleep(500);}catch(Exception e){}//0.5초 간격으로 비프음을 발생
		}
	}//멀티스레드 문장이 구현
	
}
public class Thread04 {

	public static void main(String[] args) {
		Runnable beepTask = new BeepTask();// 업캐스팅하면서 스레드 객체 생성
		Thread th = new Thread(beepTask);
		th.start();//스(쓰)레드 시작. 내부적으로 run()메소드 호출
		
		for(int i=1;i<=5;i++) {
			System.out.println(" 띵");
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}

}
