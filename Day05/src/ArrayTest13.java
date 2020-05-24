
public class ArrayTest13 {

	public static void main(String[] args) {

		int[] score= {79, 88, 91, 33, 100, 55, 95};
		int max = score[0]; //배열의 첫번째 원소값을 최대값으로 저장
		int min = score[0]; // 최소값으로 저장
		/*
		 * 문제 ) 배열원소값에서 최대, 최소값을 구하는 알고리즘 코드를 완성
		 */
		for(int i=0; i<score.length; i++) {
			if(max<score[i]) {
				max=score[i];
			}else if(min>score[i]){
				min=score[i];
			}
		}
		System.out.println("최대값 : " + max + ", 최소값 : " +min);
		
	}

}
