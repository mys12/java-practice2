import java.util.Scanner;

interface IHello03{
	public abstract void sayHello(String name);
	//public abstract을 생략할수 있다.
}
interface IGoodBye{
	void bye(String name);
}
class Son03 implements IHello03, IGoodBye{

	//인터페이스는 하나 이상의 조상으로 부터 다중상속을 받을 수 있다.
	@Override
	public void bye(String name) {
		System.out.println(name+"님 잘가~");
	}

	@Override
	public void sayHello(String name) {
		System.out.println(name+"님 안녕~");
	}
	
}
public class InterfaceTest03 {

	public static void main(String[] args) {

		/*
		 * 문제) 1. 자손 클래스의 s객체를 생성하고 스캐너를 활용하여 첫번째 홍길동 이름을 입력받아 홍길동님 안녕~을 출력되게 한다.
		 * 2. 스캐너를 활용하여 두번쨰 이름을 이순신을 입력받아 이순신님 잘가~를 출력되게 한다.
		 */
		Son03 s = new Son03();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 >> ");
		String name1 = sc.nextLine();
		s.sayHello(name1);
		
		System.out.print("이름 입력 >> ");
		String name2 = sc.nextLine();
		s.bye(name2);
		
		sc.close();
	}

}
