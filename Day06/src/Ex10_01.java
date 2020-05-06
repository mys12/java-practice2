import java.util.Scanner;

public class Ex10_01 {

	static void name() { //void형은 리턴타입이 없다.(반환값이 없다.)
		System.out.println("자기 이름 : 문영선");
	}
	
	static void guDan(int k) {
		for(int i =1; i<=9; i++) {
			System.out.println(k+" x " + i + " = " + (k*i));
		}
	}
	public static void main(String[] args) {
		name();
		Scanner sc = new Scanner(System.in);
		System.out.print("구구단(2~9 사이만 입력) >> ");
		int k = sc.nextInt();
		if(2<=k && k<=9) {
			guDan(k);
			/*
			 * 문제 ) 입력한 해당 숫자의 구구단을 출력하는 프로그램을 완성
			 */
		}else {
			System.out.println("2~9사이 정수값만 입력하세요!");
		}

		sc.close();
	}

}
