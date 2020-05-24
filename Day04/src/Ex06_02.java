import java.util.Scanner;

public class Ex06_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 >> ");
		int num = sc.nextInt();
		for(int i=1; i<=num; i++) {
			if(i%2==1) {
				System.out.print(i + " ");
			}
		}
		System.out.println("\n-----------------------------");
		System.out.print("정수 입력 >> ");
		int num1 = sc.nextInt();
		for(int i=1;i<=num1;i+=2) {
			if(i%2==1) {
				System.out.print(i + " ");
			}
		}
		sc.close();
		System.out.println("\n-----------------------------");

		int i = 10;
		while(i>=2) {
			if(i%2==0) {
				if(i/2 != 1 ) {
					System.out.print(i + ", ");
				}else {
					System.out.print(i);
				}
			}
			i--;
		}

		System.out.println("\n-----------------------------");
		/*
		 * 문제)A-Z사이 영어 알파벳을 출력하는 프로그램 작성(for반복문)
		 */
		char a;
		for(i=65; i<=90; i++) {
			a = (char)i;
			System.out.print(a + " ");
		}
		System.out.println("\n-----------------------------");
		for(char b='A'; b<='Z'; b++) {
			System.out.print(b+ " ");
		}
	}


}
