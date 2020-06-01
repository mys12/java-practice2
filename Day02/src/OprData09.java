import java.util.Scanner;

public class OprData09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력 >> ");
		int age = sc.nextInt();//정수 숫자로 입력
		String result = "";
		result = (10<= age && age <=19) ? "10대" : "10대 아님";
		
		System.out.println(age+"세는 "+result);
		
		char ch = 'b';
		result = ('A' <= ch && ch <= 'Z') ? "영문 대문자" : "영문 소문자";
		System.out.println(ch+"는 "+result);
		sc.close();
	}
}
