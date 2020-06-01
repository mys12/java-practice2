import java.util.Scanner;

public class Opr08 {

	public static void main(String[] args) {

		int x = 10;
		int y = 5;
		
		System.out.println((x>7) && (y<=5));// true&&true = true
		System.out.println((x%3 ==2) || (y%2!=1)); // false||false = false
		System.out.println("--------------------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 >> ");
		int num = sc.nextInt();
		String result = ((num%2) ==0) ? "짝수이다" : "홀수이다";
		System.out.println(num + "은(는) " + result);
		
		sc.close();
	}

}
