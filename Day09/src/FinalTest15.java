class Calculator{
	double areaCircle(double r) {
		System.out.println("Calculator 클래스의 areaCircle() 메서드 실행");
		return 3.14159 * r * r;
	}
}
class Computer extends Calculator{
	double areaCircle(double r) {
		System.out.println("Computer 클래스의 areaCircle() 메서드 실행");
		return Math.PI * r * r; //더 정확한 원의 면적이 반환
	}
}
public class FinalTest15 {

	public static void main(String[] args) {
		int r = 10;
		
		Calculator calculator = new Calculator();
		System.out.println("원의 면적: " + calculator.areaCircle(r)); //인자값 전달이 10 int -> 10.0 double 타입으로 자동 형변환
		System.out.println();
		
		Computer c = new Computer();
		System.out.println("원의 넓이 : "+c.areaCircle(r)); //오버라이딩 된 메서드 호출
		
		
	}
}
