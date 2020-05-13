import net.daum.model.Animal;
import net.daum.model2.*;

public class AbsTest12 {

	public static void main(String[] args) {

		/*
		 * 문제 ) 1. net.daum.model패키지에는 Animal이라는 추상 클래스를 정의하고 추상 메서드 sound() 정의
		 * 2. net.daum.model2패키지에는 Animal이라는 추상 클래스를 상속받은 첫 번재 자손 클래스 Dog를 만들고 
		 * 추상메서드를 오버라이딩 한 다음 실행문장으로 멍멍이 출력되는 코드를 완성 
		 * 3. net.daum.model2패키지에 Animal이라는 추상 클래스를 상속 받은 두번째 자손 클래스 Cat을 만들고 
		 * 추상메서드를 오버라이딩 해서 실행 문장으로 야옹이 출력되는 코드를 완성
		 * 4. main()에서 배열크기가 2인 Animal 클래스 객체 배열 arr을 생성하고 각 배열원소로 자손클래스 객체를 저장한 다음
		 * 일반 for 반복문을 사용해서 각각의 출력문장을 출력
		 */
		Animal[] animal = new Animal[2];
		animal[0] = new Dog();
		animal[1] = new Cat();
		
		for(int i=0; i<animal.length; i++) {
			System.out.print("동물 소리 >> ");
			animal[i].sound();
		}
		
//		for(Animal a : animal) {
//			System.out.print("동물 소리 >> ");
//			a.sound();
//		}
		System.out.println();
		System.out.println("-----------------------------------");
		System.out.println();
		
		/*
		 * 문제) Animal 타입 참조변수 a를 선언하고 각각의 자손을 업캐스팅 한 다음 다시 instanceof 연산자를 활용하여
		 * 다운 캐스팅을 하여 오버라이딩을 한 메서드를 호출해서 멍멍, 야옹을 출력
		 */
		
		Animal a = new Dog();//업캐스팅
		if(a instanceof Dog) { // 다운캐스팅
			Dog d = (Dog)a;
			d.sound();
		}
		a = new Cat();
		if(a instanceof Cat) {
			Cat c = (Cat)a;//명시적인 다운캐스팅
			c.sound();
		}
		System.out.println();
		ref(new Dog());
		ref(new Cat());
	}//main()
	static void ref(Animal a) {//다형성
		a.sound();
		
	}

}
