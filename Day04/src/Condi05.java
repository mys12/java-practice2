import java.util.Scanner;

public class Condi05 {

	public static void main(String[] args) {

		int i;//for 반복문 제어변수
		int total = 0;//누적합
		
		for(i=1; i<=5; i++) {
			total = total+i;
		}
		System.out.println("누적합 = "+total);
		System.out.println("------------------------");
		
		/*
		 *문제 )
		 *문자와 숫자를 입력받아 문자를 입력받은 숫자만큼 반복 출력 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 입력 >> ");
		String str = sc.nextLine();
		System.out.print("숫자 입력 >> ");
		int num = sc.nextInt();
		for(i=1; i<=num; i++) {
			System.out.println(i+"번 "+str+ " 반복");
		}
		
		/*
		 * 문제) 반복문 한개만 사용하여 다음과 같이 출력되게 코드를 작성
		 * 출력 예 ) 1 5
		 *        2 4 
		 *        3 3
		 *        4 2
		 *        5 1  
		 */
		System.out.println("------------------------------");
		int j;
		for(i=1; i<=5; i++) {
			System.out.println(i+" "+(6-i));
		}
		for(i=1,j=5; i<=5;i++,j--) {
			System.out.println(i+" "+j);
		}
		sc.close();
	}

}
