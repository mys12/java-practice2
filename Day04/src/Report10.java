
public class Report10 {

	public static void main(String[] args) {

		/*
		 * 과제물 1) 이중 for 반복문을 사용하여 다음과 같이 출력되게 하시오.
		 * 출력 ex) *
		 * 		  **
		 * 		  ***
		 * 		  ****
		 *        *****	
		 */
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("========================================================================");
		System.out.println();
		/*
		 * 과제물 2) 이중 for 반복문을 사용하여 다음과 같이 구구단을 출력하게 하고 while반복문을 사용하여 구구단 제목을 출력되게 하시오
		 * 출력 ex) 2단 	3단 	...	8단 	9단
		 * 		  2*1=2 3*1=3 ...   9*1=9
		 *  	  ...   ....
		 *  
		 */
		int j=2;
		while(j<=9) {
			System.out.print(j+ "단 \t");
			j++;
		}
		System.out.println();
		System.out.println();
		for(int i=1; i<=9; i++) {
			for(j=2; j<=9; j++) {
				System.out.print(j+"*"+i +"=" + j*i + "\t");
			}
			System.out.println();
		}
		
	}

}
