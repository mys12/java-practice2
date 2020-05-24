
public class BreakTest01 {

	public static void main(String[] args) {

		/*
		 * break문 특징)
		 * 반복문 내에서 break문을 만나면 해당 반복문을 중지시킨다.
		 */
		int i;//반복문 제어변수
		for(i=1; i<=5;i++) {
			System.out.print(i+" ");
		}
		System.out.println("\n=======================");
		
		for(i=1; i<=5; i++) {
			if(i%3==0) {
				break; //반복문 중단
			}
			System.out.println(i+" ");
		}
	}

}
