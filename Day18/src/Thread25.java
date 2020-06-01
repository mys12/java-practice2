class MovieThread2 implements Runnable{

	@Override
	public void run() {
		while(true) {
			System.out.println("동영상을 재생합니다.");
			try {Thread.sleep(1000);}catch(InterruptedException e) {}
		}//while 무한 루프문
	}//run()

	
}
public class Thread25 {

	public static void main(String[] args) {
		MovieThread2 th = new MovieThread2();
		Thread th2 = new Thread(th);
		th2.setDaemon(true);
		th2.start();
		/*
		 * 문제) 3초뒤에 메인 주 스레드가 종료되면 MovieThread2 보조 스레드가 종료 될 수 있게 데몬 스레드를 만들어본다.
		 */
		try {Thread.sleep(3000);}catch(InterruptedException e) {}
	}

}
