import java.util.Scanner;

public class Opr12 {

	public static void main(String[] args) {

		/*
		 * 문제 ) 스캐너를 사용하여 0~100 사이 점수값만 입력되게 하고, 아니면 유효성 검증 처리
		 * 입력하신 점수를 기반으로 if ~else if ~ 다중조건문을 활용하여 A+, A-, A0, B+,B-,B0,,,D+,D0,D-, F학점을 각각 구하는 코드를 작성
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 >> ");
		int score = sc.nextInt();
		char g = ' ';
		char opt =' ';

		boolean mod1 = score %10 > 5;
		boolean mod2 = score %10 >= 5;

		if(!(score>=0)&&(score<=100)) {
			System.out.println("0~100 사이 점수 값을 입력 하세요!");
		} else {
			if(score/10 == 9) {
				g = 'A';
				if(mod1) {
					opt = '+';
				} else if(mod2) {
					opt = '0';
				}else {
					opt= '-';
				}
			}else if(score/10 == 8) {
				g = 'B';
				if(mod1) {
					opt = '+';
				} else if(mod2) {
					opt = '0';
				}else {
					opt= '-';
				}
			} else if(score/10 == 7) {
				g = 'C';
				if(mod1) {
					opt = '+';
				} else if(mod2) {
					opt = '0';
				}else {
					opt= '-';
				}
			} else if(score/10 ==6) {
				g = 'D';
				if(mod1) {
					opt = '+';
				} else if(mod2) {
					opt = '0';
				}else {
					opt= '-';
				}
			} else {
				g = 'F';
			}
			System.out.println(score+"점은 "+ g+opt+ "학점입니다.");
		}
	
		sc.close();
	}

}
