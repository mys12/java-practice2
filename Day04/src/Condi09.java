
public class Condi09 {

	public static void main(String[] args) {

		int dan;
		int j;
		for(dan=2; dan<=9;dan++) {
			System.out.println("**"+dan+"단**");
			for(j=1;j<=9;j++) {
				System.out.println(dan+" x " + j+" = "+ (dan*j));
			}
			System.out.println("\n-----------------------");
		}
		
		//별표 ***** 5개씩 각 행에 출력
		for(int i =1; i<=5; i++) {
			for(j=1;j<=5;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("\n-----------------------");
	}

}
