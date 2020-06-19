
public class OprData02 {

	public static void main(String[] args) {

		byte a= 10;
		byte b= 30;
		byte c = (byte)(a*b);//int*int=int->30*10=300은 byte 타입 범위를 벗어나서 잘못된 값이 저장됨
		System.out.println("a*b 잘못된 값 = "+c);
		/*
		 * 문제 ) byte 범위를 벗어나 잘못된 값 44를 출력한다. 원하는 선택값이 출력되게 소스 수정
		 */
		int d=a*b;
		System.out.println("a*b 올바른 값 = " +d);
	
		int a2= 1000000;
		int b2= 1000000;
		long c2=a2*b2;
		System.out.println(c2);
		
		/*
		 * 문제) c2변수 값은 int 타입 범위를 벗어나서 잘못된 값 -727379968 음수값을 출력한다.
		 * long c3 변수에 a2*b2를 코드를 수정해서 정확한 곱셈결과값을 저장하고 출력하자.
		 */
		
		long c3 = (long)a2*(long)b2;//한개의 값에만 long선언해도 long*long=long으로 변환됨
		System.out.println(c3);
	}

}
