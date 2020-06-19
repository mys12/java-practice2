class Parent08{
	int a=100;
	
	void m() {
		System.out.println("조상 클래스 메서드 m()");
	}
}
class Child08 extends Parent08{
	int a=200;
	int b=300;
	@Override
	void m() {
		System.out.println("a="+a);//this. 이 생략됨
		System.out.println("this.a="+this.a);//this.a로 접근할때는 자손클래스에서 선언된 멤버변수에 접근한다.
		System.out.println("super.a="+super.a); //super.a는 조상클래스에서 선언된 멤버변수가 상속되면 해당변수에 접근할때 사용한다.
//		System.out.println("super.b="+super.b); //this.b or b로 접근해야한다.
	}
	
	
}
public class ConsTest08 {
	public static void main(String[] args) {
		Parent08 p = new Child08();//업캐스팅
		p.m();
		System.out.println(p.a);
		System.out.println();
		System.out.println("---------------------------------------------");
		/*
		 * 문제) Child08 ch타입으로 다운캐스팅을 한 다음 m(), a멤버변수를 각각 호출해 원하는 값을 출력해본다.
		 * 다운캐스팅을 할때 형변환 유무 판단 연산자를 사용
		 */
		if(p instanceof Child08) {
			Child08 ch = (Child08)p;
			ch.m();
			System.out.println("ch.a = " +ch.a);
			System.out.println("ch.b = " +ch.b);
		} else {
			System.out.println("다운 캐스팅 불가능");
		}
	}
	
}
