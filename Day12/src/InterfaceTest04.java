interface Ihello04{
	/*
	 * 인터페이스 특징)
	 * 1. 인터페이스의 조상은 없고, 생성자를 가질 수 없다.
	 */
//	Ihello04(){}
	void sayHello(String name);
}
abstract class GoodBye04{
	GoodBye04(){}//추상클래스에는 생성자가 올 수 있다.
	
	public abstract void sayGoodBye(String name);
}
class SubClass04 extends GoodBye04 implements Ihello04{

	/* 
	 * 1. 조상인터페이스를 구현 상속한 자손클래스에서 반드시 조상의 추상메서드를 오버라이딩을 해야 자손 클래스 객체생성을 할 수 있다.
	 */
	@Override
	public void sayHello(String name) {
		System.out.println(name+"분 반갑습니다.");
	}
	
	@Override
	public void sayGoodBye(String name) {
		System.out.println(name+"분 잘가세요.");
	}
	
}
public class InterfaceTest04 {

	public static void main(String[] args) {

		SubClass04 sc = new SubClass04();
		sc.sayHello("세종대왕님");
		sc.sayGoodBye("신사임당님");
	}

}
