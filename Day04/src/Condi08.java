import java.util.Scanner;

public class Condi08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input;
		System.out.println("메시지 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요!");
		do {
			System.out.print(">> ");
			input = sc.nextLine();
			System.out.println(input);
		}while(!input.equals("q"));//입력값이 q일때 반복문 종료
		System.out.println();
		System.out.println("프로그램 종료");
		sc.close();
	}

}
