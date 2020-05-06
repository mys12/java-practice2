import java.util.Scanner;

public class BreakTest06 {

	public static void main(String[] args) {

		int menu = 0;
		int num=0;
		Scanner sc = new Scanner(System.in);
		
		outer: //이중 반복문을 중단하기 위한 라벨명
			while(true) {
				System.out.println("1.곱셈");
				System.out.println("2.덧셈");
				System.out.println("3.뺄셈");
				System.out.print("원하는 메뉴(1~3)를 선택하세요.(종료:0) >> ");
				
				menu = Integer.parseInt(sc.nextLine());
				
				if(menu == 0) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}else if(!(1<=menu&&menu<=3)) {
					System.out.print("메뉴를 잘못 선택했습니다.(종료:0)");
					continue;//아래 문장을 실행 안함
				}
				
				for(;;) {
					System.out.print("계산할 값을 입력 .(계산 종료: 0, 전체 종료:99)>> ");
					num = Integer.parseInt(sc.nextLine());
					if(num == 0) {
						break;//for 중단
					}else if(num == 99) {
						break outer;
					}
					switch(menu) {
					case 1: System.out.println("result="+(num*num));break;
					case 2: System.out.println("result="+(num+num));break;
					case 3: System.out.println("result="+(num-num));break;
					}
				}//for 반복문 무한 루프(Loop:반복)
				
				
			}//무한 while 반복문
			
	}

}
