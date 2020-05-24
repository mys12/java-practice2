
public class InterfaceTest08 {

	public static void main(String[] args) {

		RemoteControl rc;//인터페이스로 참조변수 선언
		rc = new Tv();//업캐스팅
		rc.turnOn();
		rc.setVolume(7);
		rc.turnOff();
		System.out.println("=====================");
		rc = new Audio();//업캐스팅
		rc.turnOn();
		rc.setVolume(12);
		rc.turnOff();
		System.out.println("----------------------");
		
		RemoteControl rc2 = new RemoteControl() {

			/*
			 * 익명클래스(내부 무명클래스) 문법이다. 이문법을 사용할 때는 자바 UI(그래픽 디자인)를 그리고 UI에서 이벤트를 처리할 때 사용
			 * 또한 메신져 프로그램 만들때 스레드 작업을 처리할 때 활용할 수 있다.
			 * 외부 클래스명$번호.class로 컴파일된다.-> InterfaceTest08$1.class
			 */
			@Override
			public void turnOn() {
				System.out.println("또 다시 tv를 켭니다");
			}

			@Override
			public void turnOff() {
				System.out.println("또 다시 tv를 끕니다.");
			}

			@Override
			public void setVolume(int volume) {
				System.out.println("다시 설정한 볼륨크기: 7");
			}
		};
		rc2.turnOn();
		rc2.setVolume(20);
		rc2.turnOff();
	}

}
