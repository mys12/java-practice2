import java.util.Scanner;

public class Opr13 {

	public static void main(String[] args) {
		/*
		 * switch(정수식) {
		 * case 값1 : 정수식과 값 1이 일치하면 실행; break;
		 * case 값2 : 정수식과 값 2가 일치하면 실행; break;
		 * ..중략..
		 * default : 해당 사항 없을 때 실행;
		 * }
		 * break 문을 만나면 switch case 다중 선택문을 종료
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("1~9사이 정수만 입력 >> ");
		int num = Integer.parseInt(scan.nextLine());
		
		if(!(1<= num && num <=9)) {
			System.out.println("1~9사이 정수만 입력하세요!");
		} else {
			switch(num) {
			case 9: System.out.println("최고 관리자");
			case 8: System.out.println("두 번째 관리자");
			case 7: System.out.println("세 번째 관리자");
			case 6: System.out.println("네 번째 관리자");
			default : System.out.println("일반 사원"); 
			}//switch case 문에서 break문이 없는 경우는 주로 관리자 권한 설정할때 많이 사용한다.
		}
		scan.close();
	}
}
