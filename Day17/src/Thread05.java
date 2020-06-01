import java.awt.Toolkit;

public class Thread05 {

	public static void main(String[] args) {
		//익명 클래스로 스레드 발생 => 외부 클래스$번호.class
		/*
		Thread thread = new Thread(new Runnable(){

			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=1;i<=5;i++) {
					toolkit.beep();
					try {Thread.sleep(1000);}catch(Exception e) {}
				}
			}
		});//첫번째 익명 객체로 스레드 발생
		*/
		//자바 8버전에서 추가된 람다식(함수형언어)을 사용한 스레드
		Thread thread = new Thread(()-> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i=0;i<5;i++) {
				toolkit.beep();
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
		});
		thread.start();//스레드가 시작되고 내부적으로 run()메서드 자동 호출
		for(int i =1; i<=5; i++) {
			System.out.println("띵");
			try {Thread.sleep(1000);}catch(Exception e) {}//1초 간격으로 출력
		}
	}

}
