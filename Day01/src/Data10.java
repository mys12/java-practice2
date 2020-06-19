
public class Data10 {

	public static void main(String[] args) {
		
		int i = 128;
		
		if((i<Byte.MIN_VALUE)||(i>Byte.MAX_VALUE)) {
			/*
			 * if else 조건문
			 * if(조건식){
			 * 조건식이 참이면 실행;
			 * }else {
			 * 조거식이 거짓이면 실행;
			 * }
			 * <(~보다 작다 비교연산자 기호), > (~보다 크다 비교연산자 기호)
			 * || (논리 연산자에서 논리합) : 두개의 조건중 하나라도 참이면 결과값은 true
			 * Byte.MIN_VALUE는 byte 기본 정수자료형이 최소값, Byte.Max_VALUE는 최대값
			 * 
			 */
			System.out.println("byte 타입으로 형변환을 할 수 없다. 다시 한번 더 값을 확인하세요!");
		} else {
			 byte b =(byte)i;//명시적인 강제 형변환
			 System.out.println(b);
		}
		System.out.println("===================================");
		
		int num01 = 1234567890;
		int num02 = 1234567890;
		
		double num03= num02;//자동 형변환
		num02=(int)num03; //명시적인 형변환
		int result = num01-num02; // -기호는 뺄셈 산술 연산기호
		System.out.println(result);
	}

}
