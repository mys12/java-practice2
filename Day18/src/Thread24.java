class MovieThread01 extends Thread{

	@Override
	public void run() {
		/*
		 * 문제 1)인터럽트를 호출했을때 스레드 종료 하는 코드를 작성
		 */
		//how 1
		try {
			while(true) {
				System.out.println("동영상 재생");
				Thread.sleep(1);
			}
		} catch (InterruptedException e) {}
		//how 2
//		if(this.isInterrupted()) {//==true가 생략됨, 해당 스레드가 인터럽트가 발생되면 참
//			break;
//		}
	}
}


public class Thread24 {

	public static void main(String[] args) {
		Thread th = new MovieThread01();
		th.start();

		try {Thread.sleep(1000);}catch(InterruptedException e) {}
		th.interrupt();
	}

}
