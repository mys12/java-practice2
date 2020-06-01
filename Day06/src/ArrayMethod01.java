
public class ArrayMethod01 {

	public static void main(String[] args) {

		sum(5);//메서드 호출
		sum(10);
		int result = abs(-10);
		System.out.println("-10의 절대값 = " + result);
	}
	
	static int abs(int data) {
		if(data<0) {
			data = -data;
		}
		return data; //return으로 abs()메서드 호출한 곳으로 최종 결과값을 반환
	}
	static void sum(int a) {
		/*
		 * 1. static 예약어로 정의된 sum()을 정적 메서드라고 한다. 
		 * 정적 메서드(클래스 메서드)는 해당 클래스 명으로 직접 접근할수 있다.
		 * Arrayethod01.sum();으로 접근 가능
		 * 하지만 같은 클래스 명 내에서는 클래스명. 은 생략 가능
		 * 2. void형은 리턴값 즉 반환타입이 없는 자료형. 리턴 타입이 없다. 
		 * 이런 경우는 해당 메서드 {} 블록내에서 실행된 문장 최종 결과값을 해당 메서드명을 호출한 곳으로 반환할 필요가 없다.
		 * 3. int a를 매개변수 즉 전달인자라고 한다. 매개변수에 저장되는 값은 인자 또는 인수값이라고 한다.
		 * 다른 말로 parameter value라고 한다.
		 */
		
		int i;//반복문 제어변수
		int sum=0;
		for(i=1; i<=a; i++) {
			sum+=i;
		}
		System.out.println("1 ~ " + a + " 까지 누적합 = " + sum);
		
	}

}
