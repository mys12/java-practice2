import java.awt.Toolkit;

public class Thread07 {

	public static void main(String[] args) {

		/*
		 * 문제) java.lang 패키지의 Thread클래스를 익명 객체 문법으로 비프음 효과를 내어보자.
		 */
		//익명객체 스레드 코드 작성
		Thread thread = new Thread() {

			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=1;i<=5;i++) {
					toolkit.beep();
					try {Thread.sleep(1000);}catch(Exception e) {}
				}
			}
			
		};
		thread.start();
		for(int i=1;i<=5;i++) {
			System.out.println(" 띵");
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}

}
