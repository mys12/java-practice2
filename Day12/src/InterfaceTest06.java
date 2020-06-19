interface I{
	void play();
}
class B implements I{

	@Override
	public void play() {
		System.out.println("play in B class");
	}
}

class C implements I{

	@Override
	public void play() {
		System.out.println("play in C class");
	}
}

class A{
	void autoPlay(I i) { //다형성=> 상속+업캐스팅(다운캐스팅)
		i.play();//업캐스팅후 오버라이딩 된 메서드 호출
	}
}
public class InterfaceTest06 {

	public static void main(String[] args) {

		/*
		 * 문제) 오버라이딩 된 play()메서드를 각각 호출하는 문장을 완성
		 */
		A a = new A();
		
		I i = new B(); 
		a.autoPlay(i);

		i = new C();
		a.autoPlay(i);
		
//		a.autoPlay(new B());
//		a.autoPlay(new C());
		
	}

}
