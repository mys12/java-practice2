import java.util.Scanner;

public class Opr16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("현재 월을 입력 >> ");
		int mon = sc.nextInt();
		
		if(!(1<=mon&&mon<=12)) {
			System.out.println("1월부터 12월 사이만 입력하세요!");
		}else {
			switch(mon) {
			case 3: case 4: case 5: System.out.println("봄");break;
			case 6: case 7: case 8: System.out.println("여름");break;
			case 9: case 10: case 11: System.out.println("가을");break;
			default : System.out.println("겨울"); break;
			}//switch case
			
			System.out.println("========================");
			/*
			 * 문제) 위의 switch case 문을 if else if다중 조건선택문을 변경하는 코드를 작성
			 */
			System.out.print("현재 월을 입력 >> ");
			int month = sc.nextInt();
			if(!(1<=month&&month<=12)) {
				System.out.println("1월부터 12월 사이만 입력하세요!");
			} else {
				if(3<=month&&month<=5) {
					System.out.println("봄");
				}else if(6<=month&&month<=8) {
					System.out.println("여름");
				}else if(9<=month&&month<=11) {
					System.out.println("가을");
				} else {
					System.out.println("겨울");
				}
			}
		}//if else
		sc.close();
	}

}
