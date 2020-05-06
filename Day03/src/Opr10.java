import java.util.Scanner;

public class Opr10 {

	public static void main(String[] args) {

		/*
		 * 문제) 스캐너를 이용해서 정수 숫자를 입력받아서 입력받은 값이 0인지 아닌지 판별하는 코드를 작성
		 * if~ else 문을 사용
		 */
		
		Scanner scan = new Scanner(System.in);
//		System.out.print("정수 숫자 입력 >> ");
//		int num = scan.nextInt();
//		if(num == 0 ) {
//			System.out.println("0을 입력 받았습니다!");
//		} else {
//			System.out.println("0이 아닙니다!");
//		}
		
//		String temp = scan.nextLine(); //  문자열로 입력받음
//		int number = Integer.parseInt(temp); // parseInt() 메서드로 정수 숫자로 변경
//		if(number == 0 ) {
//			System.out.println("0을 입력 받았습니다!");
//		} else {
//			System.out.println("0이 아닙니다!");
//		}
		System.out.println("----------------------------------------");
		System.out.print("첫번째 정수 숫자입력 >> ");
		int a = Integer.parseInt(scan.nextLine());
		System.out.print("두번재 정수 숫자 입력 >> ");
		int b = Integer.parseInt(scan.nextLine());//입력받은 문자를 정수 숫자로 변경
		
		int max = 0; //최대값
		int min = 0; //최소값
		
		if(a>b) {
			max = a; min=b;
		}else {
			max=b; min=a;
		}//if else
		
		System.out.println("최대값 = " +max+", 최소값 = "+min);
		scan.close();
		
	}

}
