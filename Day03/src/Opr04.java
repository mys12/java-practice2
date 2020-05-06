
public class Opr04 {

	public static void main(String[] args) {

		int charCode = 'A';
		/*
		 * if 조건문 형식
		 * if(조건식) {
		 * 조건식이 참이면 실행;
		 * }
		 */
		if((charCode >=65) & (charCode<=90)) {
			System.out.println("영문 대문자");
		}
		if((97 <= charCode)&&(charCode <= 122)) {
			System.out.println("영문 소문자");
		}
		if(!(charCode<48) && !(charCode > 57)) { //47이상 57이하 일때 참
			System.out.println("0~9사이 숫자");
		}
		int value = 6;
		
		/*
		 * 문제 ) 6을 2또는 3으로 나눈 나머지값이 무엇일때 2또는 3의 배수이다.라고 출력되게 한다. 
		 */
		
		if((value%2)==0 || (value%3)==0) {
			System.out.println(value+"은 2 또는 3의 배수입니다.");
		}
		if((value%2)==0 | (value%3)==0) {
			System.out.println(value+"은 2 또는 3의 배수입니다.");
		}
	}

}
