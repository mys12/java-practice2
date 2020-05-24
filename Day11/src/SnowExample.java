import net.daum.model.Tire;
import net.daum.model2.SnowTire;

public class SnowExample {

	public static void main(String[] args) {

		/*
		 * 문제) 1. net.daum.model 패키지에 Tire라는 클래스를 정의하고 void run(){}메서드를 만들고
		 * 실행결과값으로 "일반 타이어가 굴러갑니다."
		 * 2. net.daum.model2패키지에 Tire 를 상속받은 자손 클래스 SnowTire를 만들고 run()메서드를
		 * 오버라이딩을 한다. 실행문장으로 "스노우 타이어가 굴러값니다."
		 * 3. main(){}에서 업캐스팅한 tire 객체를 만든 다음 instanceof 연산자를 활용하여 다운캐스팅한 
		 * snowTire 객체를 생성해서 오버라이딩한 메서드를 호출 
		 * 4. Tire클래스 객체 tire2를 생성해서 조상클래스 메서드를 호출한다.
		 */
		
		Tire tire = new SnowTire(); //업캐스팅
		if(tire instanceof SnowTire) {
			SnowTire snowTire = (SnowTire)tire;//다운캐스팅
			snowTire.run();//오버라이딩 된 메서드 호출
 		}
		
		Tire tire2 = new Tire(); 
		tire2.run();
	}

}
