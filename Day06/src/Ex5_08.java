
public class Ex5_08 {

	public static void main(String[] args) {

		int[][] score = {
				{95,96},
				{83,92,96},
				{78,83,93,87,88}
		};
		int sum = 0;//배열 원소 누적합
		double avg = 0.0;//평균
		int cnt =0;
		/*
		 * 문제) 2차원 배열원소값의 총합과 실수 평균값을 구해보는 코드(일반 이중 for, 향상된 확장 for)
		 */
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				sum += score[i][j];
				cnt++;
			}
		}
		avg = (double)sum/cnt;
		System.out.println("총합 = " +sum);
		System.out.println("평균 = " + avg);
		
		System.out.println("---------향상된 for------------------------");
		int sum1=0;
		double avg1 =0.0;
		int cnt1=0;
		
		for(int[] s1 : score) {
			for(int s2 : s1) {
				sum1 += s2;
				cnt1++;
			}
		}
		avg1 = (double)sum1/cnt1;
		System.out.println("총합 = " +sum1);
		System.out.println("평균 = " + avg1);
	}

}
