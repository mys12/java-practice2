
public class Condi07 {

	public static void main(String[] args) {
		/*
		 * do{
		 * 조건식이 참일 동안만 반복실행;
		 * 증감식;
		 * }while(조건식);
		 * 나중에 조건식을 검사하기 때문에 조건식이 거짓이라도 무조건 한번은 반복한다.
		 * 
		 */
		int i=1;
		do {
			System.out.print(i+" ");
			i++;
		}while(i<=3);
		
		System.out.println("\n------------------------------");
		i=3;
		do {
			System.out.print(i+ " ");
			i--;
		}while(i>=1);
		System.out.println("\n---------------------------");
		
		i=1;
		do {
			System.out.println(i+ " ");
			i++;
		}while(i<0);
	}
}
