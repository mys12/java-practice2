
public class ArrayMethod04 {
	
	static void getSum(int[] score) {
		int sum=0;
		double avg=0.0;
		for(int i=0; i<score.length; i++) {
			sum+=score[i];
		}
		avg = (double)sum/score.length;
		
		System.out.println("총점 = " + sum + ", 평균 = "+avg);
	}

	public static void main(String[] args) {

		int[] score = {100,90,80};
		/*
		 * 문제) 정적메서드 static void getSum(int[] arr){}을 선언하고 해당 메서드를 호출했을 때 int 타입 총점과 double 타입 평균을 구해서 출력하는 코드
		 */
		getSum(score);
		
	}
	

}
