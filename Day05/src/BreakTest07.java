import java.util.Random;

public class BreakTest07 {

	public static void main(String[] args) {
		/*
		 * 문제)while 무한루프문을 사용하여 주사위 번호 1~6까지 무한 난수를 발생시켜
		 * 출력하고, 주사위번호중 6이 발생했을때 무한 루프문을 중단시키는 코드를 작성
		 */
		while(true) {
			int ran1 = (int)(Math.random()*6)+1;
			System.out.println("주사위 번호 " + ran1 + "이(가) 나왔습니다.");
			System.out.println();
			if(ran1==6) {
				System.out.println("주사위 번호가 6이므로 프로그램 종료!");
				break;
			}
		}
		System.out.println();
		System.out.println("=======================================");
		System.out.println();
		/*
		 * for 무한 루프문을 사용하여 주사위 번호 1~6까지 무한 난수를 발생시켜 출력하고, 
		 * 주사위 번호중 4가 발생했을때 for 반복문을 중단시킨다. 단 Math.random()메서드를 사용 x 
		 */
		Random random = new Random();
		for(;;) {
			int ran2 = random.nextInt(6)+1;
			System.out.println("주사위 번호 >>" + ran2);
			System.out.println();
			if(ran2==4) {
				System.out.println("프로그램 종료!");
				break;
			}
		}
	}
}
