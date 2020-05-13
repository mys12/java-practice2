abstract class Phone{
	String owner;
	
	Phone(String owner){
		this.owner=owner;
		
	}//추상클래스에도 일반 멤버변수, 메서드, 생성자가 올 수 있다.
	
	void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}//Phone class

class SmartPhone extends Phone{
	SmartPhone(String owner){
		super(owner);//조상 추상클래스의 생성자 호출
	}
	void find() {
		System.out.println("인터넷을 검색합니다.");
	}
	void prName() {
		System.out.println("소유주 : "+owner);
	}
}
public class AbsTest11 {

	public static void main(String[] args) {

		/*
		 * 문제) SmartPhone의 객체 sp를 생성하면서 소유주를 홍길동으로 저장한다.
		 * turnOn(), turnOff()메서드는 상속 받아서 호출하고, find()메서드를 호출 소유주를 출력하는 메서드
		 */
		SmartPhone sp = new SmartPhone("홍길동");
		sp.turnOn();
		sp.find();
		sp.prName();
		sp.turnOff();
	}

}
