
public class Data12 {

	public static void main(String[] args) {
		int intValue = 10;
		int result = intValue/4; //정수  숫자값을 나눗셈(/)하면 몫만 구함.
		System.out.println("나눈 몫  = " + result);
		double result02 = intValue/4.0; //int+double->double / double-> 실수 숫자를 나눗셈하면 몫과 나머지를 함께 구함.
		System.out.println("나눈 몫과 나머지 : " +result02);
		
		byte byteValue = 10;
		int re01 = byteValue + byteValue; //  byte+byte -> int+int = int
		System.out.println(re01);
		
		re01 =5+ byteValue; //int+byte -> int+int=int
		System.out.println(re01);
		
		float floatValue = 2.5f;
		float re03 = 5+floatValue; // int+float -> float+float-> 5.0f+2.5f=7.5f
		System.out.println(re03);
		
		double doubleValue = 2.5d; //d(D) 값뒤의 접미사 생략 가능. 
		// 자바에서 실수숫자 기본타입은 double
		double re05 = 5+doubleValue; //5.0+2.5=7.5
		System.out.println(re05);
	}

}
