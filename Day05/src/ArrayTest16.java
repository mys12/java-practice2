
public class ArrayTest16 {

	public static void main(String[] args) {

		String strVar01 = "홍길동";
		String strVar02 = "홍길동"; //strVar01과 strVar02 변수에는 동일한 객체주소(번지주소)를 저장하고 있다.
		
		if(strVar01 == strVar02) {//참조타입변수를 ==로 비교하면 주소값을 비교한다.
		
			System.out.println("동일한 객체주소를 가리킨다.");
		}else {
			System.out.println("서로 다른 번지주소를 가리킨다.");
		}
		
		if(strVar01.equals(strVar02)) {// equals()메서드로 비교하면 문자열 내용값을 비교한다.
			System.out.println("\"홍길동\" 문자열 내용물은 같다.");
		}else {
			System.out.println("문자열 내용물은 다르다.");
		}
		System.out.println("\n================================================\n");
		String strVar03 = new String("이순신");
		String strVar04 = new String("이순신");
		//new 객체 생성 연산 키워드로 생성된 strVar03과 strVar04는 서로 다른 객체주소(번지주소)를 저장하고 있고, 내용물은  같다.
		
		if(strVar03==strVar04) {// 주소값을 비교
			System.out.println("같은 주소를 가리킨다.");
			
		}else {
			System.out.println("다른 주소를 가리킨다.");
		}
		if(strVar03.equals(strVar04)) {
			System.out.println("문자열이 같다.");
			
		}else {
			System.out.println("문자열이 다르다.");
		}
	}

}
