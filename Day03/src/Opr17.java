import java.util.Scanner;

public class Opr17 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호 입력 (ex:970401-2222222) >> ");
		String jumin = sc.nextLine();
		char gender = jumin.charAt(7);//charAt(7)메서드는 두번째 주민번호 첫자리 단일문자 구함
		// 첫 문자를 0부터 시작
		
		switch(gender) {
		case '1' : case '3' : System.out.println("당신의 성별은 남자입니다.");
		/*
		 * 문제) 이중 switch case문을 활용하여 2000년 이전에 태어난 남자분, 여자분과 이후에 태어난 남자분, 여자분
		 * 각각 구하는 코드 작성
		 */
		switch(gender) {
		case '1' : System.out.println("2000년 이전에 태어난 남자분입니다.");break;
		case '3' : System.out.println("2000년 이후에 태어난 남자분입니다.");break;
		}break;
		case '2': case '4' : System.out.println("당신의 성별은 여자입니다.");
		switch(gender) {
		case '2' :System.out.println("2000년 이전에 태어난 여자분입니다."); break;
		case '4' : System.out.println("2000년 이후에 태어난 여자분입니다."); break;
		} break;
		default : System.out.println("유효하지 않은 주민번호입니다.");
		}
		sc.close();
	}
}
