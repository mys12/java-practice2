class Aa{}
class Bb extends Aa{}
class C extends Aa{}
class D extends Bb{}
class E extends C{}

public class ConsTest09 {

	public static void main(String[] args) {

		Bb b = new Bb();
		C c = new C();
		D d = new D();
		E e = new E();
		
		Aa a1 = b;//업캐스팅
		Aa a2 = c;
		Aa a3 = d;
		Aa a4 = e;
		
		Bb b1 = d;
		C c1 = e;
		
//		B b3=e;//상속관계가 아니라서 업캐스팅 불가
//		C c2=d;
	}

}
