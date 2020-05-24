
public class Data11 {

	public static void main(String[] args) {

		/* 문제 1
		 * 컴파일 에러를 디버깅해서 실행되는 프로그램으로 만든다.
		 * 에러난 이유도 주석문 처리한다.
		 */
		byte a = 10;
		byte b = 20;
		byte result = (byte)(a+b);
//		int result = a+b;
		System.out.println(result);
		// console 에러 >> Type mismatch: cannot convert from int to byte
		/*
		 * 에러난 이유 :
		 * a+b를 하면 int형으로 자동형변환 되기 때문에 byte형인 result에 값이 저장될 수 없다.
		 * 따라서 a+b를 byte형으로 강제형변환시켜야한다.
		 */
		
		/*
		 * byte+byte는 자동 산술법에 의해서 가장 덧셈 연산 속도가 빠른 int형으로 자동형변환 해서 덧셈연산을 수행한다.
		 * 결국 int+int는 int 결과로 나온다.
		 */
		
		System.out.println("--------------------------------------------------------------");
		/*
		 * ch01+ch02 덧셈연산을 수행한 결과값 66을 출력하게 하고, 이 값을 캐스팅해서 단일문자 B를 출력하게한다.
		 * 추가 코드 완성시킨다.
		 */
		char ch01='A';
		char ch02=1;
		int sum = ch01+ch02; //int+int=int -> 65+1=66
		System.out.println("\'ch01+ch02\'의 결과값 : " + sum);
		char ch03 = (char)sum;
		System.out.println("캐스팅 결과값 : " +ch03); //66에 해당하는 문자열 B
		
		System.out.println("--------------------------------------------------------------");
		
	}

}
