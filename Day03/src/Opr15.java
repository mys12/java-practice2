import java.util.Scanner;

public class Opr15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("영문 나라이름(ex : Korea)>> ");
		String name = sc.nextLine();
		char ch = name.charAt(0);//charAt(0)메서드는 영문 나라이름의 첫 단일 문자를 구함.
		//첫 문자를 0부터 시작
		switch(ch) {
		case 'k' : 
		case 'K' :System.out.println("대한민국");break;
		case 'j' :
		case 'J' :System.out.println("일본"); break;
		case 'a' :
		case 'A' :System.out.println("미국"); break;
		case 'c' :
		case 'C' :System.out.println("캐나다"); break;
		default : System.out.println("해당 나라 없음");break;
	
		}
		sc.close();
	}

}
