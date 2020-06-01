
public class ArrayMethod06 {

	public static void main(String[] args) {

		int[][] score = { {100,100},{90,90}};//2행 *2열의 2차원 배열원소값 초기화
		int sum = 0;
		
		//일반 이중 for 반복문으로 일괄적으로 배열원소값 출력
		for(int i=0; i<score.length; i++) { //score.length는 행의 길이 2
			for(int j=0;j<score[i].length; j++) {
				System.out.println("score["+i+"]"+"["+j+"] : "+score[i][j]);
			}
		}
		System.out.println("========================================");
		//향상된 확장 for
		for(int[] arr: score) {
			for(int k:arr) {
				System.out.print(k+" ");
				sum+= k;
			}
		}
		System.out.println("\n\t 합계  = "+ sum);
	}

}
