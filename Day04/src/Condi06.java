
public class Condi06 {

	public static void main(String[] args) {

		int i;
		for(i=1;i<=5;i++) {
			System.out.print(i+ " ");
		}
		System.out.println("\n-------------------------");
		i =1;
		while(i<=3) {
			System.out.print(i+"\t");// \t는 탭키만큼 수평으로 띄움
			i++;
		}
		System.out.println("\n-------------------------");
		i=3;
		while(i>=1) {
			System.out.print(i+"\t");
			i--;
		}
		System.out.println("\n-------------------------");
		
		
		/*
		 * 문제)while 반복문 하나 안에 if else 조건문을 활용하여 1부터 10까지 자연수 중에서
		 * 홀수 누적합과 짝수 누적합을 각각 구해서 출력한다.
		 */
		int sumO=0, sumE=0;
		i=1;

		while(i<=10) {
			if(i%2 == 0) {
				sumE += i;
			}else {
				sumO += i;
			}
			i++;
		}
		System.out.println("최종 짝수의 누적 합 :" + sumE + ", 최종 홀수의 누적 합 :" +sumO);
	}

}
