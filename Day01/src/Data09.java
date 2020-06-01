
public class Data09 {

	public static void main(String[] args) {

		long longValue = 500L;
		int intValue = (int)longValue; //(int) 캐스팅(형변환)연산자를 사용하여 명시적인 강제
		// 형 변환. long->int
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int)doubleValue; //3.14에서 소수점이하는 버리고 정수숫자값만 좌측 변수에 저장됨
		System.out.println(intValue);
	
		doubleValue = 85.9;
		intValue = (int)doubleValue;//반올림 하지 않고 소수점 이하는 버리고 정수값만 취함.
		System.out.println(intValue);
	}
	

}
