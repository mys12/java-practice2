
public class ArrayTest17 {

	public static void main(String[] args) {

		int[] scores = {80,100,90};
		for(int i=0;i<scores.length; i++) {
			System.out.println("scores["+ i + "] : "+scores[i]);
		}
		
		int sum=0;
		for(int a : scores) {
			sum += a;
		}
		
		double avg=(double)sum/scores.length;
		System.out.println("총합 = "+sum);
		System.out.println("평균 = "+avg);
	}

}
